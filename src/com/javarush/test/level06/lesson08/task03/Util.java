package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        double a = y2 - y1;
        double b = x2 - x1;
        double c = 0;
        c = Math.sqrt(((a*a) + (b*b)));
        return c;
    }
    public static void main(String[] args){
        System.out.print(Util.getDistance(2, 2,4, 4));
    }
}