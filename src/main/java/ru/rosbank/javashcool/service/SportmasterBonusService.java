package ru.rosbank.javashcool.service;

public class SportmasterBonusService {
    public int calculator(int spentSum, int accumulatedSum) {
        int blueRange = 15_000;
        int silverRange =150_000;
        int bonusRatio;



        if(accumulatedSum > silverRange){
            bonusRatio = 100;
            return resultBonus( spentSum, bonusRatio);
        }

        if(accumulatedSum > blueRange){
            bonusRatio = 70;
            return resultBonus( spentSum, bonusRatio);
        }

        bonusRatio = 50;
        return resultBonus( spentSum, bonusRatio);
    }

    int resultBonus(int spentSum, int bonusRatio){

        return spentSum * bonusRatio / 1000;
    }
}
