package net.frisk.testmod.item;

import net.frisk.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> AWAKENED_SOUL_SHARD = ITEMS.register("awakened_soul_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DORMANT_SOUL_SHARD = ITEMS.register("dormant_soul_shard",
    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASCENDED_SOUL_SHARD = ITEMS.register("ascended_soul_shard",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
