package com.bryan26.tecnocinetico.core.registry;

import com.bryan26.tecnocinetico.Tecnocinetico;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tecnocinetico.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TECNOCINETICO_TAB =
        CREATIVE_MODE_TABS.register("tecnocinetico_tab",
            () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.tecnocinetico_tab"))
                .icon(() -> new ItemStack(ModBlocks.PRENSA_ELECTRICA_ITEM.get()))
                .displayItems((parameters, output) -> {
                    output.accept(ModBlocks.PRENSA_ELECTRICA_ITEM.get());
                })
                .build());
}
