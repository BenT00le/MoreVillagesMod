package com.IntroToCS.MoreVillagesMod;

import com.IntroToCS.MoreVillagesMod.ItemOne;
import com.IntroToCS.MoreVillagesMod.References;
import Proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;;

@Mod(modid = References.MODID, name = References.ModName, version = References.VERSION)
public class ExampleMod
{
	@SidedProxy(clientSide = References.ClientProxyClass,serverSide = References.ServerProxyClass) 
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemOne.init();
    	ItemOne.Register();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//creates a crafting recipe for "ItemOne" which will become a prismarine helmet
    	GameRegistry.addRecipe(new ItemStack(ItemOne.Item_One), new Object[]{"PPP",
    			                                                             "P P", //each set of quotes is one row in a crafting table spaces represent empty slots
    			                                                             "P P",'P',Items.prismarine_shard});
    	proxy.regesterRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}