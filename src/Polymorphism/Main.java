package Polymorphism;

    class Movie
    {
        private String name;

        public Movie(String name) {
            this.name = name;
        }
        //here the forgetable movie will be pulled from since it its not in Forgatable class
        //output= no plot here
        public String plot()
        {
            return "No Plot here";
        }

        public String getName() {
            return name;
        }
    }

    class Jaws extends Movie
    {
        //constrictor
        public Jaws()
        {
            super("Jaws");
        }

        //overwriting
        public String plot()
        {
            return "Sharks eats potato's";
        }
    }

    class IndependenceDay extends Movie
    {
        public IndependenceDay()
            {
                super("Potato Day");
            }

        @Override
        public String plot()
        {
            return "They are taking over with their potato's";
        }
    }


    class Gladiator extends Movie {
        public Gladiator()
        {
            super("Gladiator");
        }

        @Override
        public String plot()
        {
            return "Like a Storm";
        }
    }

    class LepaSelaLepoGore extends Movie
    {
        public LepaSelaLepoGore() {
            super("Lepa Sela Lepo Gore");
        }

        @Override
        public String plot() {
            return "Lepa Sela Bas lepo gore";
        }
    }

    class ForgetableMovie extends  Movie
    {
        public ForgetableMovie()
        {
            super("Forgetable");
        }

        // No overwrite

    }




public class Main {

    public static void main (String [] args)
    {
        for(int i = 1; i < 11; i++)
        {
            //Movie method RandomMovie called
            Movie m = randomMovie();
            System.out.println("Movie Number: " +  i);
            System.out.println("Movie Name: " + m.plot());
            System.out.println("Movie Geter: " + m.getName() + "\n" );
        }


    }

        //Method no classs !
        public static Movie randomMovie()
        {
            //Math.random() is douing Double and we cast it to do Intiger
            int random = (int) (Math.random()* 5) + 1;

            System.out.println("Random Number: " + random);
            switch (random)
            {
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new Gladiator();
                case 4:
                    return new LepaSelaLepoGore();
                case 5:
                    return new ForgetableMovie();
            }
            return null;
        }

    }


