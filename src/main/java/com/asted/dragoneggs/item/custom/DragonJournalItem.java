package com.asted.dragoneggs.item.custom;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class DragonJournalItem extends Item
{
    public DragonJournalItem(Properties p_41383_)
    {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide())
        {
            Player player = pContext.getPlayer();

            player.sendMessage(new TranslatableComponent("item.dragoneggs.dragon_journal.placeholder"), player.getUUID());
        }

        return super.useOn(pContext);
    }
}
