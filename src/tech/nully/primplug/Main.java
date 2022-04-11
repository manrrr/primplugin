package tech.nully.primplug;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import tech.nully.primplug.Items.Talisman;
import tech.nully.primplug.Items.WASDPlaneKey;
import tech.nully.primplug.Items.Armor.Drakon;
import tech.nully.primplug.Items.Armor.PetheriteSet;
import tech.nully.primplug.Listeners.talismanListeners;
import tech.nully.primplug.RegularCommands.GetPetherite;
import tech.nully.primplug.planes.planes;
import tech.nully.primplug.recipeBook.recipeCommand;

public class Main extends JavaPlugin {
    private ProtocolManager manager = ProtocolLibrary.getProtocolManager();
   
    // getter
    public ProtocolManager getProtocolManager() {
        return manager;
    }

    @Override
    public void onEnable() {

        manager = ProtocolLibrary.getProtocolManager();

        PetheriteSet.init();
        Talisman.init();
        Drakon.init();
        WASDPlaneKey.init();


        planes p = new planes(this);
        p.addPacketListener();


        getCommand("recipes").setExecutor(new recipeCommand());
        getCommand("pgive").setExecutor(new GetPetherite());
        getServer().getPluginManager().registerEvents(new talismanListeners(), this);
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
        ChatColor.LIGHT_PURPLE + "[PrimPlugin]" + ChatColor.GREEN + " PrimPlugin is now Enabled!");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        saveDefaultConfig();

        }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(
            ChatColor.LIGHT_PURPLE + "[PrimPlugin]" + ChatColor.RED + "PrimPlugin is now Disabled!");
    }
}