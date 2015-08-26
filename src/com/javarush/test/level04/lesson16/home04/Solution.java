package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String lnum1 = reader.readLine();
        String lnum2 = reader.readLine();
        String lnum3 = reader.readLine();
        int num1 = Integer.parseInt(lnum1);
        int num2 = Integer.parseInt(lnum2);
        int num3 = Integer.parseInt(lnum3);
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + num3+"."+num2+"."+num1);
    }
}
