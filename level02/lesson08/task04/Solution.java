package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Использовать функцию из задачи 1.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        return min(min(a, b), min(c, d));

    }

    public static int min(int a, int b)
    {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
}
