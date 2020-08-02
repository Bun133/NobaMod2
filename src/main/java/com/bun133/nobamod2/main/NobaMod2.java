package com.bun133.nobamod2.main;

import com.bun133.nobamod2.init.BlockInit;
import com.bun133.nobamod2.init.InitEntity;
import com.bun133.nobamod2.init.ItemInit;
import com.bun133.nobamod2.init.NobaModItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NobaMod2.MOD_ID)
public class NobaMod2 {
    public static final String MOD_ID="nobamod2";
    public static final String MOD_NAME="Nobamod2";

    public static final ItemGroup ITEM_GROUP = new NobaModItemGroup(MOD_ID, () -> new ItemStack(Items.DIAMOND));

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public NobaMod2(){
        LOGGER.info("Hello From INIT");
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.Items.Instance.ITEMS.register(modEventBus);
        BlockInit.Blocks.INSTANCE.BLOCKS.register(modEventBus);
        InitEntity.ENTITY_TYPE.register(modEventBus);
    }
}
