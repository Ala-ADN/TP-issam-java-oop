package TP2.DuckDuckDuck;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    public void swim() {
        System.out.println("RedheadDuck swim");
    }
    public void display() {
        System.out.println("This is a RedheadDuck🦆");
    }
    public void quack() {
        System.out.println("RedheadDuck quack");
    }
    public void fly() {
        System.out.println("RedheadDuck fly");
    }
}
