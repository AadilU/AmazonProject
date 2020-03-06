package Control;

import Model.Shirts;
import View.*;
import Control.*;
public class Main {
	
	public static void main(String[] args)
	{
		Shirts s = new Shirts();
		System.out.println(s.ShirtsList.get(0).getName());
	}

}
