package Assignment2;

import java.util.*;
public class ksum {
    java.util.List<Integer> aList = new ArrayList<Integer>();

    public ksum(int s1, int s2, int s3, int s4, int s5)
    {
        //Initialize array list
        aList.add(s1);
        aList.add(s2);
        aList.add(s3);
        aList.add(s4);
        aList.add(s4);
        aList.add(s5);
        Collections.sort(aList);
    }

    void logic(int sum)
    {

        int low=0;
        int high=aList.size()-1;
        while(low<high){
            if(aList.get(low)+aList.get(high)==sum)
            {
                System.out.println("The pair is : ("+ aList.get(low) + ", " + aList.get(high) + ")");
            }
            if (aList.get(low) + aList.get(high) > sum) {
                high--;
            }
            else {
                low++;
            }

        }




    }
}