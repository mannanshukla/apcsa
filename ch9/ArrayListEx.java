import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

	}

	// Question 1
	// removes smallest number in the array list.
	public static void removeMin(ArrayList<Integer> n) {
		int min = n.get(0);
		int index = i;
		for(int i = 0; i < n.size(); i++){
			if(n.get(i) < min){
				min = n.get(i);
				index = i;
			}

		}
		n.remove(index);
		System.out.println(n);
	}

	// Question 2
	// Makes and returns a new list reversing the elements in the array.
	// DO NOt USE Collections.reverse()
	public static ArrayList<String> reversedList(ArrayList<String> s) {
		ArrayList<String> becker = new ArrayList<String>();	
		for(int i = s.size()-1; i >=0; i--){
			becker.add(s.get(i));
		}
		return becker;
	}

	/**
	 * Question 3 Removes consecutive duplicate values from an ArrayList of String.
	 * For example: if letters contains ["A", "A", "A", "B", "C", "C", "A", "A"],
	 * after the method call, letters should contain ["A","B","C","A"]
	 * 
	 * @param lst
	 */
	public static void removeConsecutiveDuplicates(ArrayList<String> lst) {

	}

	public static void main(String args[]){
		ArrayList<Integer> = new ArrayList();
		removeMin(numbers);	
	}
}
