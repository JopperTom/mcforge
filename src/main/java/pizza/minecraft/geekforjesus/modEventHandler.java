package pizza.minecraft.geekforjesus;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

/**
 * Created by Tom on 2/28/2015.
 */
public class modEventHandler {
    @SubscribeEvent
    public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event)
    {
    }
    @SubscribeEvent
    public void throwEgg(PlayerInteractEvent event)
    {
    }
}
