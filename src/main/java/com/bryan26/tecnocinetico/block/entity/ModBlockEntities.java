// RUTA: src/main/java/com/bryan26/tecnocinetico/block/entity/ModBlockEntities.java
package com.bryan26.tecnocinetico.block.entity;

import com.bryan26.tecnocinetico.ModBlocks;
import com.bryan26.tecnocinetico.Tecnocinetico;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Tecnocinetico.MODID);

    // Registramos el tipo de BlockEntity para nuestra prensa.
    public static final RegistryObject<BlockEntityType<PrensaKineticaBlockEntity>> PRENSA_KINETICA_BE =
            BLOCK_ENTITIES.register("prensa_kinetica_be", () ->
                    BlockEntityType.Builder.of(PrensaKineticaBlockEntity::new,
                            ModBlocks.PRENSA_KINETICA.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
