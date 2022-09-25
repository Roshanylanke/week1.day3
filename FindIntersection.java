package week1day3;
	
	import java.util.Arrays;

	public class FindIntersection{
		
	private void FindIntersection1() {
		
	int[] num1= {3,2,4,6,7,11};
	int[] num2= {1,2,4,8,9,7};

	System.out.println("Intersection of numbers");
	
	for(int i=0;i<=num1.length-1;i++) {
		for (int j = 0; j < num2.length; j++) {
			
			if(num1[i]==num2[j]) System.out.println(num1[i]);
		}
	}
	}
		public static void main(String[] args) {
			
			FindIntersection obj=new FindIntersection();
			
			obj.FindIntersection1();
		}

}
