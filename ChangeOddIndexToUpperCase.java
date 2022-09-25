package week1day3;

public class ChangeOddIndexToUpperCase {
	
	private void changeToUpperCase() {
		
		String inputStr="changeme";
		
		char[] inputStr1=inputStr.toCharArray();
		
		for (int i = 0; i <= inputStr1.length-1; i++) {
			if(i%2!=0) 
				System.out.println(Character.toUpperCase(inputStr1[i]));

			else 
				System.out.println(inputStr1[i]);

			inputStr1[i]=Character.toUpperCase(inputStr1[i]);
		}
	}
	public static void main(String[] args) {
		
		ChangeOddIndexToUpperCase obj=new ChangeOddIndexToUpperCase();
		
		obj.changeToUpperCase();
	}


}
