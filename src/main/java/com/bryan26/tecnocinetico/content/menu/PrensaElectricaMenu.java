package com.bryan26.tecnocinetico.content.menu;

import com.bryan26.tecnocinetico.content.blockentity.PrensaElectricaBlockEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import com.bryan26.tecnocinetico.core.registry.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class PrensaElectricaMenu extends AbstractContainerMenu {
    private final ContainerLevelAccess access;
    private final PrensaElectricaBlockEntity blockEntity;

    public PrensaElectricaMenu(int id, Inventory playerInventory, FriendlyByteBuf extraData) {
        this(id, playerInventory, playerInventory.player.level(), extraData.readBlockPos());
    }

    public PrensaElectricaMenu(int id, Inventory playerInventory, Level level, BlockPos pos) {
        super(ModMenuTypes.PRENSA_ELECTRICA_MENU.get(), id);
        this.access = ContainerLevelAccess.create(level, pos);

        this.blockEntity = (PrensaElectricaBlockEntity) level.getBlockEntity(pos);
        var inventory = blockEntity.getInventory();

        this.addSlot(new Slot(inventory, 0, 56, 35));
        this.addSlot(new Slot(inventory, 1, 116, 35));

        for (int row = 0; row < 3; ++row)
            for (int col = 0; col < 9; ++col)
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));

        for (int col = 0; col < 9; ++col)
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        return ItemStack.EMPTY;
    }
}