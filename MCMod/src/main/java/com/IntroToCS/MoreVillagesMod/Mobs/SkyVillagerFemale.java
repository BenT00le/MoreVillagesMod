package com.IntroToCS.MoreVillagesMod.Mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;

public class SkyVillagerFemale extends EntityVillager
{

	public SkyVillagerFemale(World worldIn) {
		super(worldIn);
		this.setSize(1.0F, 2.0F);
	}
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.9D);		
	}
	protected String getLivingSound()
	{
		return "mob.villager.say";
	}
}
