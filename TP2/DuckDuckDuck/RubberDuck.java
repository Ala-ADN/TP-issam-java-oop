package TP2.DuckDuckDuck;

public class RubberDuck extends Duck implements Quackable {
    public void swim() {
        System.out.println("RubberDuck swim");
    }
    public void display() {
        System.out.println("This is a RubberDuck🦆");
    }
    public void quack() {
        System.out.println("RubberDuck quack");
    }
}
