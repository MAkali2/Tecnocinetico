package com.bryan26.tecnocinetico.core.registry;

import com.bryan26.tecnocinetico.Tecnocinetico;
import com.bryan26.tecnocinetico.content.menu.PrensaElectricaMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Tecnocinetico.MOD_ID);

    public static final RegistryObject<MenuType<PrensaElectricaMenu>> PRENSA_ELECTRICA_MENU =
            MENU_TYPES.register("prensa_electrica_menu",
                    () -> IForgeMenuType.create(PrensaElectricaMenu::new));
}