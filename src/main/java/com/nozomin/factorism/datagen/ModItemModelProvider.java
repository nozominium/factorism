package com.nozomin.factorism.datagen;

import com.nozomin.factorism.Factorism;
import com.nozomin.factorism.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, Factorism.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels(){
        // EXAMPLE:
        /*
        basicItem(ModItems.SAMPLE_ITEM.get());
         */
        basicItem(ModItems.SAMPLE_ITEM.get());
    }
}
