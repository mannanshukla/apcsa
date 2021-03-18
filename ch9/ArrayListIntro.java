import java.util.*;
public class ArrayListIntro{
	public static void main(String args[]){

		//ArrayList syntax
		ArrayList<String> names = new ArrayList<String>(20);
		//create an array list of string with 20 capacity
		//when the capacity is unknown
		ArrayList<String> names1 = new ArrayList<String>();
		//when capacity not specified, defults to 10 
		//capacity will change as needed in runtime
		//Wrapper class
		//Integrer.toString(0)
		//Integer.parseInt("0")
		ArrayList<Integer> numbers = new ArrayList<Integer>(20);
		//Integer, Double, Boolean, Character - wrapper classes
		//ArrayList can be used only with objects and not with primitive data
		//
		//size, capacity
		//capacity = how much the arraylist can hold
		//size - how many elements there actually are
		//
		System.out.println(numbers.size());
		System.out.println(numbers);
		//add values to the arraylist
		//{4,5,6};
		numbers.add(4);//appends the list
		number.add(5);
		numbers.add(-10);
		numbers.add(1, -99);//add the element -99 at index 1
		System.out.println(numbers.size());
		System.out.println(numbers);
		//set method
		//replace the val of the index to the new value
		numbers.set(2, 56);//change the value to 56 at index 2
		System.out.println(numbers.size());
		System.out.println(numbers);

		//remove - remove the val at the index
		numbers.remove(3);
		System.out.println(numbers.size());
		System.out.println(numbers);

		for(int i = 0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
			//get method will retrieve the element at the given index
		}

		for(int num:numbers){
			System.out.println(num);
		}
	}
}
