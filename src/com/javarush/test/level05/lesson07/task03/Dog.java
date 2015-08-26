package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int growt;
    int color;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int growt)
    {
        this.name = name;
        this.growt = growt;
    }
    public void initialize(String name, int growt, int color)
    {
        this.name = name;
        this.growt = growt;
        this.color = color;
    }
}
