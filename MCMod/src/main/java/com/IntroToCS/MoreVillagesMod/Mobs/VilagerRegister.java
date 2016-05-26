package com.IntroToCS.MoreVillagesMod.Mobs;

import com.IntroToCS.MoreVillagesMod.MainMod;
import com.IntroToCS.MoreVillagesMod.Mobs.VillagerModeler;
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
		createEntity(MerManVillager.class,"Merman",0X0562F7,0X9E05F7);
		//createEntity(SkyVillagerFemale.class,"Sky Woman",0XFFFFFF,0XFFBF00);
	}
	public static void createEntity(Class mobClass,String name,int solidColor,int spotColor)
	{
		int randID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(mobClass, name, randID, MainMod.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(mobClass, 10, 1, 30, EnumCreatureType.CREATURE, BiomeGenBase.ocean, BiomeGenBase.beach);
		
		createEgg(randID,solidColor,spotColor);
	}
	private static void createEgg(int randID,int solidColor,int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(randID), new EntityList.EntityEggInfo(randID, solidColor, spotColor));
	}
}
