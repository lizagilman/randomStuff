package tests;


import tests.*;

public class Athlete extends tests.Person {
    private int worldRanking;

    Athlete(String name, int aWorldRanking){
        super(name);
        worldRanking=aWorldRanking;
    }

//    public void speak(){
//       System.out.println("Sportsman "+ name +" is speaking!");
//    }

    public void printPerson(){
        System.out.println("Name: "+name+", id: "+id+ ", World Ranking: " +worldRanking);
    }

    public void jump(){
        System.out.println("Sportsman "+ name +" jumping!");
    }


}
