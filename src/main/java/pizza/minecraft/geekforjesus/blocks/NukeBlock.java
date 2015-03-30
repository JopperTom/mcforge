package pizza.minecraft.geekforjesus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Tom on 2/28/2015.
 */

public class NukeBlock extends Block {

    private final String name = "nukinator";

    public NukeBlock(){
        super(Material.rock);
        this.setHardness(20f);
        this.setResistance(15f);
        this.setLightLevel(0.75F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGlass);
        this.setHarvestLevel("Pickaxe", 3);
    }
}
