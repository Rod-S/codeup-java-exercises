package oopLecture;

public class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName;


        // SLIDE 4

//        // instance variables
        public String firstName;
        public String lastName;

        // instance method no static keyword
        public String sayHello() {
                return lastName + ", " + firstName + " says hi!";
        }


        // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                                  // instance property

        public static void main(String[] args) {
                System.out.println(Person.worldPopulation);

                System.out.println(oopLecture.Person.worldPopulation);
                oopLecture.Person.worldPopulation -= 1;
                System.out.println(worldPopulation);
                System.out.println();
//
//
                oopLecture.Person theBestDrummerAlive = new oopLecture.Person();
                theBestDrummerAlive.name = "Neil Peart";
                oopLecture.Person.worldPopulation += 1; // accessing a static property
                // this also works, but is usually not a good idea
                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
                // DONT DO THIS, it will not compile
//                 System.out.println(oopLecture.Person.name);
        }

}
