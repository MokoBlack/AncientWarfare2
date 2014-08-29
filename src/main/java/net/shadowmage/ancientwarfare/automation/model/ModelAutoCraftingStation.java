//auto-generated model template
//template generated by MEIM
//template v 1.0
//author Shadowmage45 (shadowage_catapults@hotmail.com)
 
package net.shadowmage.ancientwarfare.automation.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.shadowmage.ancientwarfare.core.model.crafting_table.ModelCraftingBase;
 
 
public class ModelAutoCraftingStation  extends ModelCraftingBase
{
 
ModelRenderer tableTop;
ModelRenderer leg1;
ModelRenderer leg2;
ModelRenderer leg3;
ModelRenderer leg4;
ModelRenderer paperLarge;
ModelRenderer hammerHead1;
ModelRenderer hammerClaw1;
ModelRenderer hammerClaw2;
ModelRenderer hammerHead2;
ModelRenderer hammerHead3;
ModelRenderer hammerHandle;
ModelRenderer sawBlade1;
ModelRenderer sawHandle1;
ModelRenderer sawHandle2;
ModelRenderer sawHandle3;
ModelRenderer sawHandle4;
ModelRenderer sawBlade2;
ModelRenderer sawTooth1;
ModelRenderer sawTooth2;
ModelRenderer sawTooth3;
ModelRenderer sawTooth4;
ModelRenderer sawTooth5;
ModelRenderer sawTooth6;
ModelRenderer sawTooth7;
ModelRenderer sawTooth8;
ModelRenderer sawTooth9;

public ModelAutoCraftingStation(){
  tableTop = new ModelRenderer(this,"tableTop");
  tableTop.setTextureOffset(0,0);
  tableTop.setTextureSize(128,128);
  tableTop.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(tableTop,0.0f, 0.0f, 0.0f);
  tableTop.addBox(-8.0f,-14.0f,-8.0f,16,1,16);
  leg1 = new ModelRenderer(this,"leg1");
  leg1.setTextureOffset(0,18);
  leg1.setTextureSize(128,128);
  leg1.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(leg1,0.0f, 0.0f, 0.0f);
  leg1.addBox(-7.0f,-13.0f,5.0f,2,13,2);
  tableTop.addChild(leg1);
  leg2 = new ModelRenderer(this,"leg2");
  leg2.setTextureOffset(9,18);
  leg2.setTextureSize(128,128);
  leg2.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(leg2,0.0f, 0.0f, 0.0f);
  leg2.addBox(-7.0f,-13.0f,-7.0f,2,13,2);
  tableTop.addChild(leg2);
  leg3 = new ModelRenderer(this,"leg3");
  leg3.setTextureOffset(18,18);
  leg3.setTextureSize(128,128);
  leg3.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(leg3,0.0f, 0.0f, 0.0f);
  leg3.addBox(5.0f,-13.0f,-7.0f,2,13,2);
  tableTop.addChild(leg3);
  leg4 = new ModelRenderer(this,"leg4");
  leg4.setTextureOffset(27,18);
  leg4.setTextureSize(128,128);
  leg4.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(leg4,0.0f, 0.0f, 0.0f);
  leg4.addBox(5.0f,-13.0f,5.0f,2,13,2);
  tableTop.addChild(leg4);
  paperLarge = new ModelRenderer(this,"paperLarge");
  paperLarge.setTextureOffset(65,0);
  paperLarge.setTextureSize(128,128);
  paperLarge.setRotationPoint(0.0f, -14.01f, 0.0f);
  setPieceRotation(paperLarge,0.0f, -0.052359793f, 0.0f);
  paperLarge.addBox(-6.0f,0.0f,-6.0f,12,0,12);
  tableTop.addChild(paperLarge);
  hammerHead1 = new ModelRenderer(this,"hammerHead1");
  hammerHead1.setTextureOffset(36,18);
  hammerHead1.setTextureSize(128,128);
  hammerHead1.setRotationPoint(-5.0f, -14.25f, 5.0f);
  setPieceRotation(hammerHead1,0.09599306f, 0.3665189f, 0.069813065f);
  hammerHead1.addBox(0.0f,-2.0f,0.0f,2,2,1);
  hammerClaw1 = new ModelRenderer(this,"hammerClaw1");
  hammerClaw1.setTextureOffset(36,22);
  hammerClaw1.setTextureSize(128,128);
  hammerClaw1.setRotationPoint(0.125f, -2.25f, 0.0f);
  setPieceRotation(hammerClaw1,3.120892E-9f, -0.26179937f, 0.0f);
  hammerClaw1.addBox(-2.0f,0.0f,0.0f,2,1,1);
  hammerHead1.addChild(hammerClaw1);
  hammerClaw2 = new ModelRenderer(this,"hammerClaw2");
  hammerClaw2.setTextureOffset(36,25);
  hammerClaw2.setTextureSize(128,128);
  hammerClaw2.setRotationPoint(0.125f, -0.75f, 0.0f);
  setPieceRotation(hammerClaw2,3.120892E-9f, -0.26179937f, 0.0f);
  hammerClaw2.addBox(-2.0f,0.0f,0.0f,2,1,1);
  hammerHead1.addChild(hammerClaw2);
  hammerHead2 = new ModelRenderer(this,"hammerHead2");
  hammerHead2.setTextureOffset(36,28);
  hammerHead2.setTextureSize(128,128);
  hammerHead2.setRotationPoint(2.0f, -1.5f, 0.0f);
  setPieceRotation(hammerHead2,0.0f, 0.0f, 0.0f);
  hammerHead2.addBox(0.0f,0.0f,0.0f,1,1,1);
  hammerHead3 = new ModelRenderer(this,"hammerHead3");
  hammerHead3.setTextureOffset(36,31);
  hammerHead3.setTextureSize(128,128);
  hammerHead3.setRotationPoint(0.5f, -0.5f, -0.5f);
  setPieceRotation(hammerHead3,0.0f, 0.0f, 0.0f);
  hammerHead3.addBox(0.0f,0.0f,0.0f,1,2,2);
  hammerHead2.addChild(hammerHead3);
  hammerHead1.addChild(hammerHead2);
  hammerHandle = new ModelRenderer(this,"hammerHandle");
  hammerHandle.setTextureOffset(43,18);
  hammerHandle.setTextureSize(128,128);
  hammerHandle.setRotationPoint(0.5f, -1.5f, -1.0f);
  setPieceRotation(hammerHandle,0.0f, 0.0f, 0.0f);
  hammerHandle.addBox(0.0f,0.0f,-7.5f,1,1,10);
  hammerHead1.addChild(hammerHandle);
  tableTop.addChild(hammerHead1);
  sawBlade1 = new ModelRenderer(this,"sawBlade1");
  sawBlade1.setTextureOffset(0,34);
  sawBlade1.setTextureSize(128,128);
  sawBlade1.setRotationPoint(5.0f, -15.0f, -2.0f);
  setPieceRotation(sawBlade1,0.0f, 0.0f, 0.0f);
  sawBlade1.addBox(0.0f,0.0f,0.0f,1,1,9);
  sawHandle1 = new ModelRenderer(this,"sawHandle1");
  sawHandle1.setTextureOffset(0,45);
  sawHandle1.setTextureSize(128,128);
  sawHandle1.setRotationPoint(-3.0f, 0.0f, -1.0f);
  setPieceRotation(sawHandle1,0.0f, 0.0f, 0.0f);
  sawHandle1.addBox(0.0f,0.0f,0.0f,4,1,1);
  sawBlade1.addChild(sawHandle1);
  sawHandle2 = new ModelRenderer(this,"sawHandle2");
  sawHandle2.setTextureOffset(0,48);
  sawHandle2.setTextureSize(128,128);
  sawHandle2.setRotationPoint(-3.0f, 0.0f, -3.0f);
  setPieceRotation(sawHandle2,0.0f, 0.0f, 0.0f);
  sawHandle2.addBox(0.0f,0.0f,0.0f,4,1,1);
  sawBlade1.addChild(sawHandle2);
  sawHandle3 = new ModelRenderer(this,"sawHandle3");
  sawHandle3.setTextureOffset(0,51);
  sawHandle3.setTextureSize(128,128);
  sawHandle3.setRotationPoint(-3.0f, 0.0f, -2.0f);
  setPieceRotation(sawHandle3,0.0f, 0.0f, 0.0f);
  sawHandle3.addBox(0.0f,0.0f,0.0f,1,1,1);
  sawBlade1.addChild(sawHandle3);
  sawHandle4 = new ModelRenderer(this,"sawHandle4");
  sawHandle4.setTextureOffset(5,51);
  sawHandle4.setTextureSize(128,128);
  sawHandle4.setRotationPoint(0.0f, 0.0f, -2.0f);
  setPieceRotation(sawHandle4,0.0f, 0.0f, 0.0f);
  sawHandle4.addBox(0.0f,0.0f,0.0f,1,1,1);
  sawBlade1.addChild(sawHandle4);
  sawBlade2 = new ModelRenderer(this,"sawBlade2");
  sawBlade2.setTextureOffset(21,34);
  sawBlade2.setTextureSize(128,128);
  sawBlade2.setRotationPoint(1.0f, 0.01f, 9.0f);
  setPieceRotation(sawBlade2,0.0f, 0.10471966f, 0.0f);
  sawBlade2.addBox(-2.0f,0.0f,-10.0f,2,1,10);
  sawTooth1 = new ModelRenderer(this,"sawTooth1");
  sawTooth1.setTextureOffset(0,54);
  sawTooth1.setTextureSize(128,128);
  sawTooth1.setRotationPoint(-2.0f, 0.51f, -0.75f);
  setPieceRotation(sawTooth1,0.0f, 0.7853982f, 0.0f);
  sawTooth1.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth1);
  sawTooth2 = new ModelRenderer(this,"sawTooth2");
  sawTooth2.setTextureOffset(0,54);
  sawTooth2.setTextureSize(128,128);
  sawTooth2.setRotationPoint(-2.0f, 0.51f, -1.75f);
  setPieceRotation(sawTooth2,0.0f, 0.7853982f, 0.0f);
  sawTooth2.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth2);
  sawTooth3 = new ModelRenderer(this,"sawTooth3");
  sawTooth3.setTextureOffset(0,54);
  sawTooth3.setTextureSize(128,128);
  sawTooth3.setRotationPoint(-2.0f, 0.51f, -2.75f);
  setPieceRotation(sawTooth3,0.0f, 0.7853982f, 0.0f);
  sawTooth3.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth3);
  sawTooth4 = new ModelRenderer(this,"sawTooth4");
  sawTooth4.setTextureOffset(0,54);
  sawTooth4.setTextureSize(128,128);
  sawTooth4.setRotationPoint(-2.0f, 0.51f, -3.75f);
  setPieceRotation(sawTooth4,0.0f, 0.7853982f, 0.0f);
  sawTooth4.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth4);
  sawTooth5 = new ModelRenderer(this,"sawTooth5");
  sawTooth5.setTextureOffset(0,54);
  sawTooth5.setTextureSize(128,128);
  sawTooth5.setRotationPoint(-2.0f, 0.51f, -4.75f);
  setPieceRotation(sawTooth5,0.0f, 0.7853982f, 0.0f);
  sawTooth5.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth5);
  sawTooth6 = new ModelRenderer(this,"sawTooth6");
  sawTooth6.setTextureOffset(0,54);
  sawTooth6.setTextureSize(128,128);
  sawTooth6.setRotationPoint(-2.0f, 0.51f, -5.75f);
  setPieceRotation(sawTooth6,0.0f, 0.7853982f, 0.0f);
  sawTooth6.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth6);
  sawTooth7 = new ModelRenderer(this,"sawTooth7");
  sawTooth7.setTextureOffset(0,54);
  sawTooth7.setTextureSize(128,128);
  sawTooth7.setRotationPoint(-2.0f, 0.51f, -6.75f);
  setPieceRotation(sawTooth7,0.0f, 0.7853982f, 0.0f);
  sawTooth7.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth7);
  sawTooth8 = new ModelRenderer(this,"sawTooth8");
  sawTooth8.setTextureOffset(0,54);
  sawTooth8.setTextureSize(128,128);
  sawTooth8.setRotationPoint(-2.0f, 0.51f, -7.75f);
  setPieceRotation(sawTooth8,0.0f, 0.7853982f, 0.0f);
  sawTooth8.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth8);
  sawTooth9 = new ModelRenderer(this,"sawTooth9");
  sawTooth9.setTextureOffset(0,54);
  sawTooth9.setTextureSize(128,128);
  sawTooth9.setRotationPoint(-2.0f, 0.51f, -8.75f);
  setPieceRotation(sawTooth9,0.0f, 0.7853982f, 0.0f);
  sawTooth9.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
  sawBlade2.addChild(sawTooth9);
  sawBlade1.addChild(sawBlade2);
  tableTop.addChild(sawBlade1);
  }
 
@Override
public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6)
  {
  super.render(entity, f1, f2, f3, f4, f5, f6);
  setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
  tableTop.render(f6);
  }
 
public void setPieceRotation(ModelRenderer model, float x, float y, float z)
  {
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
  }

@Override
public void renderModel()
  {
  tableTop.render(0.0625f);  
  }

}
