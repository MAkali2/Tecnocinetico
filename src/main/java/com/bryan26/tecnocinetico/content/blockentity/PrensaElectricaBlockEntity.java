package com.bryan26.tecnocinetico.content.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.bryan26.tecnocinetico.core.registry.ModBlockEntities;

public class PrensaElectricaBlockEntity extends BlockEntity {
    private final SimpleContainer inventory = new SimpleContainer(2); // 2 slots

    public PrensaElectricaBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PRENSA_ELECTRICA.get(), pos, state);
    }

    public Container getInventory() {
        return inventory;
    }
}