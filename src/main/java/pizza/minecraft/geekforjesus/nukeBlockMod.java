package pizza.minecraft.geekforjesus;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import pizza.minecraft.geekforjesus.blocks.BlockList;
import pizza.minecraft.geekforjesus.items.ItemList;
import pizza.minecraft.geekforjesus.lib.Constants;
import pizza.minecraft.geekforjesus.world.WorldRegister;

/**
 * Created by Tom on 2/28/2015.
 */
@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class nukeBlockMod {

    public static Block nukeBlock;
    public static Item nukeItem;

//    @SidedProxy(clientSide = Constants.ClientProxy, serverSide = Constants.ServerProxy)
//    public static ServerProxy proxy;

    modEventHandler handler = new modEventHandler();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        //event handler registry
        FMLCommonHandler.instance().bus().register(handler);
        MinecraftForge.EVENT_BUS.register(handler);

      //  if(event.getSide() == Side.CLIENT)
        //{
            //Blocks
 //           BlockList.MainRegistry();

            //items
 //           ItemList.MainRegistry();
      //  }
        //world
        WorldRegister.MainRegistry();
    }
    @Mod.EventHandler
    public  void init(FMLInitializationEvent event){

        //recipes
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), "AAA",
                "AAA",
                "AAA",
                'A', Items.cookie);
        GameRegistry.addRecipe(new ItemStack(Items.apple, 4), "AA",
                "AA",
                'A', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(Items.dye, 2, 15), "AB ",
                "AAC",
                "A  ",
                'A', Items.cookie, 'B', Blocks.dirt, 'C', new ItemStack(Items.dye, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new ItemStack(Items.dye, 1, 1), Items.redstone);

        GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11), 0.1F);
        //  if(event.getSide() == Side.CLIENT)
        //{
        //Blocks
        BlockList.MainRegistry();

        //items
        ItemList.MainRegistry();
        //  }

/*        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            renderItem.getItemModelMesher().register(Item.getItemFromBlock(nukeBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((NukeBlock) nukeBlock).getLocalizedName(), "inventory"));
            renderItem.getItemModelMesher().register(tutorialItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((NukeItem) tutorialItem).getName(), "inventory"));
        }*/
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
