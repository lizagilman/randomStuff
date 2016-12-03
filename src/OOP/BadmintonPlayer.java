package OOP;


public class BadmintonPlayer extends Sportsman implements IAthlete{
    private String racketModel;

    public BadmintonPlayer(String bpName, String bpSponsor, int bpWorldRanking, String bpRacketModel){
        super(bpName, bpSponsor, bpWorldRanking);
        racketModel = bpRacketModel;
    }

    // overriding parent
    public void printPerson(){
        System.out.println(String.format("Name: %s, ID: %d, Sponsor: %s, World Ranking: %d, Racket: %s", name, id, sponsor, worldRanking, racketModel));
    }

    public void tellSportsProfession(){
        System.out.println("I'm a badminton player!");
    }

    public void practiceSkills(){
        System.out.println(name+" practicing badminton skills.");
    }

    public void doFitnessTraining(){
        System.out.println(name+" doing badminton specific fitness.");
    }

    public void compete(){
        System.out.println(name+" competing in All England.");
    }

    public void playBadminton(){
        System.out.println(name+" is playing badminton.");
    }
}
