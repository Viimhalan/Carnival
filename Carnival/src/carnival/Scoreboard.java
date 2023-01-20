package carnival;

public class Scoreboard {
    private int points;
    private static Scoreboard scoreboard = new Scoreboard();

    //make the constructor private so that this class cannot be
    //instantiated
    private Scoreboard(){

    }

    //Get the only object available
    public static Scoreboard getInstance(){
        return scoreboard;
    }
    public int ReduceScore(int num){
        points=points-num;
        return points;
    }
    public void setScore(int num){
        points=num;
    }
    public void deductScore(int num){
        points=points-num;

    }
    public int getScore(){
        return points;
    }

}
