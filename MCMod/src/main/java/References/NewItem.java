package References;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NewItem 
{
	//define item variable
	public static Item Item_One;
	//sets the name for the item
	public static void setItem_One(Item item_One) 
	{
		Item_One = item_One;
	}
	public static void init()
	{
		Item_One = new Item().setUnlocalizedName("Item");
	}
	//registers the item in the game directory
	public static void Register()
	{
		GameRegistry.registerItem(Item_One, Item_One.getUnlocalizedName().substring(5));
	}
	//Registers the item's graphic in the game's directory
	public static void RegesterRenders()
	{
		RegesterRender(Item_One);
	}
	// gets the file location for the item's graphic
	public static void RegesterRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item_One, 0, 
		new ModelResourceLocation(References.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}
