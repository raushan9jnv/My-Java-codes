
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num =5;
        for(int i =1; i<=num;i++) {
        	int fact =1;
        	for(int j =1;j<= i;j++) {
        		fact = fact +j;
        	}
        	System.out.println("Factorial of " + i + " is "+ fact);
        }
	}

}
