package net.frisk.testmod.item;

import net.frisk.testmod.TestMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register ("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASCENDED_SOUL_SHARD.get()))
                    .title(Component.translatable("creative.test_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AWAKENED_SOUL_SHARD.get());
                        pOutput.accept(ModItems.DORMANT_SOUL_SHARD.get());
                        pOutput.accept(ModItems.ASCENDED_SOUL_SHARD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
