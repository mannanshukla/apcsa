//mannan shukla
//feb 16 2021
//the do now from class

public class DoNow216 {

	public static void main(String[] args) {
		String[] n = new String[10];
		n[0] = "Java";
		n[1] = "Python";
		n[2] = "C++";
		n[3] = "C";
		n[4] = "Perl";
		n[5] = "Windows";
		n[6] = "Mac";
		n[7] = "linux";
		n[8] = "MSDOS";
		print_array(n);
		// a) replace value at index 2 with "JavaScript"
		n[2] = "JavaScript";
		print_array(n);
		// b) insert Visual Basic at index 3
		int index = 3;
		if(n[n.length - 1] == null) {
			//insert an element
			for (int i = n.length - 2; i >= index; i--) {
				n[i+1] = n[i];
			}
			n[index] = "Visual Basic";
			print_array(n);
		}
		else 
			System.out.println("No space to insert an element");
		// c) remove value at index 5
		int index1 = 5;
			//remove an element
			for (int i = index1; i < n.length - 1; i++) {
				n[i] = n[i + 1];
				//n[index1] = null;
			n[n.length - 1] = null;
			print_array(n);
		}

	}
	
	public static void print_array(String[] a) {
		for(String s: a) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

}
