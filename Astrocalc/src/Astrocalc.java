import java.util.Scanner;
import java.lang.String;
//import java.awt.*;
//import javax.swing.*;


public class Astrocalc 
{
	
			//static members// 
	public static final String reset = "\u001B[0m";
	public static final String red = "\u001B[1;31m";
	public static final String green = "\u001B[1;32m";
	public static final String yellow = "\u001B[1;33m";
	public static final String blue = "\u001B[1;34m";
	public static final String pink = "\u001B[1;35m";
	public static final String cyan = "\u001B[1;36m";
	public static final String greenbackground = "\u001b[42m";
	public static final String blackbackground = "\u001B[40m";
	public static final String pinkbackground = "u001b[105";
	public static boolean flag;
	public static String a , b , c , d,str;
	public static int e;
	public static Scanner input = new Scanner(System.in);
	
	
			//main function
	public static void main(String[] args) 
	{		
		System.out.println(blackbackground+yellow+"ASTROCALC "+cyan+"(KNOW	 MORE	ABOUT	YOURSELF !!)"+reset);
		rinput();
		name n1 = new name (a , b , c , d , e);
		n1.namemanipulation();
		
	}
	
	
			//input function 
	private static void rinput() 
	{
		//outera:{
		System.out.print("\n");
		System.out.print(blue+"Enter Your First Name: "+reset);
		a = input.nextLine();
		validate(a);
		if (flag == true) 
		{
			System.out.print("\n");
			System.out.print(blue+"Enter Your Last Name: "+reset);
			b = input.nextLine();
			validate(b);
			if (flag == true)
			{  
				System.out.print("\n");
				System.out.print(blue+"Enter Gender: "+reset);
				c = input.nextLine();
				validate(c);
				if (flag == true)
				{
					System.out.print("\n");
					System.out.print(blue+"Enter Blood Group: "+reset);
					d = input.nextLine();
					validate(d);
					if (flag == true)
					{
						System.out.print("\n");
						System.out.print(blue+"Enter date of birth.........(eg: 22) : "+reset);
						str = input.nextLine();
						validatenumber(str);
						if ( flag == true)
						{
							System.out.print("\n");
							e = Integer.parseInt(str);
						}
						else 
						{
							System.out.println(red+"Error in Date......[ENTER DIGITS ONLY !!]"+reset);
							System.out.print("\n");
							rinput();
						}
					}
					else
					{
						System.out.println(red+"Error in Blood Group......[ENTER ALPHABETS ONLY !!]"+reset);
						System.out.print("\n");
						rinput();
					}
				}
				else 
				{
					System.out.println(red+"Error in Gender......[ENTER ALPHABETS ONLY !!]"+reset);
					System.out.println("\n");
					rinput();
				}
 			}
			else 
			{
				System.out.println(red +"Error in Last Name......[ENTER APLHABETS ONLY !!]"+reset);
				System.out.println("\n");
				rinput();
			}
		}
		else
		{
			System.out.println(red+"Error in First Name......[ENTER APLHABETS ONLY !!]" + reset);
			System.out.println("\n");
			rinput();
		}
	}
	
	
			//String validations
	private static void validate(String input) 
	{
		if (input.isBlank()) {
			System.out.print(red+"Field must not be empty....[REQUIRED]" + reset); 
			System.out.print("\n");
			rinput();
		}
		else {
			int l = input.length();
			flag = true;
			for (int i = 0; i < l; i++) {
				if ((int) input.charAt(i) >= 48 && (int) input.charAt(i) <= 57) 
				{
					flag = false;
					break;
				}
			}
		}
	}
	
	//byte validations
	private static void validatenumber(String input2)
	{
		if (input2.isBlank())
		{
			System.out.print(red+"Field must not be empty....[REQUIRED]" + reset); 
			System.out.print("\n");
			rinput();
		}
		else 
		{
			int l = input2.length();
			flag = true;
			for (int i = 0; i < l; i++)
			{
				if ((int) input2.charAt(i) >= 65 && (int) input2.charAt(i) <= 90 || (int) input2.charAt(i) >= 97 && (int) input2.charAt(i) <= 122)
				{
					flag = false;
					break;
				}
			}
		}
	}
	
}
