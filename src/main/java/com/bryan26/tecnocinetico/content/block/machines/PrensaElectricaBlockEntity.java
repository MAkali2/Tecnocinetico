package com.bryan26.tecnocinetico.content.block.machines;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class PrensaElectricaBlockEntity extends BlockEntity {

    public PrensaElectricaBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.BLOCK_ENTITY_TYPE, pos, state);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        // Aquí puedes añadir lógica que se ejecute al cargar el bloque
    }

    @Override
    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        // Guarda datos adicionales aquí
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        // Carga datos adicionales aquí
    }

    public static void tick(ServerLevel level, BlockPos pos, BlockState state, PrensaElectricaBlockEntity entity) {
        // Lógica de tick para la Prensa Electrica
    }

    @Override
    public void getDrops(List<ItemStack> drops, LootContext.Builder context) {
        super.getDrops(drops, context);
        // Aquí puedes añadir lógica para los drops
    }
}