package liza;


public class WorldRanking {
    private static WorldRanking wrInstance = new WorldRanking();

    public static WorldRanking getInstance() {
        return wrInstance;
    }

    private WorldRanking() {
    }
}
