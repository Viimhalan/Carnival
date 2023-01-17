package carnival;

public class Score {
    private int points;
    private static Score score = new Score();

    //make the constructor private so that this class cannot be
    //instantiated
    private Score(){

    }

    //Get the only object available
    public static Score getInstance(){
        return score;
    }
    public int ReduceScore(int num){
      points=points-num;
      return points;
    }
    public void setScore(int num){
        points=num;
    }


}
