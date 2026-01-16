package com.nozomin.factorism.datagen;

import com.nozomin.factorism.Factorism;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, Factorism.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        // EXAMPLE:
        /*
        simpleBlockWithItem(ModBlocks.SAMPLE_BLOCK.get(), cubeAll(ModBlocks.SAMPLE_BLOCK.get());
         */
    }
}
