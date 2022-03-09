
public class PalindromeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = 100;
        int num2 = 200;
        
        for(int i =num1; i<=num2;i++) {
        	
        	int n = i;
        	int rev = 0;
        	
        	while(n>0) {
        		int digit = n % 10;  // get reminder and save it back for reverse
        		rev = (rev * 10) + digit; // getting revrse digits one after
        		n = n/10; // divide rest number after divided by 10
        	}
        	if(rev == i) {
        		System.out.print(i + " ");
        	}
        }
	}

}
