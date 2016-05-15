package com.IntroToCS.MoreVillagesMod.Mobs;

import com.IntroToCS.MoreVillagesMod.MainMod;
import com.IntroToCS.MoreVillagesMod.References;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class VilagerRegister 
{
	public static void mainRegistry()
	{
		registerEntity();
	}
	public static void registerEntity()
	{
		createEntity(MerManVillager.class,"Merman_Villager",0X0562F7,0X9E05F7);
	}
	public static void createEntity(Class mobClass,String name,int solidColor,int spotColor)
	{
		int randID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(mobClass, name, randID, MainMod.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(mobClass, 2, 0, 30, EnumCreatureType.WATER_CREATURE, BiomeGenBase.ocean);
		
		createEgg(randID,solidColor,spotColor);
	}
	private static void createEgg(int randID,int solidColor,int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(randID), new EntityList.EntityEggInfo(randID, solidColor, spotColor));
	}
}
