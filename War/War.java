import java.util.List;
import java.util.*;
import java.util.ArrayList;

/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    public War() {
        List<Integer> list0 = new ArrayList<Integer>();
        for (int i = 1; i < 51; i++) {
            list0.add(i);
        }
        Collections.shuffle(list0);
        List<Integer> list1 = new ArrayList<Integer>(list0.subList(0,24));  
        List<Integer> list2 = new ArrayList<Integer>(list0.subList(24,49));        
        for (int i = 0; i < 300; i++) {
            int card1 = list1.get(0);
            int card2 = list2.get(0);
            if (list1.isEmpty() == true) {
                System.out.print("Player 2 wins");
                break;
            } else if (list2.isEmpty() == true){
                System.out.print("Player 1 wins");
                break;
            }
        }
    }
}
