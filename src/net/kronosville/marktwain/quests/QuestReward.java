package net.kronosville.marktwain.quests;

import net.kronosville.marktwain.items.ItemStack;

final class QuestReward {

    private final int currency;
    private final ItemStack[] items;

    QuestReward(int currency, ItemStack... items) {
        this.currency = currency;
        this.items = items;
    }
}
