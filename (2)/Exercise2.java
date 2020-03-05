import java.util.ArrayList;
public class Exercise2 {
    public ArrayList<String> exercise2(String[] arr) {
      ArrayList<String> newArray = new ArrayList<String>();
      for(String item : arr){
        System.out.println(item);
        if(item.length() > 5){
          newArray.add(item);
        }
      }
      return newArray;
    }
}