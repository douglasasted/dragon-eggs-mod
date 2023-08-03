package com.asted.dragoneggs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab
{
    public static final CreativeModeTab DRAGON_EGGS_TAB = new CreativeModeTab("dragoneggstab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.DRAGON_EGG.get());
        }
    };
}
