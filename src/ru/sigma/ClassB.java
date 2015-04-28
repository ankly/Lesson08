package ru.sigma;

/**
 * Created by Student08 on 28.04.2015.
 */
public class ClassB extends ClassA implements ExampleInterface{
    @Override
    public void method1(int arg1) {
        System.out.println("called method1 from ClassB");
    }
    public void method2(){

    }
}
