package pizza.minecraft.geekforjesus;

import pizza.minecraft.geekforjesus.blocks.BlockList;
import pizza.minecraft.geekforjesus.items.ItemList;

/**
 * Created by Tom on 3/10/2015.
 */
public class ClientProxy extends ServerProxy{
    @Override
    public void RegisterRender(){
        ItemList.RegisterRender();
        BlockList.RegisterRender();
    }
}