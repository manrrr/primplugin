package tech.nully.primplug.recipeBook.GUIs;

import org.bukkit.inventory.Inventory;

import tech.nully.primplug.Armor.armorItems.Drakon;
import tech.nully.primplug.Armor.armorItems.PetheriteSet;

public class armorGUI {
    public void OpenArmor(Inventory inv){
        inv.setItem(10, Drakon.helm);
        inv.setItem(19, Drakon.ches);
        inv.setItem(28, Drakon.leg);
        inv.setItem(37, Drakon.boots);
        

        inv.setItem(11, PetheriteSet.helm);
        inv.setItem(20, PetheriteSet.ches);
        inv.setItem(29, PetheriteSet.leg);
        inv.setItem(38, PetheriteSet.boots);
    }
}
