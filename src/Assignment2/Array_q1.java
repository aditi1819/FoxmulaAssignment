package Assignment2;
import java.util.ArrayList;
import java.util.List;
public class Array_q1 {
	public static void main(String[] args) {
	      List aList = new ArrayList();
	      aList.add("A");
	      aList.add("B");
	      aList.add("C");
	      aList.add("D");
	      aList.add("E");
	      System.out.println("The element C is available in ArrayList? " + aList.contains("C"));
	      System.out.println("The element Z is available in ArrayList? " + aList.contains("Z"));
	   }
}
