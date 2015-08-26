package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader readerString = new BufferedReader(new InputStreamReader(System.in));
        return readerString.readLine();

    }

    public static int readInt() throws Exception
    {
        BufferedReader readerInt = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(readerInt.readLine());

    }

    public static double readDouble() throws Exception
    {
        BufferedReader readerDouble = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(readerDouble.readLine());

    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader readerBoolean = new BufferedReader(new InputStreamReader(System.in));
        Boolean bool = true;
        if (readerBoolean.readLine().equals("true")) bool = true;

        else if (readerBoolean.readLine().equals("false")) bool = false;

        return bool;
    }
}
