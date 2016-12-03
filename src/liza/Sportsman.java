package liza;

public class Sportsman extends Person{
    protected String sponsor;
    protected int worldRanking;

    Sportsman(String sName, String sSponsor, int sWorldRanking){
        super(sName);
        sponsor = sSponsor;
        worldRanking = sWorldRanking;
    }

    public String getSponsor(){
        return sponsor;
    }

    public void setSponsor(String sSponsor){
        sponsor = sSponsor;
    }

    public int getWorldRanking(){
        return worldRanking;
    }

    public void setWorldRanking(int sWorldRanking){
        worldRanking = sWorldRanking;
    }


    public void printPerson(){
        System.out.println(String.format("Name: %s, ID: %d, Sponsor: %s, World Ranking: %d", name, id, sponsor, worldRanking));
    }

    final public void run(){System.out.println(name + " is runnig.");}
    final public void jump(){System.out.println(name + " is jumping.");};
    final public void liftWeight(){System.out.println(name + " is lifting weight.");};

    public void introduce(){
        System.out.println(String.format("Hi! I'm a Sportsman, my name is %s.", name));
    }

    public void doActivity(String activity) throws CannotCodeException{
        if(activity.equals("code")){
            throw new CannotCodeException("Sportsman");
        }
        else {
            System.out.println("Gonna "+activity+" now.");
        }
    }
}
