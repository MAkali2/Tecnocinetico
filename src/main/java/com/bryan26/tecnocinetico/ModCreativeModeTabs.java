// RUTA: src/main/java/com/bryan26/tecnocinetico/ModCreativeModeTabs.java
// No olvides añadir el nuevo ítem a la pestaña de creativo para poder verlo.
package com.bryan26.tecnocinetico;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tecnocinetico.MODID);

    public static final RegistryObject<CreativeModeTab> TECNOCINETICO_TAB = CREATIVE_MODE_TABS.register("tecnocinetico_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.LINGOTE_DE_PLOMO.get()))
                    .title(Component.translatable("creativetab.tecnocinetico_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LINGOTE_DE_PLOMO.get());
                        pOutput.accept(ModItems.PLOMO_CRUDO.get());
                        pOutput.accept(ModItems.POLVO_DE_PLOMO.get()); // <-- ¡Añade esta línea!

                        pOutput.accept(ModBlocks.MINERAL_DE_PLOMO.get());
                        pOutput.accept(ModBlocks.MINERAL_DE_PLOMO_DEEPSLATE.get());
                        pOutput.accept(ModBlocks.PRENSA_KINETICA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}