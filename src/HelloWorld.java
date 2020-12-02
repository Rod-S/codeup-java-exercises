public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Rod";
        System.out.println(myString);


//        char myString2 = (char) myString;

//        float myString3 = (float) myString;

//        long myNumber;
//        compilation error, needs to be initialized before logging
//        System.out.println(myNumber);

//        3.14 is type double not long
//        myNumber = 3.14;

//        myNumber = 123;
//      long is compatible with integers but is not with decimal numbers

        double myNumber = (double) 3.14;
        //change to double or typecast to double
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        System.out.println(myString.getClass());

        //The first code block logs the value of x before incrementation (x++)
        //The second code block logs the value of x after incrementation (++x)

//        String class = "Hello";
//        Class is a reseved word

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree;
        System.out.println(o);
        int threes = (int) o;
        int three = 3;
        System.out.println(myString.getClass());
//        System.out.println(three.getClass());
        System.out.println(o.getClass());
//        int three = (int) o;

        //Object is type String
//        int x = 4;
////        x = x + 5;
//        x+=5;

//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y*=x;

        int x = 10;
        int y = 2;
        x /=  y;
        y -= x;


        System.out.print(x + "" + y);
    }

}
