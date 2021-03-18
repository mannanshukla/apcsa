public class TwoDArrayIntro{
	public static void main(String args[]){
		
		//creating 2d array
		String[][] names = new String[5][4];
		//row, column
		
		//jagged array
		int [][] numbers = new int[4][];
		//col is empty
		
		for(int r = 0; i < numbers.length; r++){
			if(r % 2 == 0){
				numbers[r] = new int[3];
			}

			else{
				numbers[r] = new int[2];
			}
		}

		//print or access elements in the array
		for(int r = 0; r < numbers.length; r++){
			for(int c = 0; c < numbers[r].length; c++){
				System.out.println(numbers[r][c] + ", ");
			}
			System.out.println();
		}

		//for enhanced loop:
		//cannot access index value
		//cannot change the value of an element in the array
		for(int [] r: numbers){
			for(int element : r){ //each row is an int array
				System.out.println(element + ", "); //each element is an int in the row array
			}
			System.out.println();
		}
	}
}
