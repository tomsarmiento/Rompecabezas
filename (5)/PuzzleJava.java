import java.util.ArrayList;
public class PuzzleJava {
    public static void main(String[] args) {
        Exercise5 iD = new Exercise5();
        ArrayList<Integer> array = iD.exercise5();
        System.out.println(array);
        System.out.println(array.get(0));
        System.out.println(array.get(array.size()-1));
    }
}