Employee id:20450468
/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		list.add("Item 5");
		
		printAll(list);
	}

	static void printAll(ArrayList<String> list) {
		// TODO Auto-generated method stub
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
