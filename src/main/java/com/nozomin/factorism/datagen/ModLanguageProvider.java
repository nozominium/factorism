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
    }
}
