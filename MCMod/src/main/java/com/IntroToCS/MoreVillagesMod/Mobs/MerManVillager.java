package com.IntroToCS.MoreVillagesMod.Mobs;

import com.IntroToCS.MoreVillagesMod.References;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MerManVillager extends EntityVillager 
{
	public MerManVillager(World worldIn) 
	{
		super(worldIn);
		this.setSize(1.0F,2.0F);
		//add navigator
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this,2.0D));
		this.tasks.addTask(2, new EntityAIWander(this,1.3D));
	}
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.9D);		
	}
	public boolean isPushedByWater()
	{
		return false;
	}
	public void onLivingUpdate()
	{
		// general update
		super.onLivingUpdate();
		this.setAir(300);
		// stops flailing limbs in water
		this.limbSwing = 0;
		this.limbSwingAmount = 0;
		this.prevLimbSwingAmount = this.limbSwing;
		//kill it if it is not in water 
		if(!this.isInWater())
		{
			this.kill();
		}
	}
	public boolean canBreathUnderwater()
	{
		return true;
	}
	protected String getLivingSound()
	{
		return "mob.villager.say";
	}

}
