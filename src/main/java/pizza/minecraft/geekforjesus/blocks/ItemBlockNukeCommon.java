package pizza.minecraft.geekforjesus.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

/**
 * Created by Tom on 3/6/2015.
 */
public class ItemBlockNukeCommon extends ItemBlock {
    public ItemBlockNukeCommon(Block block) {
        super(block);
    }
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean Adva){
        list.add(EnumChatFormatting.WHITE + "Type: " + EnumChatFormatting.WHITE + "Nuke");
        list.add(EnumChatFormatting.WHITE + "Rarity: " + EnumChatFormatting.WHITE + "Common");
        list.add(EnumChatFormatting.WHITE + "Usage: " + EnumChatFormatting.WHITE + "Smelting");
    }
}
