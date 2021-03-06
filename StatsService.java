package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageAmount(long[] sales) {
        return calculateSum(sales)  / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month +1 ;
        }
        return minMonth +1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int average = calculateAverageAmount(sales);
        int month = 0;
        for (long sale : sales) {

            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverageSales(long[] sales) {
        int aboveAverage = calculateAverageAmount(sales);
        int month = 0;
        for (long sale : sales) {

            if (sale > aboveAverage) {
                month++;
            }
        }
        return month;
    }
}









