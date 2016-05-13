package com.IntroToCS.MoreVillagesMod.Items;

import References.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class PrismarineHelmet
{
	//define item variable
	public static Item Prismarine_Helmet;
	//sets the name for the item
	public static void init()
	{
		Prismarine_Helmet = new Item().setUnlocalizedName("Prismarine Helmet");
	}
	//registers the item in the game directory
	public static void Register()
	{
		GameRegistry.registerItem(Prismarine_Helmet, Prismarine_Helmet.getUnlocalizedName().substring(5));
	}
	//Registers the item's graphic in the game's directory
	public static void RegesterRenders()
	{
		RegesterRender(Prismarine_Helmet);
	}
	// gets the file location for the item's graphic
	public static void RegesterRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Prismarine_Helmet, 0, 
		new ModelResourceLocation(References.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}