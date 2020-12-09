public class Person {

    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!", this.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Rod");
        String p1Name = p1.getName();
        System.out.println(p1Name);
        p1.sayHello();
    }
}
