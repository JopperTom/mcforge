package pizza.minecraft.geekforjesus.world;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import pizza.minecraft.geekforjesus.blocks.BlockList;

import java.util.Random;

/**
 * Created by Tom on 3/5/2015.
 */
public class nukeWorldGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()){
            case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16); break;
            case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16); break;
            case -1: generateNether(world, random, chunkX * 16, chunkZ * 16); break;
            default: generateOverworld(world, random, chunkX * 16, chunkZ * 16);
        }

    }

    private void generateNether(World world, Random random, int x, int z) {
    }

    private void generateEnd(World world, Random random, int x, int z) {
    }

    private void generateOverworld(World world, Random random, int x, int z) {
        addOres(BlockList.nukeBlock, world, random, x, z, 2, 10, 16, 0, 35);
    }

    void addOres(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize,
                 int maxVeinSize, int chanceToSpawn, int minY, int maxY)
    {
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);

        for (int i = 0; i < chanceToSpawn; i++){
            int posX = blockXPos + random.nextInt(16);
            int posZ = blockZPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);

            IBlockState state = block.getDefaultState();
            BlockPos pos = new BlockPos(posX, posY, posZ);

            new WorldGenMinable(state, veinSize).generate(world, random, pos);
        }
    }
}
