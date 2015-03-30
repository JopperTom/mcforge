package pizza.minecraft.geekforjesus.world;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldRegister {
    public static void MainRegistry(){
        registerWorldGen(new nukeWorldGenerator(),1);
    }
    public static void registerWorldGen(IWorldGenerator iGenerator, int weightedProbability){
        GameRegistry.registerWorldGenerator(iGenerator, weightedProbability);
    }
}