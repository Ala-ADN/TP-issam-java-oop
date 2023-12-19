package TP2.DuckDuckDuck;

public class MallardDuck extends Duck implements Quackable, Flyable {
    public void swim() {
        System.out.println("MallardDuck swim");
    }
    public void display() {
        System.out.println("This is a MallardDuck🦆");
    }
    public void quack() {
        System.out.println("MallardDuck quack");
    }
    public void fly() {
        System.out.println("MallardDuck fly");
    }
}
