import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class Exercise5 {
    public ArrayList<Integer> exercise5() {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      Random r = new Random();
      while(arr.size()<10){
        int z = r.nextInt(101);
        if(z>=55){
          arr.add(z);
        }
      }
      Collections.sort(arr);
      return arr;
    }
}