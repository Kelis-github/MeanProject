package MeanPackage;

public class MeanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=25;
		int number2=50;
		int result=number1+number2;
		System.out.println("The sum of number1 and number2="+result);
		//computes the sample variance
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] sampleValues= {10,20,50,30,70};
		int sampleSize=sampleValues.length;
		int n=sampleSize;
		int sum=0,i;
		 for(i = 0; i < n; i++) {
	         sum+=sampleValues[i];
		 }
		 for (int j = 0; j < 5; j++) {
			  System.out.println(j);
			}
		 for (String j : cars) {
		   System.out.println(j);
		 }
		 System.out.println("My first car ever is:"+cars[1]);
	     System.out.println("Sample size,n="+n);  
	     System.out.println("Sum of Observation="+sum);  
	     System.out.println("MEAN="+sum/n);  
	     System.out.println("Commit and Push tasks performed well");
	     //Range of primitive data types
	     int myIntminvalue=Integer.MIN_VALUE;
	     int myIntmaxvalue=Integer.MAX_VALUE;
	     short minshort=Short.MIN_VALUE;
	     short maxshort=Short.MAX_VALUE;
	     long minlong=Long.MIN_VALUE;
	     long maxlong=Long.MAX_VALUE;
	     byte maxbyte=Byte.MAX_VALUE;
	     byte minbyte=Byte.MIN_VALUE;
	     System.out.println("lower limit of Byte is:"+minbyte);
	     System.out.println("Upper limit of Byte is:"+maxbyte);
	     System.out.println("lower limit of Short is:"+minshort);
	     System.out.println("Upper limit of Short is:"+maxshort);
	     System.out.println("lower limit of Integer is:"+myIntminvalue);
	     System.out.println("Upper limit of Integer is:"+myIntmaxvalue);
	     System.out.println("lower limit of Long is:"+minlong);
	     System.out.println("Upper limit of Long is:"+maxlong);
	}
}
