package ru.rosbank.javashcool.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterBonusServiceTest {

    @Test
    void blueCardCheck() {
        SportmasterBonusService service = new SportmasterBonusService();
        int spentSum = 20_000;
        int accumulatedSum = 7_000;

        int result = service.calculator(spentSum, accumulatedSum);

        assertEquals(result, 1000);
    }

    @Test
    void silverCardCheck() {
        SportmasterBonusService service = new SportmasterBonusService();
        int spentSum = 20_000;
        int accumulatedSum = 20_000;

        int result = service.calculator(spentSum, accumulatedSum);

        assertEquals(result, 1400);
    }

    @Test
    void goldCardCheck() {
        SportmasterBonusService service = new SportmasterBonusService();
        int spentSum = 20_000;
        int accumulatedSum = 150_001;

        int result = service.calculator(spentSum, accumulatedSum);

        assertEquals(result, 2000);
    }
}