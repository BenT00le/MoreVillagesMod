package com.IntroToCS.MoreVillagesMod;

import com.IntroToCS.MoreVillagesMod.Items.*;
import Proxy.CommonProxy;
import References.References;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;;

@Mod(modid = References.MODID, name = References.ModName, version = References.VERSION)
public class MainMod
{
	public static Item PrismarinePickaxe;
	public static Item PrismarineShovel;
	//add tool material properties **balancing
	public static final Item.ToolMaterial Prismarine = EnumHelper.addToolMaterial("Prismarine",2,1500,7.0f,2.0f, 12);
	@SidedProxy(clientSide = References.ClientProxyClass,serverSide = References.ServerProxyClass) 
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	PrismarineHelmet.init();
    	PrismarineHelmet.Register();
    	
    	PrismarinePickaxe = new ItemPrismarinePickaxe(Prismarine);
    	ItemPrismarinePickaxe.init();
    	ItemPrismarinePickaxe.Register();
    	
    	PrismarineShovel = new ItemPrismarineShovel(Prismarine);
    	ItemPrismarineShovel.init();
    	ItemPrismarineShovel.Register();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//creates a crafting recipe for a prismarine helmet
    	GameRegistry.addRecipe(new ItemStack(PrismarineHelmet.Prismarine_Helmet), new Object[]{"PPP",
    			                                                                               "P P", //each set of quotes is one row in a crafting table spaces represent empty slots
    			                                                                               "P P",'P',Items.prismarine_shard});
    	GameRegistry.addRecipe(new ItemStack(ItemPrismarinePickaxe.Prismarine_Pickaxe), new Object[]{"PPP",
    			                                                                                     " C ",
    			                                                                                     " C ","P","C",Items.prismarine_shard,Items.prismarine_crystals});
    	proxy.regesterRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}