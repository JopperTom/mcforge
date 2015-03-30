package pizza.minecraft.geekforjesus.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pizza.minecraft.geekforjesus.lib.Constants;

/**
 * Created by Tom on 3/10/2015.
 */
public class ItemList {
    public static void MainRegistry(){
        ItemsInit();
        ItemRegister();
    }

    public static Item IngotRU238;

    private static void ItemsInit() {
        //materials
        IngotRU238 = new ItemNukeRare().setCreativeTab(CreativeTabs.tabMisc) .setUnlocalizedName(Constants.NUKEITEM);
    }
    private static void ItemRegister() {
        GameRegistry.registerItem(IngotRU238, IngotRU238.getUnlocalizedName().substring(5));
    }
    public static void RegisterRender(){
        GetItemIcon(IngotRU238);
    }

    private static void GetItemIcon(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Constants.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
