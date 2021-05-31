package Assignment2;
import java.io.*;
import java.util.*;
public class set_q2
{
	public static void main(String args[])
    {
       
        Set<String> set = new HashSet<String>();
 
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println("Set: " + set);
        System.out.println("Does the Set contains '1'? "+ set.contains("1"));
        System.out.println("Does the Set contains '4'? "+ set.contains("4"));
        System.out.println("Does the Set contains '8'? "+ set.contains("8"));
    }
}
