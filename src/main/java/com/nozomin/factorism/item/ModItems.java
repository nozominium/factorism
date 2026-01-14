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
    public static final DeferredHolder<Item, Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> STEEL_BOARD = ITEMS.register("steel_board",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BASE_BOARD = ITEMS.register("base_board",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_CIRCUIT = ITEMS.register("copper_circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> IRON_CIRCUIT = ITEMS.register("iron_circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> GOLD_CIRCUIT = ITEMS.register("gold_circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> DIAMOND_CIRCUIT = ITEMS.register("diamond_circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHERITE_CIRCUIT = ITEMS.register("netherite_circuit",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
