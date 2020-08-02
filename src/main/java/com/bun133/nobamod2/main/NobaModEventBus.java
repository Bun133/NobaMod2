package com.bun133.nobamod2.main;

import com.bun133.nobamod2.init.InitProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = NobaMod2.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public final class NobaModEventBus {
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event){
        InitProxy.INSTANCE.onRegister(event);
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event){
        InitProxy.INSTANCE.onRegister(event);
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(NobaMod2.MOD_ID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final RegistryObject<T> o){
        return setup(o.get(),o.getId());
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
