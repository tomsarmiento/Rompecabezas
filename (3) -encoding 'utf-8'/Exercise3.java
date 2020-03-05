import java.util.Collections;
import java.util.ArrayList;
public class Exercise3 {
    public void exercise3(ArrayList<Character> arr) {
      Collections.shuffle(arr);
      System.out.println(arr.get(arr.size()-1));
      System.out.println(arr.get(0));
      if(arr.get(0)=='a' || arr.get(0)=='e' || arr.get(0)=='i' || arr.get(0)=='o'|| arr.get(0)=='u'){
        System.out.println("La primera letra del arreglo es una vocal");
      }
    }
}