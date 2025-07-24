// RUTA: src/main/java/com/bryan26/tecnocinetico/event/ClientEvents.java
package com.bryan26.tecnocinetico.event;

import com.bryan26.tecnocinetico.Tecnocinetico;
import com.bryan26.tecnocinetico.screen.ModMenuTypes;
import com.bryan26.tecnocinetico.screen.PrensaKineticaScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

// Esta anotación le dice a Forge que escuche eventos en el bus de MOD, pero solo en el lado del CLIENTE.
@Mod.EventBusSubscriber(modid = Tecnocinetico.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    // Este méodo se llama durante el evento de configuración del cliente.
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Esta es la línea crucial: le dice a Minecraft qué pantalla abrir para nuestro tipo de menú.
        MenuScreens.register(ModMenuTypes.PRENSA_KINETICA_MENU.get(), PrensaKineticaScreen::new);
    }
}