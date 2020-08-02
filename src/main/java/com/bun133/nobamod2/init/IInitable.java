package com.bun133.nobamod2.init;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@SuppressWarnings("SpellCheckingInspection")
public abstract class IInitable<T extends IForgeRegistryEntry<T>> {
    public Class TType;
    public IInitable(Class<T> t){
        TType=t;
    }
    abstract void onInit();
    abstract void onRegister(RegistryEvent.Register<T> register);
}
