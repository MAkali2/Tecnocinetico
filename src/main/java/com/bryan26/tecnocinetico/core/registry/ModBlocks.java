package com.bryan26.tecnocinetico.core.registry;

import com.bryan26.tecnocinetico.Tecnocinetico;
import com.bryan26.tecnocinetico.content.block.machines.PrensaElectricaBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, Tecnocinetico.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Tecnocinetico.MOD_ID);

    public static final RegistryObject<Block> PRENSA_ELECTRICA_BLOCK =
        BLOCKS.register("prensa_electrica", PrensaElectricaBlock::new);

    public static final RegistryObject<Item> PRENSA_ELECTRICA_ITEM =
        ITEMS.register("prensa_electrica",
            () -> new BlockItem(PRENSA_ELECTRICA_BLOCK.get(), new Item.Properties()));
}
