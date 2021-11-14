package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long [] total={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =180;
        int actual= service.calculateSum(total);
        assertEquals(expected,actual);
    }

    @Test
    void calculateAverageAmount() {
        StatsService service = new StatsService();
        long [] caa={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =15;
        int actual= service.calculateAverageAmount(caa);
        assertEquals(expected,actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long [] minMonth={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =9;
        int actual= service.minSales(minMonth);
        assertEquals(expected,actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long [] maxMonth={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =6;
        int actual= service.maxSales(maxMonth);
        assertEquals(expected,actual);
    }

    @Test
    void belowAverageSales() {
        StatsService service = new StatsService();
        long [] belowAverage={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual= service.belowAverageSales(belowAverage);
        assertEquals(expected,actual);
    }
    @Test
    void aboveAverageSales() {
        StatsService service = new StatsService();
        long [] aboveAverage={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual= service.aboveAverageSales(aboveAverage);
        assertEquals(expected,actual);
    }
}
