package ru.sigma;

import java.util.ArrayList;

/**
 * Created by Student08 on 28.04.2015.
 */
public class Main {

    public static void main(String[] args){
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        b.method1(0);
        c.method1(0);

        ArrayList<ExampleInterface> list = new ArrayList();
        list.add(b);
        list.add(c);

        ExampleInterface obj = list.get(1);
        obj.method1(0);
    }
}
