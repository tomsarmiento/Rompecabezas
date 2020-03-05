import java.util.Random;
public class Exercise6 {
    public String exercise6() {
      Random r = new Random();
      char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','\u00f1','o','p','q','r','s','t','u','v','w','x','y','z'};
      String str = ""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+""+abc[r.nextInt(27)]+"";
      return str;
    }
}