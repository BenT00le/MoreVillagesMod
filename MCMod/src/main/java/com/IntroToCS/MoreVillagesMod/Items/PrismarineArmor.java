package com.IntroToCS.MoreVillagesMod.Items;

import com.IntroToCS.MoreVillagesMod.MainMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PrismarineArmor extends ItemArmor
{

	public PrismarineArmor(String name,ArmorMaterial material, int renderIndex, int armorType) 
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(name);
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
	    if (itemStack.getItem() == MainMod.PrismarineHelmet) 
	    {
	        effectPlayer(player, Potion.nightVision, 0);
	    }
	    if (itemStack.getItem() == MainMod.PrismarineChestPlate) 
	    {
	        effectPlayer(player, Potion.waterBreathing, 0);
	    }
	    if (itemStack.getItem() == MainMod.PrismarinePants) 
	    {

	    }
	    if (itemStack.getItem() == MainMod.PrismarineBoots) 
	    {
	        
	    }
	}
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) 
	{
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}
}
