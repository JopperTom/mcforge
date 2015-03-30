package pizza.minecraft.geekforjesus.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

/**
 * Created by Tom on 3/10/2015.
 */
public class ItemNukeRare extends Item{
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean Adva){
        list.add(EnumChatFormatting.WHITE + "Type: " + EnumChatFormatting.WHITE + "Material");
        list.add(EnumChatFormatting.WHITE + "Rarity: " + EnumChatFormatting.YELLOW + "Rare");
        list.add(EnumChatFormatting.WHITE + "Usage: " + EnumChatFormatting.WHITE + "Crafting");
    }
}
