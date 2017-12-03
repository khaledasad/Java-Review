package Inherate;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }


     private void chew ()
    {
        System.out.println("Dogie is chewing(Calling Dog)");
    }

    @Override
    public void eat()
    {
        System.out.println("Dogie is eating(Calling Animal)");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dogie is walking(Calling Dog)");
        super.move(4);

    }

    public void run()
    {
        System.out.println("Dogie is running(Calling Dog)");
        move(8);
    }

    public void moveLegs(int speed)
    {
        System.out.println("Dog moving legs (Calling Dog + Animal()speed)");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog Move() Overide***");
        moveLegs(speed);
        super.move(speed);
    }
}
