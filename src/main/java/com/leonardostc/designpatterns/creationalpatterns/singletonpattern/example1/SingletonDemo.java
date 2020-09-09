package com.leonardostc.designpatterns.creationalpatterns.singletonpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class SingletonDemo {


    public static void main(String[] args) {


        Counter counter1 = Counter.getInstance();
        System.out.println("Counter1: "+counter1);

        Counter counter2 = Counter.getInstance();
        System.out.println("Counter2: "+counter2);

        counter1.increment();

        Counter counter3 = Counter.getInstance();
        System.out.println("Counter3: "+counter3);

        counter2.increment();

        System.out.println("Counter1: "+counter1);
        System.out.println("Counter2: "+counter2);
        System.out.println("Counter3: "+counter3);

        counter3.increment();

        System.out.println("Counter1: "+counter1);
        System.out.println("Counter2: "+counter2);
        System.out.println("Counter3: "+counter3);

        counter1.increment();

        System.out.println("Counter1: "+counter1);
        System.out.println("Counter2: "+counter2);
        System.out.println("Counter3: "+counter3);

    }


}
