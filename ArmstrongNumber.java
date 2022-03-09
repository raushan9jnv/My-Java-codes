
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
//		153 logic
//		1) 153%10 = 3
//		2) sum = sum +(3*3*3) = 27
//		3) 153/10 = 15
		
//		1) 15%10 = 5
//		2) sum = sum+sum +(5*5*5)= 125
//		3) 15/10 = 1
		
//		1) 1%10 =3
//	    2) sum = sum + (1*1*1) = 27+125+1 = 153
//	    3) 1/10 =0
		
		int number = 153;
		int temp = number;  // save number in new temporary variable temp so in last we compare it with original;
		int rem =0;
		int sum =0;
		
		while(number>0) {    // run until number value become zero
			
			rem = number%10; //3
		    sum = sum + (rem*rem*rem);
		    number = number/10;    
		}
		
		if(temp ==sum) {
			System.out.println(temp +" is a Armstrong Number");
		}
		
		else {
			System.out.println(temp +" is NOT a Armstrong number");
		}
	}

}
