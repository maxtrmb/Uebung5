package p2;

public class P2_main {

	public static void main(String[] args) {
		
		int[] numbers = {4,6,-31,69,74,765};
		int max=1;
		int minIndex=4;
		
		max = numbers[0];
		minIndex=0;
		
		for (int i=0;i<numbers.length;i++) {
			
			if (max<numbers[i]) {
				
				max=numbers[i];
			}
			
			if(numbers[i]<numbers[minIndex]) {
				
				minIndex=i;
			}
			
		}
		
		System.out.println(max);
		System.out.println(minIndex);
		
		
		// TODO Auto-generated method stub

	}

}
