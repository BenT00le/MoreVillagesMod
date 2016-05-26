package com.IntroToCS.MoreVillagesMod.Mobs;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VillagerModeler extends ModelBiped 
{
	//fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Arm_Right;
    ModelRenderer Arm_Left;
    ModelRenderer Leg_left;
    ModelRenderer Leg_Right;
    public VillagerModeler(float f)
    {
      textureWidth = 64;
      textureHeight = 64;
      
        Body = new ModelRenderer(this, 0, 0);
        Body.addBox(0F, 0F, 0F, 8, 1, 0);
        Body.setRotationPoint(-4F, 13.5F, -1F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 0);
        Head.addBox(0F, 0F, 0F, 0, 1, 4);
        Head.setRotationPoint(4F, 13.5F, -5F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Arm_Right = new ModelRenderer(this, 0, 0);
        Arm_Right.addBox(0F, 0F, 0F, 0, 8, 4);
        Arm_Right.setRotationPoint(4F, 10.5F, -9F);
        Arm_Right.setTextureSize(64, 32);
        Arm_Right.mirror = true;
        setRotation(Arm_Right, 0F, 0F, 0F);
        Arm_Left = new ModelRenderer(this, 0, 0);
        Arm_Left.addBox(0F, 0F, 0F, 8, 0, 4);
        Arm_Left.setRotationPoint(-4F, 10.53333F, -9F);
        Arm_Left.setTextureSize(64, 32);
        Arm_Left.mirror = true;
        setRotation(Arm_Left, 0F, 0F, 0F);
        Leg_left = new ModelRenderer(this, 0, 0);
        Leg_left.addBox(-3F, -3F, -2F, 8, 8, 0);
        Leg_left.setRotationPoint(-1F, 13.5F, -7F);
        Leg_left.setTextureSize(64, 32);
        Leg_left.mirror = true;
        setRotation(Leg_left, 0F, 0F, 0F);
        Leg_Right = new ModelRenderer(this, 16, 14);
        Leg_Right.addBox(-3F, -5F, 0F, 2, 2, 1);
        Leg_Right.setRotationPoint(0F, 13.5F, -7F);
        Leg_Right.setTextureSize(64, 32);
        Leg_Right.mirror = true;
        setRotation(Leg_Right, 0F, 0F, 0F);
    }
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.render(entity, f, f1, f2, f3, f4, f5);
      setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      Body.render(f5);
      Head.render(f5);
      Arm_Right.render(f5);
      Arm_Left.render(f5);
      Leg_left.render(f5);
      Leg_Right.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
    }
}
