import java.util.*;

public class ReverseString {
	public static void main(String[] args){
		
		//String name="Natasha Rusakova";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Gimmie a line.");
		String name = input.nextLine();
		//input.nextLine();
		char[]arr= new char [name.length()];
		
		
		try{
			for(int i=0; i<name.length(); i++){
				arr[(name.length()-1) - i]=name.charAt(i);
				
			}
		
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[j]);
			}
		
		}
		catch(Exception e) {
			System.out.println("End of line.");
		}
		
		
	}
}