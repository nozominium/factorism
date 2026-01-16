package com.nozomin.factorism.datagen;

import com.nozomin.factorism.Factorism;
import com.nozomin.factorism.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Factorism.MODID)
public class ModDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        boolean includeClient = event.includeClient();
        boolean includeServer = event.includeServer();
        generator.addProvider(includeClient, new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(includeClient, new ModLanguageProvider(packOutput, "en_us"));
        generator.addProvider(includeServer, new ModRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(includeClient, new ModBlockStateProvider(packOutput, existingFileHelper));
    }
}
