package com.bryan26.tecnocinetico.core.registry;

import com.bryan26.tecnocinetico.content.block.machines.PrensaElectricaBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "tecnocinetico");

    public static final RegistryObject<Block> PRENSA_ELECTRICA_BLOCK = BLOCKS.register("prensa_electrica",
        () -> new PrensaElectricaBlock(Block.Properties.of(Material.METAL).strength(3.5F)));
}