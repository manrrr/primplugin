package tech.nully.primplug.Armor.armorItems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class hardenedDiamond {
    public static ItemStack helm;
    public static ItemStack chestplate;
    public static ItemStack leg;
    public static ItemStack boots;

    public void init() {
        createHDiaHelm();
    }

    private static void createHDiaHelm() {
        // DEFINE THE META -------------
        ItemStack HDiaHelm = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta HDiaHelmMeta = HDiaHelm.getItemMeta();


        // SET THE META ----------------
        HDiaHelmMeta.setDisplayName("Hardened Diamond Helmet");
            // HelmLore
        List<String> Helmlore = new ArrayList<>();
        Helmlore.add(ChatColor.LIGHT_PURPLE + "A helmet made out of an extremely durable");
        Helmlore.add(ChatColor.LIGHT_PURPLE + "material which grants a lot of protection");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "Attributes------");
        Helmlore.add(ChatColor.BLUE + "Damage: 3");
        Helmlore.add(ChatColor.BLUE + "Defense: 18");
        Helmlore.add(ChatColor.BLUE + "Mana: 8");
        Helmlore.add(ChatColor.BLUE + "Stamina: 13");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        HDiaHelmMeta.setLore(Helmlore);

        HDiaHelm.setItemMeta(HDiaHelmMeta);
        helm = HDiaHelm;
    }



    private static void createHDiaChes() {
        // DEFINE THE META -------------
        ItemStack HDiaChes = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta HDiaChesMeta = HDiaChes.getItemMeta();


        // SET THE META ----------------
        HDiaChesMeta.setDisplayName("Hardened Diamond Chestplate");
            // ChesLore
        List<String> Cheslore = new ArrayList<>();
        Cheslore.add(ChatColor.LIGHT_PURPLE + "A Chesplate made out of an extremely durable");
        Cheslore.add(ChatColor.LIGHT_PURPLE + "material which grants a lot of protection");
        Cheslore.add("");
        Cheslore.add(ChatColor.BLUE + "Attributes------");
        Cheslore.add(ChatColor.BLUE + "Damage: 5");
        Cheslore.add(ChatColor.BLUE + "Defense: 32");
        Cheslore.add(ChatColor.BLUE + "Mana: 13");
        Cheslore.add(ChatColor.BLUE + "Stamina: 20");
        Cheslore.add("");
        Cheslore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        HDiaChesMeta.setLore(Cheslore);

        HDiaChes.setItemMeta(HDiaChesMeta);
        chestplate = HDiaChes;
    }


    private static void createHDiaLeg() {
        // DEFINE THE META -------------
        ItemStack HDiaHelm = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta HDiaHelmMeta = HDiaHelm.getItemMeta();


        // SET THE META ----------------
        HDiaHelmMeta.setDisplayName("Hardened Diamond Helmet");
            // HelmLore
        List<String> Helmlore = new ArrayList<>();
        Helmlore.add(ChatColor.LIGHT_PURPLE + "A helmet made out of an extremely durable");
        Helmlore.add(ChatColor.LIGHT_PURPLE + "material which grants a lot of protection");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "Attributes------");
        Helmlore.add(ChatColor.BLUE + "Damage: 3");
        Helmlore.add(ChatColor.BLUE + "Defense: 18");
        Helmlore.add(ChatColor.BLUE + "Mana: 8");
        Helmlore.add(ChatColor.BLUE + "Stamina: 13");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        HDiaHelmMeta.setLore(Helmlore);

        HDiaHelm.setItemMeta(HDiaHelmMeta);
        helm = HDiaHelm;
    }


    private static void createHDiaBoots() {
        // DEFINE THE META -------------
        ItemStack HDiaHelm = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta HDiaHelmMeta = HDiaHelm.getItemMeta();


        // SET THE META ----------------
        HDiaHelmMeta.setDisplayName("Hardened Diamond Helmet");
            // HelmLore
        List<String> Helmlore = new ArrayList<>();
        Helmlore.add(ChatColor.LIGHT_PURPLE + "A helmet made out of an extremely durable");
        Helmlore.add(ChatColor.LIGHT_PURPLE + "material which grants a lot of protection");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "Attributes------");
        Helmlore.add(ChatColor.BLUE + "Damage: 3");
        Helmlore.add(ChatColor.BLUE + "Defense: 18");
        Helmlore.add(ChatColor.BLUE + "Mana: 8");
        Helmlore.add(ChatColor.BLUE + "Stamina: 13");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        HDiaHelmMeta.setLore(Helmlore);

        HDiaHelm.setItemMeta(HDiaHelmMeta);
        helm = HDiaHelm;
    }
}
