package com.bun133.nobamod2.init;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.ArrayList;
import java.util.List;

public class InitProxy {
    public static final InitProxy INSTANCE = new InitProxy();
    private List<IInitable<?>> init=new ArrayList<>();

    public InitProxy(){
        init.add(new ItemInit());
        init.add(new BlockInit());
    }

    public void onInit(){
        for(IInitable<?> i: init){
            i.onInit();
        }
    }

    public void onRegister(RegistryEvent.Register<?> register){
        onRegister(register,init);
    }

    public static <T extends IForgeRegistryEntry<T>> void onRegister(RegistryEvent.Register<T> register,List<IInitable<?>> init) {
        for(IInitable<T> i: getAll(register,init)){
            i.onRegister(register);
        }
    }

    public static <T extends IForgeRegistryEntry<T>> RegistryEvent.Register<T> get(IInitable<T> init, RegistryEvent.Register<?> register){
        return register.getRegistry().getRegistrySuperType() == init.TType ? (RegistryEvent.Register<T>)register:null;
    }

    public static <T extends IForgeRegistryEntry<T>> List<IInitable<T>> getAll(RegistryEvent.Register<T> register,List<IInitable<?>> init){
        List<IInitable<T>> tList=new ArrayList<IInitable<T>>();
        for(IInitable<?> i:init){
            if(register.getRegistry().getRegistrySuperType() == i.TType) tList.add((IInitable<T>)i);
        }
        return tList;
    }
}
