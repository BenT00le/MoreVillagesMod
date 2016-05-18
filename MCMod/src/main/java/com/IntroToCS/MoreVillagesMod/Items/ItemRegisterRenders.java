package com.IntroToCS.MoreVillagesMod.Items;

import com.IntroToCS.MoreVillagesMod.MainMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRegisterRenders
{
	public static void registerItemRender()
	{
		reg(MainMod.Prismarine_pickaxe);
		reg(MainMod.Prismarine_axe);
		reg(MainMod.Prismarine_shovel);
		reg(MainMod.Prismarine_sword);
		reg(MainMod.Prismarine_hoe);
		reg(MainMod.PrismarineChestPlate);
		reg(MainMod.PrismarinePants);
		reg(MainMod.PrismarineHelmet);
		reg(MainMod.PrismarineBoots);
		reg(MainMod.BronzeIngot);
		reg(MainMod.BronzeChestPlate);
		reg(MainMod.BronzePants);
		reg(MainMod.BronzeHelmet);
		reg(MainMod.BronzeBoots);
	}
	public static void reg(Item i)
	{
		System.out.println("\n \n "+i.getUnlocalizedName().substring(5)+"\n \n");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i,0,
				new ModelResourceLocation("mvm"+":"+i.getUnlocalizedName().substring(5),"inventory"));
	}
}
