package com.IntroToCS.MoreVillagesMod.Items;

import com.IntroToCS.MoreVillagesMod.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPrismarinePickaxe extends ItemPickaxe
{
	public ItemPrismarinePickaxe(String name,ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(name);
	}
	
}
