package com.nozomin.factorism.datagen;

import com.nozomin.factorism.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries){
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput output){
        // EXAMPLE:
        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAMPLE_ITEM.get())
                .define('#', Items.IRON_INGOT)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(output);
         */
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAMPLE_ITEM.get())
                .define('#', Items.IRON_INGOT)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(output);

    }
}
