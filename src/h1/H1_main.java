package h1;

public class H1_main {

	public static void main(String[] args) {
		
		int[] myArray = {2,7,9,13,23,47};

        for (int i = 0; i < myArray.length / 2; i++) {
        	
            int temp = myArray[i];
            
            myArray[i] = myArray[myArray.length - 1 - i];
            
            myArray[myArray.length - 1 - i] = temp;
            
        }

        for (int i = 0; i < myArray.length; i++) {
        	
            System.out.print(myArray[i] + " ");
            
        }
		
		
		// TODO Auto-generated method stub

	}

}
