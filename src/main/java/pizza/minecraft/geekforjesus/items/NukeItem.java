package pizza.minecraft.geekforjesus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pizza.minecraft.geekforjesus.lib.Constants;

/**
 * Created by Tom on 3/1/2015.
 */
    public class NukeItem extends Item
    {
        private final String name = "tutorialItem";

        public NukeItem()
        {
     //       GameRegistry.registerItem(this, name);
       //     setUnlocalizedName(Constants.MODID + "_" + name);
    //        setCreativeTab(CreativeTabs.tabMisc);
        }

        public String getName()
        {
            return name;
        }
    }
