package OOP;


abstract public class Person {
    protected String name;
    protected int id;
    private static int counter=0;

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

    abstract public void printPerson(); //must override

    abstract public void introduce();

    // can override
    public void sayHi(){
        System.out.println("Hi! This is person " + name + ".");
    }

    // cannot override
    final public void eat(){
        System.out.println("I'm a Person, I'm eating");
    }
}

