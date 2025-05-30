package ru.netology;

public class BonusService {
    public int calculateBonus(int amount) {
        if (amount < 1000) {
            return 0;
        }
        int bonus = (amount - 1000) / 100;
        if (bonus > 1000) {
            return 100;
        }
        return bonus;
    }
}