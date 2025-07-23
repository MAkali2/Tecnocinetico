package com.bryan26.tecnocinetico;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Tecnocinetico.MODID)
public class Tecnocinetico {
    public static final String MODID = "tecnocinetico";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Tecnocinetico() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // ¡Activamos nuestros nuevos catálogos!
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        LOGGER.info("¡VICTORIA! El mod Tecnocinetico se está cargando.");
    }
}
