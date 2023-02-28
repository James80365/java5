package ru.netology;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можно отдыхать
                count++; // счетчик отдыха увеличивается
                money = (income + money - expenses) / 3; // снижение накопления
            } else {
                money = income + money -expenses;

            }
        }
        return count;
    }
}
