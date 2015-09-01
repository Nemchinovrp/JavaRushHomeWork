package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(0,"мама");
        arrayList.add(1,"именно");
        arrayList.add(2,"мыла");
        arrayList.add(3,"именно");
        arrayList.add(4,"раму");
        arrayList.add(5,"именно");
        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
