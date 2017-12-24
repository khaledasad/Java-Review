package AbstractClasses;

import com.sun.org.apache.xpath.internal.SourceTree;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
     System.out.println("Breathe in, breathe out, repeat");

    }

   // public abstract void fly();
    //VS


    @Override
    public void fly() {
        System.out.println(getName() + " Flying fast");
    }
}
