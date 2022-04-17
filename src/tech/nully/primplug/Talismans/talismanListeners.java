package tech.nully.primplug.Talismans;

import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class talismanListeners implements Listener {
    static Player p;
    @EventHandler
    public static void OnRightClickTalisman(PlayerInteractEvent i) throws IOException {
        p = i.getPlayer();
        ItemStack handItem = p.getItemInHand();
        ItemMeta handItemMeta = handItem.getItemMeta();
        // Listeners for right-click talismans
        // For Curse of despair
        if (p.getItemInHand().getType() == Material.RED_ROSE) {
            if (i.getAction() == Action.RIGHT_CLICK_AIR) {
                talismanIdentifier I = new talismanIdentifier();
                int handItemID = I.talismanRead(handItemMeta.getDisplayName());
                    if (handItemID == I.TalismanName.get("COD")) {
                        // TODO ayonull make it with dis structure
                        p.getInventory().remove(Talisman.BladeOfDespair);
                        p.sendMessage(ChatColor.YELLOW + 
                        "Successfully added your" +
                        ChatColor.LIGHT_PURPLE + "" + 
                        ChatColor.BOLD + 
                        " Curse of Despair " + 
                        ChatColor.YELLOW + 
                        "Talisman to your Talisman Bag!");
                }
            }
            // prevent talisman from being placed
            if (i.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (handItemMeta.getDisplayName() == Talisman.BladeOfDespair.getItemMeta().getDisplayName()) {
                    i.setCancelled(true);

                }
            }
        }
        // For Blessing of durability
        if (p.getItemInHand().getType() == Material.YELLOW_FLOWER) {
            if (i.getAction() == Action.RIGHT_CLICK_AIR) {
                    if (handItemMeta.getDisplayName() == Talisman.BlessingOfDurability.getItemMeta().getDisplayName()) {
                        // TODO MAKE IT ADD TO CONFIG THING
                        p.getInventory().remove(Talisman.BlessingOfDurability);
                        p.sendMessage(ChatColor.YELLOW + 
                        "Successfully added your" + 
                        ChatColor.LIGHT_PURPLE + "" + 
                        ChatColor.BOLD + 
                        " Blessing of Durability " + 
                        ChatColor.YELLOW + 
                        "Talisman to your Talisman Bag!");
                }
            }
            // prevent talisman from being placed
            if (i.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (handItemMeta.getDisplayName() == Talisman.BlessingOfDurability.getItemMeta().getDisplayName()) {
                    i.setCancelled(true);
                    }
                }
            }
                    // For Blessing of durability
        if (p.getItemInHand().getType() == Material.WOOL) {
            if (handItemMeta.getDisplayName() == Talisman.MisoTheRabbit.getItemMeta().getDisplayName()) {
                if (i.getAction() == Action.RIGHT_CLICK_AIR) {
                    // TODO MAKE IT ADD TO CONFIG THING
                    p.getInventory().remove(Talisman.MisoTheRabbit);
                    p.sendMessage(ChatColor.YELLOW + 
                    "Successfully added your" + 
                    ChatColor.LIGHT_PURPLE + "" + 
                    ChatColor.BOLD + 
                    " Miso the Rabbit " + 
                    ChatColor.YELLOW + 
                    "Talisman to your Talisman Bag!");
            }
            // prevent talisman from being placed
                if (i.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    i.setCancelled(true);
                    }
                }
            }
    }
}
