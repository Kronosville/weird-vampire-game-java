package net.kronosville.marktwain.quests;

final class Quest {

    private final String description;
    private final QuestReward reward;

    private Quest(String description, QuestReward reward) {
        this.description = description;
        this.reward = reward;
    }
}
