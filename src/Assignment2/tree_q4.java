package Assignment2;
import java.util.Iterator;
import java.util.TreeSet;
public class tree_q4 {
	public static void main(String[] args)
	{
		TreeSet<Integer>
			ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(61);
		ts.add(87);
		ts.add(39);

		// Create an Iterator over the TreeSet
		Iterator<Integer> iterator = ts.iterator();

		// Loop over the TreeSet values
		// and print the values
		System.out.print("TreeSet: ");
		while (iterator.hasNext())
			System.out.print(iterator.next()
							+ ", ");
		System.out.println();
	}
}
