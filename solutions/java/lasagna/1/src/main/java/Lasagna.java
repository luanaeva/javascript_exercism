public class Lasagna {
    public static final int MINUTES_IN_OVEN = 40;
    
    public int expectedMinutesInOven(){
      return 40;
    } 
    public int remainingMinutesInOven(int timeSpent){
      return MINUTES_IN_OVEN - timeSpent;
    } 
    public int preparationTimeInMinutes(int layers){
      return layers * 2;
    }
    // TODO: define the '' method
    public int totalTimeInMinutes(int layers, int TimeSpent){
      int totalTime = preparationTimeInMinutes(layers) + TimeSpent;
      return totalTime;
    }
}
