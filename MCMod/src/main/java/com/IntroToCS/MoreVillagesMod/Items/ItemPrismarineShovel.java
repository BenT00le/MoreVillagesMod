package com.IntroToCS.MoreVillagesMod.Items;

import com.IntroToCS.MoreVillagesMod.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;

public class ItemPrismarineShovel extends ItemSpade
{
	public ItemPrismarineShovel(String name,ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(name);
	}

}
