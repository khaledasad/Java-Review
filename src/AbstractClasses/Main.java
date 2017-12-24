package AbstractClasses;

public class Main {

    public static void main(String[] args) {


        Dog d = new Dog ("poodle");

        d.breathe();
        d.eat();


        //CANT INSTANSIATE AN ABTSRACT CLASS!!!!!!!!!
        Lasta b = new Lasta ("poodle");
        Pinguin p = new Pinguin("Empreror");

        b.breathe();
        b.eat();
        b.fly();

        p.fly();




    }
}
