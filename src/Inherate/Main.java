package Inherate;

public class Main {


    public static void main(String[]args)
    {
        Animal animal = new Animal("-.-", 1,1,5,12);
        Dog doge = new Dog("Stupid", 1,2,3,4,5,6,"Weird");

        doge.eat();
        doge.walk();
        //doge.move(10);
        doge.run();



    }
}
