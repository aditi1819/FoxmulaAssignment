package Assignment2;
import java.util.*;
public class hash_q3 {
	public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();
  
        
        h.add("1");
        h.add("2");
        h.add("3");
  
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}


