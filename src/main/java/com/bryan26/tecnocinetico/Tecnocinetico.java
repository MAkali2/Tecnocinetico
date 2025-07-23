package com.bryan26.tecnocinetico; // Tu paquete, que ahora es correcto

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// Esta línea le dice a Forge que esta es la clase principal de tu mod
@Mod(Tecnocinetico.MODID)
public class Tecnocinetico {
    // El ID de tu mod, que debe coincidir con el de tus otros archivos
    public static final String MODID = "tecnocinetico";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Tecnocinetico() {
        // Este mensaje aparecerá en la consola cuando el juego se inicie
        LOGGER.info("¡VICTORIA! El mod Tecnocinetico se está cargando.");
    }
}