package com.bun133.nobamod2.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class NobaModItemGroup extends ItemGroup {
    private final Supplier<ItemStack> iconSupplier;

    public NobaModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}
