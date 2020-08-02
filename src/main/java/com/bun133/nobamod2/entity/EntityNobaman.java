package com.bun133.nobamod2.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class EntityNobaman extends ZombieEntity {
    public EntityNobaman(EntityType<? extends EntityNobaman> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();


    }
}
