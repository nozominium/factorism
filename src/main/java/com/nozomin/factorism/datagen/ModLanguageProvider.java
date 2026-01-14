package com.nozomin.factorism.datagen;

import com.nozomin.factorism.Factorism;
import com.nozomin.factorism.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locate){
        super(output, Factorism.MODID, locate);
    }
    @Override
    protected void addTranslations(){
        // EXAMPLE:
        /*
        add("itemGroup.factorism", "Factorism");
        add(ModItems.SAMPLE_ITEM.get(), "Sample Item");
         */
        add(ModItems.SAMPLE_ITEM.get(), "Sample Item");
        add(ModItems.COBALT_INGOT.get(), "Cobalt Ingot");
        add(ModItems.COBALT_NUGGET.get(), "Cobalt Nugget");
        add(ModItems.STEEL_INGOT.get(), "Steel Ingot");
        add(ModItems.STEEL_BOARD.get(), "Steel Board");
        add(ModItems.BASE_BOARD.get(), "Base Board");
        add(ModItems.COPPER_CIRCUIT.get(), "Copper Circuit");
        add(ModItems.IRON_CIRCUIT.get(), "Iron Circuit");
        add(ModItems.GOLD_CIRCUIT.get(), "Gold Circuit");
        add(ModItems.DIAMOND_CIRCUIT.get(), "Diamond Circuit");
        add(ModItems.NETHERITE_CIRCUIT.get(), "Netherite Circuit");
    }
}
