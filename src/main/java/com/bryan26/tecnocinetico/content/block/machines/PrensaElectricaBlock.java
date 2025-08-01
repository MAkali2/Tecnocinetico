package com.bryan26.tecnocinetico.content.block.machines;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;

public class PrensaElectricaBlock extends Block implements EntityBlock {
    public PrensaElectricaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PrensaElectricaBlockEntity(pos, state);
    }
}