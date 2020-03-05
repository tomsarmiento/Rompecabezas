import java.util.ArrayList;
public class Exercise1 {
    public ArrayList<Integer> exercise1(int[] arr) {
      int sum = 0;
      ArrayList<Integer> newArray = new ArrayList<Integer>();
      for(int item : arr){
        sum = sum + item;
        if(item > 10){
          newArray.add(item);
        }
      }
      System.out.println(sum);
      return newArray;
    }
}