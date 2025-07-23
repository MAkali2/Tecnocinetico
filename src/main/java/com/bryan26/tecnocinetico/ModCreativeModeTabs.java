package com.bryan26.tecnocinetico; // Asegúrate de que este sea tu paquete

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

    // Definimos nuestra pestaña
    public static final RegistryObject<CreativeModeTab> TECNOCINETICO_TAB = CREATIVE_MODE_TABS.register("tecnocinetico_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.LINGOTE_DE_PLOMO.get())) // El ítem que será el icono
                    .title(Component.translatable("creativetab.tecnocinetico_tab")) // El nombre de la pestaña
                    .displayItems((pParameters, pOutput) -> {
                        // Aquí añadimos todos los ítems que queremos que aparezcan en la pestaña
                        pOutput.accept(ModItems.LINGOTE_DE_PLOMO.get());
                        pOutput.accept(ModItems.PLOMO_CRUDO.get());

                        pOutput.accept(ModBlocks.MINERAL_DE_PLOMO.get());
                        pOutput.accept(ModBlocks.MINERAL_DE_PLOMO_DEEPSLATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
