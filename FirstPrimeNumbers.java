
public class FirstPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 100;
        
        for(int i=2; i<= num;i++) {           // run a loop from 2 to 100
        	
        	boolean isPrime =true;
        	
        	for(int j=2; j<i;j++) {    // run a loop to divide each i(ex: 7) number by j (ex: 2,3,4,5,6)
        		if(i%j ==0) {
        			isPrime =false;
        			break;
        		}
        	}
        	if(isPrime) {
        		System.out.println(i);
        	}
        }
	}

}
