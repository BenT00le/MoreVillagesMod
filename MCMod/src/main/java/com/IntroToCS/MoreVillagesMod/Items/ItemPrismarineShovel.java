package com.IntroToCS.MoreVillagesMod.Items;

import References.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;

public class ItemPrismarineShovel extends ItemSpade {

	public ItemPrismarineShovel(ToolMaterial material) {
		super(material);
	}

	//define item variable
	public static Item Prismarine_Shovel;
	//sets the name for the item
	public static void init()
	{
		Prismarine_Shovel = new Item().setUnlocalizedName("Prismarine Helmet");
	}
	//registers the item in the game directory
	public static void Register()
	{
		GameRegistry.registerItem(Prismarine_Shovel, Prismarine_Shovel.getUnlocalizedName().substring(5));
	}
	//Registers the item's graphic in the game's directory
	public static void RegesterRenders()
	{
		RegesterRender(Prismarine_Shovel);
	}
	// gets the file location for the item's graphic
	public static void RegesterRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Prismarine_Shovel, 0, 
		new ModelResourceLocation(References.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}
