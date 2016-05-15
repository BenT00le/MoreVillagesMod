package com.IntroToCS.MoreVillagesMod.Items;

import net.minecraft.item.ItemArmor;

public class PrismarineArmor extends ItemArmor
{

	public PrismarineArmor(String name,ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(name);
	}

}
