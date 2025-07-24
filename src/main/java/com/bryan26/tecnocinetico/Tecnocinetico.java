// RUTA: src/main/java/com/bryan26/tecnocinetico/Tecnocinetico.java
package com.bryan26.tecnocinetico;

import com.bryan26.tecnocinetico.block.entity.ModBlockEntities;
import com.bryan26.tecnocinetico.recipe.ModRecipes; // Importar
import com.bryan26.tecnocinetico.screen.ModMenuTypes;
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

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus); // <-- ¡Añade esta línea!
        ModWorldGen.register(modEventBus);

        LOGGER.info("¡VICTORIA! El mod Tecnocinetico se está cargando.");
    }
}
