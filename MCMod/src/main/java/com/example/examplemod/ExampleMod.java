package main.java.com.example.examplemod;

import Proxy.CommonProxy;
import main.java.com.example.examplemod.ItemOne;
import main.java.com.example.examplemod.References;
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
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemOne.init();
    	ItemOne.Register();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.regesterRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
