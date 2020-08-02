package com.bun133.nobamod2.init;

import com.bun133.nobamod2.main.NobaMod2;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.bun133.nobamod2.main.NobaModEventBus.setup;

public class ItemInit extends IInitable<Item> {
    public ItemInit() {super(Item.class);}

    @Override
    void onInit() {
    }

    @Override
    void onRegister(RegistryEvent.Register<Item> register) {
//        Items.Instance.ITEMS.getEntries().forEach(
//                (item) -> { register.getRegistry().register(setup(item));}
//        );
        BlockInit.Blocks.INSTANCE.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .forEach(
                        (block) -> {
                            final Item.Properties properties = new Item.Properties().group(NobaMod2.ITEM_GROUP);
                            final BlockItem blockItem = new BlockItem(block, properties);
                            blockItem.setRegistryName(block.getRegistryName());
                            register.getRegistry().register(blockItem);
                        }
                );
    }

    public static class Items{
        public static final Items Instance=new Items();
        public final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, NobaMod2.MOD_ID);
        public final RegistryObject<Item> nobaman_item=ITEMS.register("nobaman_item",()->new Item(new Item.Properties().group(NobaMod2.ITEM_GROUP)));
    }
}
