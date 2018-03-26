package test;

import java.util.Scanner;
	public class Integral {
		private int x3Factor=0; //AttributeTypeChange_Left.java and AttributeTypeChange_Right.java have difference in that line.
		private int x2Factor=0;
		private int xFactor=0;
		private int constant=0;
		private int upperLimit;
		private int lowerLimit;

 		public double integralCalculate(){
				 return ((x3Factor*Math.pow(upperLimit, 4)/4) + (x2Factor*Math.pow(upperLimit, 3)/3) + (xFactor*Math.pow(upperLimit, 2)/2)
				       + (constant*Math.pow(upperLimit, 1)))-((x3Factor*Math.pow(lowerLimit, 4)/4) + (x2Factor*Math.pow(lowerLimit, 3)/3) + (xFactor*Math.pow(lowerLimit, 2)/2)
					   + (constant*Math.pow(lowerLimit, 1)));
 		}
 
 		public void integralGetUpperAndLowerLimits(){
			 Scanner k=new Scanner(System.in);
	 
	 		System.out.println("Enter the lower limit:");
	 		String lower=k.next();
			 while(!limitControl(lower)){
				 System.out.println("Invalid lower limit.Enter the lower limit:");
				 lower=k.next();
			 }
			 if(lower.charAt(0)=='-')
				 lowerLimit=-1*convertToNumber(lower.substring(1));
	 		else if(lower.charAt(0)=='+')
				 lowerLimit=1*convertToNumber(lower.substring(1));
	 		else
				 lowerLimit=1*convertToNumber(lower);
	 
			 System.out.println("Enter the upper limit:");
			 String upper=k.next();
			 while(!limitControl(upper)){
				 System.out.println("Invalid upper limit.Enter the upper limit:");
				 upper=k.next();
			 }
			 if(upper.charAt(0)=='-')
				 upperLimit=-1*convertToNumber(upper.substring(1));
			 else if(upper.charAt(0)=='+')
				 upperLimit=1*convertToNumber(upper.substring(1));
			 else
				 upperLimit=1*convertToNumber(upper);
			 }
 
 		public void getPolynomial(){
			 Scanner k=new Scanner(System.in);
			 String pol="";
			 String part="";
			 boolean cntrl2=true;
			 do{
				 if(!cntrl2)
					 System.out.println("Invalid polynomial.Enter polynomial again:");
				 else
					 System.out.println("Enter polynomial:");
		 
				 pol="";
				 cntrl2=true;
				 String keyboard=k.nextLine();

	 			for(int i=0; i<keyboard.length(); i++)
					 if(keyboard.charAt(i)!=' ')
						 pol+=keyboard.charAt(i);
	 	
					 if(keyboard.charAt(0)!='+' && keyboard.charAt(0)!='-')	
						 pol="+"+pol;
				 
				 String pol2=pol;
	 
	 			for(int i=pol2.length()-1; i>=0; i--){
	 				if(pol2.charAt(i)=='+' || pol2.charAt(i)=='-'){
						 if(!polynomialControl(pol2.substring(i))){
							 cntrl2=false;
							 break;
		 			}
					 pol2=pol2.substring(0,i);
					 i=pol2.length()-1;
				 }
				 }
	 
				 String pol3=pol;
				 int c1=0,c2=0,c3=0,c4=0;
				 for(int i=pol3.length()-1; i>=0; i--){
					 if(pol3.charAt(i)=='+' || pol3.charAt(i)=='-'){
						 if(pol3.substring(i).indexOf("x^2")!=-1)
							 c1++;
						 else if(pol3.substring(i).indexOf("x^3")!=-1)
							 c2++;
						 else if(pol3.substring(i).indexOf("x")!=-1)
							 c3++;
						 else
							 c4++;
					 pol3=pol3.substring(0,i);
					 i=pol3.length()-1;
					 }
				 }
				 if(c1>1 || c2>1 || c3>1 || c4>1 )
					 cntrl2=false;
	 			}while(!cntrl2);
	 
	 		for(int i=pol.length()-1; i>=0; i--){
				 boolean cntrl=false;
				 int np=1;
		 		if(pol.charAt(i)=='+' || pol.charAt(i)=='-'){
			 		if(pol.charAt(i)=='-')
			 		np=-1;
				 	part=pol.substring(i+1);
					pol=pol.substring(0,i);
			 		i=pol.length()-1;
			 
		  		for(int r=0; r<part.length(); r++)
			  		if(part.charAt(r)=='x')
				  		cntrl=true;
		  
		  		if(cntrl){
			  		if(part.charAt(part.length()-1)=='x'){
				  		if(part.length()==1)
							  xFactor=np*1;
				  		else
					 		 xFactor=np*convertToNumber(part.substring(0, part.indexOf("*")));
			 		 }
			  		else if(part.charAt(part.indexOf("x")+2)=='3'){
					 	 if(part.length()==3)
							  x3Factor=np*1;
					 	 else 
						 	 x3Factor=np*convertToNumber(part.substring(0, part.indexOf("*")));
			 		 }else{
				  		 if(part.length()==3)
					  		x2Factor=np*1;
				  		else 
					  		x2Factor=np*convertToNumber(part.substring(0, part.indexOf("*")));
			  		}	  
		  			}else{
			  			 constant=np*convertToNumber(part);
		  		}
		 		}
	 		}
 		}
 
		private boolean polynomialControl(String part){	
			for(int r=0; r<part.length(); r++){
				if(  !(part.charAt(r)=='x' ||part.charAt(r)=='^' ||  part.charAt(r)=='*' || part.charAt(r)=='-' || part.charAt(r)=='+' || part.charAt(r)=='1' || part.charAt(r)=='2' || part.charAt(r)=='3' || part.charAt(r)=='4' || part.charAt(r)=='5' 
		                        || part.charAt(r)=='6' || part.charAt(r)=='7'   || part.charAt(r)=='8' || part.charAt(r)=='9' || part.charAt(r)=='0' ))			
					return false;
	
				if(r==1 && (part.charAt(1)=='*' || part.charAt(1)=='^'  ))
					return false;
		
				if(r==part.length()-1 && (part.charAt(r)=='*' || part.charAt(r)=='^'  ))
					return false;
		
				if(part.charAt(r)=='^' && (part.charAt(r-1))!='x')
					return false;
		
				if(part.charAt(r)=='*' && (part.charAt(r+1))!='x')
					return false;
		
				if(part.charAt(r)=='x' && (part.length()!=2)){
					if(r==part.length()-1)  {
						if(part.charAt(part.length()-2)!='*')
						return false;
					}
					else if (r!=part.length()-1) {
						if(part.charAt(part.indexOf("x")+1)!='^')
							return false;
						if(part.charAt(part.indexOf("x")+2)!='2' && part.charAt(part.indexOf("x")+2)!='3')
							return false;
						if( part.substring(part.indexOf("^")+1).length()!=1 )
							return false;
						if(part.length()!=4 && part.charAt(part.indexOf("x")-1)!='*')
							return false;
				}
			}
		}
			return true;	 
	}

		private boolean limitControl(String number){
			 boolean cntrl=true;
				for(int r=0; r<number.length(); r++){
					if(  !(number.charAt(r)=='1' || number.charAt(r)=='2' || number.charAt(r)=='3' || number.charAt(r)=='4' || number.charAt(r)=='5' 
			                        || number.charAt(r)=='6' || number.charAt(r)=='7'   || number.charAt(r)=='8' || number.charAt(r)=='9' || number.charAt(r)=='0' )){					
						if(r==0 && (number.charAt(0)=='+' || number.charAt(0)=='-') )
							cntrl=true;
						else {cntrl=false; break;}	
				}			
			}
			return cntrl;
		}

		private int convertToNumber(String s){
		    int number=0;
	 		for(int i=s.length(); i>0; i--)
				 number+=Math.pow(10, i-1)* (int)(s.charAt(s.length()-i)-48);
	 
	 		return number;
		}
}