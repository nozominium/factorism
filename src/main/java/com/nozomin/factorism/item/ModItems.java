package com.nozomin.factorism.item;

import com.nozomin.factorism.Factorism;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, Factorism.MODID);
    // EXAMPLE:
    /*
    public static final DeferredHolder<Item, Item> SAMPLE_ITEM = ITEMS.register("sample_item",
            () -> new Item(new Item.Properties()));

    WrenchItemクラスは別途実装する必要があります。
    public static final DeferredHolder<Item, Item> WRENCH = ITEMS.register("wrench",
            () -> new WrenchItem(new Item.Properties().durability(250)));
    */
    public static final DeferredHolder<Item, Item> SAMPLE_ITEM = ITEMS.register("sample_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
