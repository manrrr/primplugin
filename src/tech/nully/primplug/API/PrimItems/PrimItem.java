package tech.nully.primplug.API.PrimItems;

import org.bukkit.inventory.ItemStack;
import tech.nully.primplug.API.Items.Rarity.Rarity;

import java.util.HashMap;
import java.util.List;

public class PrimItem{
    static HashMap<ItemStack, PrimItem> primItems = new HashMap<ItemStack, PrimItem>();
    private ItemStack i;
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

    public PrimItem(ItemStack i) {
        this.i = i;
        String[] EXPLine = i.getItemMeta().getLore().get(i.getItemMeta().getLore().size() -3).split("/");
        this.EXP = Integer.parseInt(EXPLine[1]);
        this.level = Integer.parseInt(EXPLine[0]);
        //TODO: add enchants
        this.rarity = new Rarity(i.getItemMeta().getLore().get(i.getItemMeta().getLore().size()-1).substring(3, i.getItemMeta().getLore().get(i.getItemMeta().getLore().size()-1).length()-1));
        for (String s : i.getItemMeta().getLore()) {
            if (s.contains("Damage:")) {
                List<String> lore = i.getItemMeta().getLore();
                int index = lore.indexOf(s);
                this.damage = Integer.parseInt(s.split(" ")[1]);
                this.magicDamage = Integer.parseInt(lore.get(index + 1).split(" ")[1]);
                this.defense = Integer.parseInt(lore.get(index + 2).split(" ")[1]);
                this.magicDefense = Integer.parseInt(lore.get(index + 3).split(" ")[1]);
                this.mana = Integer.parseInt(lore.get(index + 4).split(" ")[1]);
                this.stamina = Integer.parseInt(lore.get(index + 5).split(" ")[1]);
                break;
            }
        }
        primItems.put(i, this);
    }

    public static PrimItem getPrimItem(ItemStack i) {
        return primItems.get(i);
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
}
