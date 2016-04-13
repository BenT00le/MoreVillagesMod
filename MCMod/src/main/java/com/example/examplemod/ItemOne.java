package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import com.example.examplemod.References;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;;

public class ItemOne
{
	public static Item Item_One;
	public static void init()
	{
		Item_One = new Item().setUnlocalizedName("An Item");
	}
	
	public static void Register()
	{
		GameRegistry.registerItem(Item_One, Item_One.getUnlocalizedName().substring(5));
	}
	public static void RegesterRenders()
	{
		RegesterRender(Item_One);
	}
	public static void RegesterRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item_One, 0, 
		new ModelResourceLocation(References.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}