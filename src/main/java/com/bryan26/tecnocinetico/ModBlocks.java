package com.bryan26.tecnocinetico; // Asegúrate de que este sea tu paquete

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Tecnocinetico.MODID);

    // --- AÑADIMOS NUESTROS BLOQUES AQUÍ ---

    public static final RegistryObject<Block> MINERAL_DE_PLOMO = registerBlock("mineral_de_plomo",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0f)));

    public static final RegistryObject<Block> MINERAL_DE_PLOMO_DEEPSLATE = registerBlock("mineral_de_plomo_deepslate",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(4.5f)));


    // --- MÉTODOS HELPER ---
    // Este método registra un bloque y automáticamente crea su versión en ítem para el inventario.
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
