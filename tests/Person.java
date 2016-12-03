package liza;


public class Person {
    private static int counter=0;
    protected String name;
    protected int id;

     Person(String pName){
        name = pName;
        id = ++counter;
    }

    public String getName(){
        return name;
    }

    public void setName(String pName){
        name = pName;
    }

    public int getId(){
        return id;
    }

    public void speak(){
        System.out.println("Hi! This is person " + name + " speaking.");
    }


    public void printPerson(){
        System.out.println("Name: "+name+", id: "+id);
    }
}
