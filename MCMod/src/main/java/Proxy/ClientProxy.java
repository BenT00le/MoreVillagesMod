package Proxy;

import com.IntroToCS.MoreVillagesMod.ItemOne;

public class ClientProxy extends CommonProxy
{
	//Registers the item's graphic in the game's directory
	@Override
	public void regesterRenders()
	{
		ItemOne.RegesterRenders();
	}
}
