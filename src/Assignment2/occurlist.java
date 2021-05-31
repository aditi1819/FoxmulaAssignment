package Assignment2;
import java.util.*;
public class occurlist {
	java.util.List<Integer> aList = new ArrayList<Integer>();

    public  occurlist (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9)
    {
        //Initialize array list
        aList.add(n1);
        aList.add(n2);
        aList.add(n3);
        aList.add(n4);
        aList.add(n5);
        aList.add(n6);
        aList.add(n7);
        aList.add(n8);
        aList.add(n9);
    }

    void frequency()
    {
        Set<Integer> st = new HashSet<Integer>(aList);
        for (int s : st)
        System.out.println(s + " has total : " + Collections.frequency(aList, s)+" times ");
    }
}
