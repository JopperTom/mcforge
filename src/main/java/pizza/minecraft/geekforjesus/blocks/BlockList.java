package pizza.minecraft.geekforjesus.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import pizza.minecraft.geekforjesus.lib.Constants;

/**
 * Created by Tom on 3/6/2015.
 */
public class BlockList {
    public static void MainRegistry() {
        BlockInit();
        BlockRegister();
    }

    public static Block nukeBlock;
    private static Item ItemBlockNuke;

    private static void BlockInit() {
        nukeBlock = new NukeBlock().setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName(Constants.NUKEBLOCK);

        ItemBlockNuke = new ItemBlockNukeCommon(nukeBlock);
    }

    private static void BlockRegister() {
        GameRegistry.registerBlock(nukeBlock, nukeBlock.getUnlocalizedName().substring(5));
    }

    public static void RegisterRender() {
        GetBlockRender(nukeBlock);
    }

    private static void GetBlockRender(Block block) {
        // if(event.getSide() == Side.CLIENT) {
        Item item = Item.getItemFromBlock(block);
        final int DEFAULT_ITEM_SUBTYPE = 0;
//        ModelResourceLocation blockModelResourceLocation = new ModelResourceLocation(Constants.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory");
        ModelResourceLocation blockModelResourceLocation = new ModelResourceLocation("Nukeblockmod:nukinator", "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), DEFAULT_ITEM_SUBTYPE, blockModelResourceLocation);
        //    }
    }
}
