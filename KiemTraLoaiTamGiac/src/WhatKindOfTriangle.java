
public class WhatKindOfTriangle {
	public static String checking(double firstE,double secondE,double thirdE){
		if( ( (firstE+secondE) < thirdE ) || ( (firstE+thirdE) < secondE ) || ( (secondE+thirdE)< firstE) )
			return "Khong phai la 3 canh cua 1 tam giac";
		//kiem tra tam giac deu
		if( (firstE==secondE) && (secondE==thirdE) && (firstE==thirdE) )
			return "tam giac deu";
		else if((firstE==secondE)||(firstE==thirdE)||(secondE==thirdE)) //kiem tra tam giac can
		{
			//kiem tra tam giac co vuong can
			if( ( Math.sqrt( (Math.pow(firstE, 2)+ Math.pow(secondE, 2)) ) == thirdE )||
				( Math.sqrt( (Math.pow(firstE, 2)+ Math.pow(thirdE,2)) ) == secondE )||
				( Math.sqrt( (Math.pow(secondE,2)+ Math.pow(thirdE, 2)) ) == firstE ) )
				return "tam giac vuong can";
			
			return "tam giac can";
		}
		//kiem tra tam giac vuong
		if( ( Math.sqrt( (Math.pow(firstE, 2)+ Math.pow(secondE, 2)) ) == thirdE )||
			( Math.sqrt( (Math.pow(firstE, 2)+ Math.pow(thirdE,2)) ) == secondE )||
			( Math.sqrt( (Math.pow(secondE,2)+ Math.pow(thirdE, 2)) ) == firstE ) )
			return "tam giac vuong";
		return "tam giac thuong";
		
	}
	public static void main(String args[]){
		String result1= checking(3.0,3.0,Math.sqrt(18));
		System.out.println(Math.pow(Math.sqrt(18), 2));
		System.out.println(result1);
	}

}
