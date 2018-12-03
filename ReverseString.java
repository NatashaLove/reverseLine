import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class ReverseString {
	public static void main(String[] args){
		
		String name="Natasha Rusakova";
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