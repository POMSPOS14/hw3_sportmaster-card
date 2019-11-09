package ru.rosbank.javashcool.service;

public class SportmasterBonusService {
    public int calculator(int spentSum, int accumulatedSum) {
        int bonusRatio = 50;

        if (accumulatedSum > 15_000 && accumulatedSum <= 150_000) {
            bonusRatio = 70;
        } else if (accumulatedSum > 150_000) {
            bonusRatio = 100;
        }

        int resultBonus = spentSum * bonusRatio / 1000;

        return resultBonus;
    }
}
