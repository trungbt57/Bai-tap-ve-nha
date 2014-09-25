
public class TestJUnitWorking {
	
	public static boolean isPrime(double number){
		if(number ==2)
			return true;
		
		else{
			for(int i=2;i<=Math.sqrt(number);i++)
				if(number%i ==0)
					return false;
			return true;
		}
		
	}
}
