
public class EE36Main {
	public static void main(){
		int n;
	    int divmax;
	    int[] count;
	      
	    count = new int[10001];
	       
	    divmax = 1;  
	    count[1] = 1;
	    for ( n = 2;  n <= 10000;  n++ ) {
	    	int div; 
	        int countDiv; 
	        countDiv = 0;
	        for ( div = 1;  div <= n;  div++ ) { 
	        	if ( n % div == 0 )
	        		countDiv++;
	        }
	        count[n] = countDiv; 
	        if (countDiv > divmax) {
	        	divmax = countDiv;
	        }
	    }
	    System.out.println("Among integers between 1 and 10000,");
	    System.out.println("The maximum number of divisors was " + divmax);
	    System.out.println("Numbers with that many divisors include:");
	    for ( n = 1; n <= 10000; n++ ) {
	    	if ( count[n] == divmax ) {
	    		System.out.println( "   " + n );
	         }
	    }
	}
}
