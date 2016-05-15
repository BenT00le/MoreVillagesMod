package com.IntroToCS.MoreVillagesMod;


import com.IntroToCS.MoreVillagesMod.Items.*;
import com.IntroToCS.MoreVillagesMod.Mobs.VilagerRegister;

import Proxy.CommonProxy;
import com.IntroToCS.MoreVillagesMod.References;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;;

@Mod(modid = References.MODID, name = References.ModName, version = References.VERSION)
public class MainMod
{
	//add tool material properties **balancing
	public static final Item.ToolMaterial PrismarineTool = EnumHelper.addToolMaterial("PrismarineTool",2,900,7.0f,6.5f, 25);
	public static final Item.ToolMaterial BronzeTool = EnumHelper.addToolMaterial("BronzeTool",2,1200,7.5f,7.0f, 15);
	public static final ArmorMaterial PrismarineArmor = EnumHelper.addArmorMaterial("PrismarineArmor", "mvm:PrismarineArmor", 24, new int[]{1,7,6,2}, 29);
	public static final ArmorMaterial BronzeArmor = EnumHelper.addArmorMaterial("BronzeArmor", "mvm:BronzeArmor", 29, new int[]{3,7,5,3}, 17);
	@SidedProxy(clientSide = References.ClientProxyClass,serverSide = References.ServerProxyClass) 
	public static CommonProxy proxy;
	@Instance(References.MODID) 
	public static MainMod modInstance;
	//prismarine tools initialized
	public static Item Prismarine_pickaxe = new ItemPrismarinePickaxe("Prismarine_pickaxe",PrismarineTool);
	public static Item Prismarine_sword = new ItemPrismarineSword("Prismarine_sword",PrismarineTool);
	public static Item Prismarine_shovel = new ItemPrismarineShovel("Prismarine_shovel",PrismarineTool);
	public static Item Prismarine_axe = new ItemPrismarineAxe("Prismarine_axe",PrismarineTool);
	public static Item Prismarine_hoe = new ItemPrismarineHoe("Prismarine_hoe",PrismarineTool);
	public static Item PrismarineHelmet;
	public static Item PrismarineChestPlate;
	public static Item PrismarinePants;
	public static Item PrismarineBoots;
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
    	//add villagers
    	//VilagerRegister.mainRegistry();
    	//prismarine tools registered
    	GameRegistry.registerItem(Prismarine_pickaxe,"Prismarine_pickaxe");    	
    	GameRegistry.registerItem(Prismarine_sword,"Prismarine_sword"); 
    	GameRegistry.registerItem(Prismarine_shovel,"Prismarine_shovel"); 
    	GameRegistry.registerItem(Prismarine_axe,"Prismarine_axe"); 
    	GameRegistry.registerItem(Prismarine_hoe,"Prismarine_hoe"); 
    	//Bronze Tools registered
    	
    	//Prismarine Armor
    	GameRegistry.registerItem(PrismarineHelmet = new PrismarineArmor("Prismarine_helmet", PrismarineArmor,1,0),"Prismarine_helmet");
    	GameRegistry.registerItem(PrismarineChestPlate = new PrismarineArmor("Prismarine_chestplate", PrismarineArmor,1,1),"Prismarine_chestplate");
    	GameRegistry.registerItem(PrismarinePants = new PrismarineArmor("Prismarine_pants", PrismarineArmor,2,2),"Prismarine_pants");
    	GameRegistry.registerItem(PrismarineBoots = new PrismarineArmor("Prismarine_boots", PrismarineArmor,1,3),"Prismarine_boots");
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ItemRegisterRenders.registerItemRender();
    	//creates a crafting recipes
    	/*Prismarine Armor*/  
    	//prismarine chestplate
    	GameRegistry.addRecipe(new ItemStack(PrismarineChestPlate), new Object[]{"P P",
    			                                                                 "PPP",
    			                                                                 "PPP",'P',Items.prismarine_shard});
    	//prismarine pants
    	//prismarine boots
    	//prismarine helmet
    	GameRegistry.addRecipe(new ItemStack(PrismarineHelmet), new Object[]{"PPP",
    	                                                                     "P P", //each set of quotes is one row in a crafting table spaces represent empty slots
    	/*prismarine pickaxe*/		                                         "   ",'P',Items.prismarine_shard});
    	GameRegistry.addRecipe(new ItemStack(Prismarine_pickaxe), new Object[]{"PPP",
    			                                                               " C ", 
    			                                                               " C ",'P',Items.prismarine_shard,'C',Items.prismarine_crystals});
    	/*prismarine sword*/                                                  
    	GameRegistry.addRecipe(new ItemStack(Prismarine_sword), new Object[]{" P ",
                                                                             " P ",
        /*prismarine shovel*/                                               " C ",'P',Items.prismarine_shard,'C',Items.prismarine_crystals});
    	GameRegistry.addRecipe(new ItemStack(Prismarine_shovel), new Object[]{" P ",
                                                                              " C ",
        /*prismarine axe*/                                                    " C ",'P',Items.prismarine_shard,'C',Items.prismarine_crystals});
    	GameRegistry.addRecipe(new ItemStack(Prismarine_axe), new Object[]{" PP",
                                                                           " CP",
        /*prismarine hoe*/                                                 " C ",'P',Items.prismarine_shard,'C',Items.prismarine_crystals});
    	GameRegistry.addRecipe(new ItemStack(Prismarine_hoe), new Object[]{" PP",
                                                                           " C ",
                                                                           " C ",'P',Items.prismarine_shard,'C',Items.prismarine_crystals});
    	proxy.regesterRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}