package com.example.examplemod;

import Proxy.CommonProxy;
import com.example.examplemod.ItemOne;
import com.example.examplemod.References;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;;

@Mod(modid = References.MODID, name = References.ModName, version = References.VERSION)
public class ExampleMod
{
	@SidedProxy(clientSide = References.ClientProxyClass,serverSide = References.ServerProxyClass) 
	public static CommonProxy proxy;
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemOne.init();;
    	ItemOne.Register();;
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.regesterRenders();;
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}