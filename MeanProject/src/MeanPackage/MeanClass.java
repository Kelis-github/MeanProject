package MeanPackage;

public class MeanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=25;
		int number2=50;
		int result=number1+number2;
		System.out.println("The sum of number1 and number2="+result);
		//computes the sample variance
		int[] sampleValues= {10,20,50,30,70};
		int sampleSize=sampleValues.length;
		int n=sampleSize;
		int sum=0,i;
		 for(i = 0; i < n; i++) {
	         sum+=sampleValues[i];
		 }
	     System.out.println("Sample size,n="+n);  
	     System.out.println("Sum of Observation="+sum);  
	     System.out.println("MEAN="+sum/n);  
	     System.out.println("Commit and Push tasks performed well");
	}

}
