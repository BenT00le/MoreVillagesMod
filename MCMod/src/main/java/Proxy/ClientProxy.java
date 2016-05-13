package Proxy;

import com.IntroToCS.MoreVillagesMod.Items.PrismarineHelmet;

public class ClientProxy extends CommonProxy
{
	//Registers the item's graphic in the game's directory
	@Override
	public void regesterRenders()
	{
		PrismarineHelmet.RegesterRenders();
	}
}
