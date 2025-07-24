// RUTA: src/main/java/com/bryan26/tecnocinetico/recipe/ModRecipes.java
package com.bryan26.tecnocinetico.recipe;

import com.bryan26.tecnocinetico.Tecnocinetico;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Tecnocinetico.MODID);

    public static final RegistryObject<RecipeSerializer<PrensaKineticaRecipe>> PULVERIZANDO_SERIALIZER =
            SERIALIZERS.register("pulverizando", () -> PrensaKineticaRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
