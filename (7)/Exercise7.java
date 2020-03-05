import java.util.Random;
import java.util.ArrayList;
public class Exercise7 {
    public ArrayList<String> exercise7() {
      ArrayList<String> arr = new ArrayList<String>();
      Random r = new Random();
      char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','\u00f1','o','p','q','r','s','t','u','v','w','x','y','z'};
      for(int i=0; i<10; i++){
        String str = ""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+"";
        arr.add(str);
      }
      return arr;
    }
}