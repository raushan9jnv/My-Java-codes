
public class FirstEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 15;
        int count =0;
        
        int i =1;
        while(true)
        {
        	if(i%2 ==0)
        	{
        		System.out.println(i);
        		count++;
        	}
        	if(count ==num)
        		break;
        	
        	i++;
        }
	}

}
