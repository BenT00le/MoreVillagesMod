package com.IntroToCS.MoreVillagesMod.Items;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BronzeArmor extends ItemArmor
{
	public BronzeArmor(String name,ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(name);
	}

}
