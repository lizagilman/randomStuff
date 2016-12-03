package OOP;


public class WorldRankingSingelton {
    private static WorldRankingSingelton wrInstance = new WorldRankingSingelton();

    public static WorldRankingSingelton getInstance() {

        return wrInstance;
    }

    private WorldRankingSingelton() {
    }
}
