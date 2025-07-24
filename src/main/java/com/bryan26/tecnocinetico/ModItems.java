// RUTA: src/main/java/com/bryan26/tecnocinetico/ModItems.java
package com.bryan26.tecnocinetico;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tecnocinetico.MODID);

    // --- Ítems Existentes ---
    public static final RegistryObject<Item> LINGOTE_DE_PLOMO = ITEMS.register("lingote_de_plomo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLOMO_CRUDO = ITEMS.register("plomo_crudo",
            () -> new Item(new Item.Properties()));

    // --- ¡NUEVO ÍTEM! ---
    public static final RegistryObject<Item> POLVO_DE_PLOMO = ITEMS.register("polvo_de_plomo",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}