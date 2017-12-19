package Polymorphism.Chalange;

    class Car
    {
        private int cylinder;
        private String name;
        private int wheels;
        private boolean engine;

        //did not pass in other 2 attributes so they r not needed in subclasses
        public Car(int cylinder, String name) {
            this.cylinder = cylinder;
            this.name = name;
            this.wheels = 4;
            this.engine = true;
        }

        public int getCylinder() {
            return cylinder;
        }

        public String getName() {
            return name;
        }

        public int getWheels() {
            return wheels;
        }

        public boolean isEngine() {
            return engine;
        }

        public String startEngine()
        {
            return "Engine Start";
        }

        public String accelerate()
        {
             return "Accelarted";
        }

        public String brake()
        {
            return "Brake";
        }

    }

    class Volvo extends Car
    {
        public Volvo(int cylinder, String name) {
            super(cylinder, name);
        }

        //anthoer way to call class ur in or calling from
        @Override
        public String startEngine() {
            return getClass().getSimpleName() + "Start with Key";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "Does not go Fast";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + "Good Break";
        }
    }
    class Ford extends Car
    {
        public Ford(int cylinder, String name) {
            super(cylinder, name);
        }

        @Override
        public String startEngine() {
            return "Cant Start  ==> Ford";
        }

        @Override
        public String accelerate() {
            return "Does go Fast ==> Ford";
        }

        @Override
        public String brake() {
            return "No Breaks ==> Ford";
        }
    }
    class Lada extends Car
    {
        public Lada(int cylinder, String name) {
            super(cylinder, name);
        }

        @Override
        public String startEngine() {
            return "Start with voice actiator ==> Lada";
        }

        @Override
        public String accelerate() {
            return "Car is Flying ==> Lada";
        }

        @Override
        public String brake() {
            return "Best Breaks ==> Lada";
        }
    }


    public class Main {

        public static void main (String [] args)
        {
            Car c = new Car(4,"Potato");

                System.out.println(c.getName() + "\n" +
                        c.startEngine() + "\n" +
                        c.accelerate() + "\n" +
                        c.brake());


            Ford f = new Ford(-4,"Taurus");
            System.out.println(f.getName() + "\n" +
                    f.startEngine() + "\n" +
                    f.accelerate() + "\n" +
                    f.brake());

        }
    }
