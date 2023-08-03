package com.asted.dragoneggs.item;

import com.asted.dragoneggs.DragonEggs;
import com.asted.dragoneggs.item.custom.DragonJournalItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    // Creating a list of items for the mod registered for forge
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonEggs.MOD_ID);


    // Items
    // Dragon bone item
    public static final RegistryObject<Item> DRAGON_BONE = ITEMS.register("dragon_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.DRAGON_EGGS_TAB)));
    // Dragon scale item
    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.DRAGON_EGGS_TAB)));
    // Dragon egg item
    public static final RegistryObject<Item> DRAGON_EGG = ITEMS.register("dragon_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.DRAGON_EGGS_TAB)));
    // Dragon journal item
    public static final RegistryObject<Item> DRAGON_JOURNAL = ITEMS.register("dragon_journal",
            () -> new DragonJournalItem(new Item.Properties().tab(ModCreativeModTab.DRAGON_EGGS_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
