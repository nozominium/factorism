package com.nozomin.factorism.datagen;

import com.nozomin.factorism.block.ModBlocks;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_BOARD.get())
                .define('#', ModItems.STEEL_INGOT.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("###")
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BASE_BOARD.get())
                .define('#', ModItems.STEEL_BOARD.get())
                .define('*', ModItems.COBALT_INGOT.get())
                .pattern("   ")
                .pattern("*  ")
                .pattern("#  ")
                .unlockedBy("has_steel_board", has(ModItems.STEEL_BOARD.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBALT_BLOCK.get())
                .define('#', ModItems.COBALT_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_cobalt_ingot", has(ModItems.COBALT_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_CIRCUIT.get())
                .define('B', ModItems.BASE_BOARD.get())
                .define('C', Items.COPPER_INGOT)
                .pattern("   ")
                .pattern("   ")
                .pattern("CBC")
                .unlockedBy("has_base_board", has(ModItems.BASE_BOARD.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_CIRCUIT.get())
                .define('B', ModItems.COPPER_CIRCUIT.get())
                .define('I', Items.IRON_INGOT)
                .pattern("   ")
                .pattern("   ")
                .pattern("IBI")
                .unlockedBy("has_copper_circuit", has(ModItems.COPPER_CIRCUIT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_CIRCUIT.get())
                .define('B', ModItems.IRON_CIRCUIT.get())
                .define('G', Items.GOLD_INGOT)
                .pattern("   ")
                .pattern("   ")
                .pattern("GBG")
                .unlockedBy("has_iron_circuit", has(ModItems.IRON_CIRCUIT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_CIRCUIT.get())
                .define('B', ModItems.GOLD_CIRCUIT.get())
                .define('D', Items.DIAMOND)
                .pattern("   ")
                .pattern("   ")
                .pattern("DBD")
                .unlockedBy("has_gold_circuit", has(ModItems.GOLD_CIRCUIT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_CIRCUIT.get())
                .define('B', ModItems.DIAMOND_CIRCUIT.get())
                .define('N', Items.NETHERITE_INGOT)
                .pattern("   ")
                .pattern("   ")
                .pattern("NBN")
                .unlockedBy("has_diamond_circuit", has(ModItems.DIAMOND_CIRCUIT.get()))
                .save(output);
    }
}
