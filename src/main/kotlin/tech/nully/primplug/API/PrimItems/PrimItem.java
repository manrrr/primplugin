package tech.nully.primplug.API.PrimItems;

import org.bukkit.inventory.ItemStack;
import tech.nully.primplug.API.Items.Rarity.Rarity;
import tech.nully.primplug.Armor.baseAdder;
import tech.nully.primplug.enchantStuff.enchantMechanic;

import java.util.HashMap;
import java.util.List;

public class PrimItem{
    static HashMap<ItemStack, PrimItem> primItems = new HashMap<ItemStack, PrimItem>();
    private final ItemStack i;
    private int damage;
    private int magicDamage;
    private int defense;
    private int magicDefense;
    private int mana;
    private int stamina;
    private int EXP;
    private int level;
    private List<String> enchants;
    private Rarity rarity;
    private String type;
    private static baseAdder b = new baseAdder();
    
    private static String getItemType(ItemStack item) {
        // TODO Finish this
        int stats = 7;
        if (item.getItemMeta().getLore().get(stats + 4).equals(b.ability() + "Passive Ability: Zeus' Wrath")) return "weapon";
        if (item.getItemMeta().getLore().get(stats + 2).equals(b.ability() + "Passive ability: Bloodthirst")) return "weapon";
        if (item.getType().toString().toLowerCase().contains("helmet") ||
        item.getType().toString().toLowerCase().contains("chestplate") ||
        item.getType().toString().toLowerCase().contains("leggings") ||
        item.getType().toString().toLowerCase().contains("boots")) return "armor";
        else return null;
    }

    public static boolean isPrimItem(ItemStack item) {
        if (getItemType(item) != null) {
            return true;
        } else return false;
    }


    private PrimItem(ItemStack i) {
        this.i = i;

        // The EXP line will look like: Level: x || EXP: x/x
        String[] EXPLine = i.getItemMeta().getLore().get(i.getItemMeta().getLore().size() -3).split("  ||  ");
        String Level = EXPLine[1].split(": ")[1];
        String EXP = EXPLine[2].split(": ")[1];

        this.EXP = Integer.parseInt(EXP);
        this.level = Integer.parseInt(Level);
        this.rarity = new Rarity(i.getItemMeta().getLore().get(i.getItemMeta().getLore().size()-1).substring(3, i.getItemMeta().getLore().get(i.getItemMeta().getLore().size()-1).length()-1));

        // Loops through the Item's lore to get Enchants and stats ------------------
        for (String s : i.getItemMeta().getLore()) {
            // Checks if the current line is the line that defines damage and bases the rest of the stats off of that line
            if (s.contains("Damage:")) {
                List<String> lore = i.getItemMeta().getLore();
                int index = lore.indexOf(s);
                this.damage = Integer.parseInt(s.split(" ")[1]);
                this.magicDamage = Integer.parseInt(lore.get(index + 1).split(" ")[1]);
                this.defense = Integer.parseInt(lore.get(index + 2).split(" ")[1]);
                this.magicDefense = Integer.parseInt(lore.get(index + 3).split(" ")[1]);
                this.mana = Integer.parseInt(lore.get(index + 4).split(" ")[1]);
                this.stamina = Integer.parseInt(lore.get(index + 5).split(" ")[1]);
            }
            // Loops through the full list of enchantments
            for (String ench : enchantMechanic.getEnchants()) {
                if (s.contains(ench)) {
                    this.enchants.add(ench);
                }
            }
        }
        //---------------------------------------------------------------------------

        primItems.put(i, this);
    }

    public static PrimItem getPrimItem(ItemStack i) {
        if (primItems.containsKey(i)) {
            return primItems.get(i);
        } else return new PrimItem(i);
    }

    public void AddEXP(int amount) {
        ItemStack i = this.getItem();
        String newExpLine = i.getItemMeta().getLore().get(i.getItemMeta().getLore().size() -3).split(" ");
        String[] EXPLine = i.getItemMeta().getLore().set(i.getItemMeta().getLore().size() -3, );
    }

    public int getDamage() {
        return this.damage;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getMagicDamage() {
        return this.magicDamage;
    }

    public int getMagicDefense() {
        return this.magicDefense;
    }

    public int getMana() {
        return this.mana;
    }

    public int getStamina() {
        return this.stamina;
    }

    public ItemStack getItem() {
        return this.i;
    }

    public int getEXP() {
        return this.EXP;
    }

    public int getLevel() {
        return this.level;
    }

    public List<String> getEnchants() {
        return this.enchants;
    }

    public Rarity getRarity() {
        return this.rarity;
    }

    public String getPrimType() {
        return this.type;
    }
}
