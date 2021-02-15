public class AverageArray{
	public static void main(String args[]){
		int[] numbers = {1,4,5,6,3,2,4,6,3,2,5,6,7};
		double count = 0.0;
		for(int i : numbers){
			count += i;
		}
		double avg = count/numbers.length;
		System.out.println(avg);
	}
}	
