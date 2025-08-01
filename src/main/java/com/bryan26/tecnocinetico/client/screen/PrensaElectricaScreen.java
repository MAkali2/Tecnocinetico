package com.bryan26.tecnocinetico.client.screen;

import com.bryan26.tecnocinetico.content.menu.PrensaElectricaMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class PrensaElectricaScreen extends AbstractContainerScreen<PrensaElectricaMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation("tecnocinetico", "textures/gui/prensa_electrica.png");

    public PrensaElectricaScreen(PrensaElectricaMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 176; // ancho típico de GUI
        this.imageHeight = 166; // alto típico de GUI
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float partialTicks, int mouseX, int mouseY) {
        graphics.blit(TEXTURE, leftPos, topPos, 0, 0, imageWidth, imageHeight);
    }

    @Override
    protected void renderLabels(GuiGraphics graphics, int mouseX, int mouseY) {
        graphics.drawString(font, title, 8, 6, 4210752, false);
        graphics.drawString(font, playerInventoryTitle, 8, imageHeight - 94, 4210752, false);
    }
}