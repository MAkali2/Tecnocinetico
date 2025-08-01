package com.bryan26.tecnocinetico.core.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "tecnocinetico");

    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
        () -> new Item(new Item.Properties()));
}