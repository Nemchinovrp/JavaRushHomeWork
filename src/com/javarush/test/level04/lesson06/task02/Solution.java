package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());

        int max1 = max(number1, number2);
        int max2 = max(number3, number4);

        int maxi = max(max1, max2);

       System.out.println(maxi);


    }
    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
