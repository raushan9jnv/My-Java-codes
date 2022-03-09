
public class Factorial {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int number =5;
        int factorial = 1;
        
        if(number<=0) {                  // check positive number or not
        	System.out.print("Enter a positive number");
        }
        
        else {
            for(int i =1; i<=number;i++) {
            	factorial = factorial *i;
            }
            System.out.print(factorial);
        }
        

	}

}
