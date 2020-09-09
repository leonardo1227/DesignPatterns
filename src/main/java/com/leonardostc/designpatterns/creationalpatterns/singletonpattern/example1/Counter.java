package com.leonardostc.designpatterns.creationalpatterns.singletonpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class Counter {

    private static Counter instance;

    private Counter() {

        //This protects from instantiation through Reflection
        if(instance!=null)
            throw new RuntimeException("User getInstance() method to get the single instance of this class!");

    }

    public static Counter getInstance(){
        if(instance==null){
            synchronized (Counter.class){
                if(instance==null)
                    instance = new Counter();
            }
        }
        return instance;
    }

    private Integer counter = Integer.valueOf(0);


    public Integer getValue(){
        return this.counter;
    }

    public Integer increment(){
        this.counter++;
        System.out.println("Incremented to: "+this.counter);
        return this.counter;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }
}
