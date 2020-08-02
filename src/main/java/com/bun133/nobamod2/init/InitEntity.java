package com.bun133.nobamod2.init;

import com.bun133.nobamod2.entity.EntityNobaman;
import com.bun133.nobamod2.main.NobaMod2;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntity{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = new DeferredRegister<>(ForgeRegistries.ENTITIES, NobaMod2.MOD_ID);
    public static final String ENTITY_NOBA_NAME = "entity_noba";
    public static final RegistryObject<EntityType<EntityNobaman>> ENTITY_NOBA=ENTITY_TYPE.register(
        ENTITY_NOBA_NAME,
            () -> EntityType.Builder.<EntityNobaman>create(EntityNobaman::new, EntityClassification.MONSTER)
            .size(EntityType.ZOMBIE.getWidth(),EntityType.ZOMBIE.getHeight())
            .build(new ResourceLocation(NobaMod2.MOD_ID,ENTITY_NOBA_NAME).toString())
    );
}
