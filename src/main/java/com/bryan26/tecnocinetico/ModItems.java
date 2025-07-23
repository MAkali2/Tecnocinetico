package com.bryan26.tecnocinetico; // Asegúrate de que este sea tu paquete

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Creamos un "registro diferido". Es la forma moderna de decirle a Forge:
    // "Prepárate, porque voy a añadir ítems a esta lista".
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tecnocinetico.MODID);

    // --- AÑADIMOS NUESTROS ÍTEMS AQUÍ ---

    public static final RegistryObject<Item> LINGOTE_DE_PLOMO = ITEMS.register("lingote_de_plomo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLOMO_CRUDO = ITEMS.register("plomo_crudo",
            () -> new Item(new Item.Properties()));


    // Este método es llamado por la clase principal para "activar" este registro.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
