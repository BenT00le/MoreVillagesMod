package Proxy;

import main.java.com.example.examplemod.ItemOne;

public class ClientProxy extends CommonProxy
{
	@Override
	public void regesterRenders()
	{
		ItemOne.RegesterRenders();
	}
}
