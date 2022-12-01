package ru.netology.javaqa.javaqamnv.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    // подготовка тестовых данных

    @CsvFileSource(resources = "/data.csv")

    void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        // long amount = 1000;
        // boolean registered = true;
        // long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

  /*  @ParameterizedTest
    void shouldCalculateForRegisteredAndOverLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateForUnRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateForUnRegisteredAndOverLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }*/
}

/* import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        int expected = 50;
        int actual = service.calcBonus(5_000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();
        int expected = 150;
        int actual = service.calcBonus(5_000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredOffLimit() {
        BonusService service = new BonusService();
        int expected = 500;
        int actual = service.calcBonus(40_000, true);
        Assertions.assertEquals(expected, actual);
    }
}
*/
