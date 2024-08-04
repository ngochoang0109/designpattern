package com.hoangtn.structuralpattern.adapter;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }


    // class A, class B
    // create adapter class
    // determinate what client need to utilize for class's service
    // example: client need to class A use service of class B.
    // target class is A, and adapterB make class B suitable on class A
    // so need create adapterB implement/extend class A, reference class B to adapterB.
}
