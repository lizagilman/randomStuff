package OOP;

public class CannotCodeException extends Exception{
    public CannotCodeException(String person){
        super(person + " cannot code");
    }
}
