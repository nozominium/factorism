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
        basicItem(ModItems.COBALT_INGOT.get());
        basicItem(ModItems.COBALT_NUGGET.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.STEEL_BOARD.get());
        basicItem(ModItems.BASE_BOARD.get());
        basicItem(ModItems.COPPER_CIRCUIT.get());
        basicItem(ModItems.IRON_CIRCUIT.get());
        basicItem(ModItems.GOLD_CIRCUIT.get());
        basicItem(ModItems.DIAMOND_CIRCUIT.get());
        basicItem(ModItems.NETHERITE_CIRCUIT.get());
    }
}
