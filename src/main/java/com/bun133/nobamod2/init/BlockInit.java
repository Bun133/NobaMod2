package com.bun133.nobamod2.init;

import com.bun133.nobamod2.block.NobaBlock;
import com.bun133.nobamod2.block.NobaOre;
import com.bun133.nobamod2.main.NobaMod2;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.bun133.nobamod2.main.NobaModEventBus.setup;

public class BlockInit extends IInitable<Block>{
    public BlockInit() {
        super(Block.class);
    }

    @Override
    void onInit() {}

    @Override
    void onRegister(RegistryEvent.Register<Block> register) {
    }

    public static class Blocks{
        public static final Blocks INSTANCE = new Blocks();
        public final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, NobaMod2.MOD_ID);
        public final RegistryObject<Block> noba_ore = BLOCKS.register(
                "noba_ore",
                ()-> new NobaOre(Block.Properties
                        .create(Material.ROCK)
                        .noDrops()
                        .hardnessAndResistance(3.0F, 3.0F)
                ));
        public final RegistryObject<Block> noba_block = BLOCKS.register(
                "noba_block",
                ()-> new NobaBlock(Block.Properties
                        .create(Material.IRON)
                        .hardnessAndResistance(3.0F, 3.0F)
                        .lightValue(15)
                ));
    }
}
