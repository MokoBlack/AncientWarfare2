package net.shadowmage.ancientwarfare.automation.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.shadowmage.ancientwarfare.automation.tile.worksite.TileWorksiteBounded;
import net.shadowmage.ancientwarfare.automation.tile.worksite.TileWorksiteUserBlocks;
import net.shadowmage.ancientwarfare.core.config.AWLog;
import net.shadowmage.ancientwarfare.core.container.ContainerBase;
import net.shadowmage.ancientwarfare.core.interfaces.IWorkSite;
import net.shadowmage.ancientwarfare.core.util.BlockPosition;

public class ContainerWorksiteBoundsAdjust extends ContainerBase
{

public int x, y, z;
public BlockPosition min, max;
public IWorkSite worksite;

public ContainerWorksiteBoundsAdjust(EntityPlayer player, int x, int y, int z)
  {
  super(player, x, y, z);
  this.x = x;
  this.y = y;
  this.z = z;
  TileEntity te = player.worldObj.getTileEntity(x, y, z);
  worksite = (IWorkSite)te;
  min = worksite.getWorkBoundsMin().copy();
  max = worksite.getWorkBoundsMax().copy();  
  }

@Override
public void sendInitData()
  {
  if(worksite instanceof TileWorksiteUserBlocks)
    {
    TileWorksiteUserBlocks twub = (TileWorksiteUserBlocks)worksite;
    NBTTagCompound tag = new NBTTagCompound();
    tag.setByteArray("checkedMap", twub.getTargetMap());
    sendDataToGui(tag);
    }
  }

@Override
public void handlePacketData(NBTTagCompound tag)
  {
  AWLog.logDebug("receiving packet on container...server: "+!player.worldObj.isRemote);
  if(tag.hasKey("guiClosed") && worksite instanceof TileWorksiteBounded)
    {
    TileWorksiteBounded twb = (TileWorksiteBounded)worksite;
    if(tag.hasKey("min") && tag.hasKey("max"))
      {
      AWLog.logDebug("setting bounds");
      BlockPosition min = new BlockPosition(tag.getCompoundTag("min"));
      BlockPosition max = new BlockPosition(tag.getCompoundTag("max"));
      twb.setWorkBoundsMin(min);
      twb.setWorkBoundsMax(max);
      twb.onBoundsAdjusted();
      }
    if(tag.hasKey("checkedMap") && worksite instanceof TileWorksiteUserBlocks)
      {
      AWLog.logDebug("setting target blocks");
      TileWorksiteUserBlocks twub = (TileWorksiteUserBlocks)worksite;
      byte[] map = tag.getByteArray("checkedMap");
      twub.setTargetBlocks(map);
      twub.onTargetsAdjusted();
      }
    player.worldObj.markBlockForUpdate(x, y, z);
    }
  }

}
