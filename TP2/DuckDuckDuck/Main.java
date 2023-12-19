package TP2.DuckDuckDuck;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.quack();
        mallard.fly();
        
        RedheadDuck redhead = new RedheadDuck();
        redhead.display();
        redhead.swim();
        redhead.quack();
        redhead.fly();
        
        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.quack();
        
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.swim();
    }
}
