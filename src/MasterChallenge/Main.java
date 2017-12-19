package MasterChallenge;

public class Main {

        public static void main(String[] args)
        {

            Burger b = new Burger("Brown", "Beef", "Standard", 1.25);
            //double price = b.totalPrice();

//            b.addBurgerAddition1("Tomato",.25);
//            b.addBurgerAddition2("Lettuce", .75);
//            b.addBurgerAddition3("Carrot", .15);
//            b.addBurgerAddition4("Fries", 2.15);
//
//            System.out.println("Total Price due " + b.totalPrice());

//
//            HeathyBurger hb = new HeathyBurger("Turkey", 4.50);
//
//          //  hb.addBurgerAddition1("Potatos", .50);
//            //VS
//            hb.addHealthAddition1("Lettuce", .75);
//
//            hb.totalPrice();



            DeluxeBurger db = new DeluxeBurger();
            //db.addBurgerAddition1("sdadds", 50);
            //db.totalPrice();

            System.out.println("Total Delxe burger Price: " + db.totalPrice());

        }

}
