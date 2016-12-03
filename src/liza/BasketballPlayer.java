package liza;

public class BasketballPlayer extends Sportsman implements IAthlete{
    private String team;

    BasketballPlayer(String bpName, String bpSponsor, int bpWorldRanking, String bpTeam){
        super(bpName, bpSponsor, bpWorldRanking);
        team = bpTeam;
    }

    public void practiceSkills(){
        System.out.println(name+" practicing basketball skills.");
    }

    public void doFitnessTraining(){
        System.out.println(name+" doing basketball specific fitness.");
    }

    public void compete(){
        System.out.println(name+" competing in NBA.");
    }

    public void playBasketball(){
        System.out.println(name+" is playing basketball.");
    }
}