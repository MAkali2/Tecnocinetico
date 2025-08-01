package com.bryan26.tecnocinetico.core.registry;

import com.bryan26.tecnocinetico.content.block.machines.PrensaElectricaBlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "tecnocinetico");

    public static final RegistryObject<BlockEntityType<PrensaElectricaBlockEntity>> PRENSA_ELECTRICA =
        BLOCK_ENTITIES.register("prensa_electrica",
            () -> BlockEntityType.Builder.of(PrensaElectricaBlockEntity::new, ModBlocks.PRENSA_ELECTRICA_BLOCK.get())
                .build(null));
}