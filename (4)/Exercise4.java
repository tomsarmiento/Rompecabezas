import java.util.ArrayList;
import java.util.Random;
public class Exercise4 {
    public ArrayList<Integer> exercise4() {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      Random r = new Random();
      while(arr.size()<10){
        int z = r.nextInt(101);
        if(z>=55){
          arr.add(z);
        }
      }
      return arr;
    }
}