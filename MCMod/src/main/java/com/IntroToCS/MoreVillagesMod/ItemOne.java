package com.IntroToCS.MoreVillagesMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemOne
{
	public static Item Item_One;
	//sets the name for the item
	public static void init()
	{
		Item_One = new Item().setUnlocalizedName("An Item");
	}
	//registers the item in the game directory
	public static void Register()
	{
		GameRegistry.registerItem(Item_One, Item_One.getUnlocalizedName().substring(5));
	}
	//Registers the item's graphic in the game's directory
	public static void RegesterRenders()
	{
		RegesterRender(Item_One);
	}
	// gets the file location for the item's graphic
	public static void RegesterRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item_One, 0, 
		new ModelResourceLocation(References.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}