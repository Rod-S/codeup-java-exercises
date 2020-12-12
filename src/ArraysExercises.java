import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] personArray, Person person) {
        Person[] personArray2 = new Person[personArray.length +1];
        for (int i = 0; i< personArray.length; i++) {
            personArray2[i] = personArray[i];
        }
        personArray2[personArray2.length -1] = person;
//        System.out.println(personArray2[personArray2.length]);
        return personArray2;
        }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        Array object incorrectly referenced
//        System.out.println(numbers);

        Person[] personArray = new Person[4];
        personArray[0] = new Person("Rod");
        personArray[1] = new Person("James");
        personArray[2] = new Person("John");
        personArray[3] = new Person("Jim");
//        System.out.println(Arrays.toString(personArray));
//        for (int i = 0; i < personArray.length; i++) {
//            System.out.println(personArray[i].getName());
//        }
        personArray = addPerson(personArray, new Person("Johnson"));
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].getName());
        }
    }
}
