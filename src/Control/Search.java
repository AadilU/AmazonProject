package Control;

import java.util.*;

import javax.swing.JFrame;

public class Search extends JFrame{
	public static void main() { 
	Scanner scan = new Scanner(System.in); 
	String user_input; 
	user_input = scan.nextLine(); 
	String[] strarray = {"Pants", "Clothing", "Outerwear", "Shirts"}; 
	System.out.println("Please enter what you want to search"); 
	user_input = scan.nextLine(); 
	for (int x = 0; x < 4; x++) 
	{ 
		if (user_input.equals(strarray[x]));
			
	}
	}
}
