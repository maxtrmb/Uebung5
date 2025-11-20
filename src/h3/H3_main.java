package h3;

public class H3_main {

	public static void main(String[] args) {

		        int[][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},
		        					{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

		        int input = 4850;

		        for (int i = 0; i < 15; i++) {
		        	
		            int wert = einheiten[0][i];
		            
		            einheiten[1][i] = input / wert;
		            
		            input = input % wert;
		            
		        }

		        for (int i = 0; i < 15; i++) {
		        	
		            System.out.println(einheiten[0][i] + " Cent = " + einheiten[1][i] + " Stück");
		        }

		// TODO Auto-generated method stub

	}

}
