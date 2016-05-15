package Proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import com.IntroToCS.MoreVillagesMod.Items.ItemRegisterRenders;


public class ClientProxy extends CommonProxy
{
	//Registers the item's graphic in the game's directory
	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);
		
		ItemRegisterRenders.registerItemRender();
	}
}
