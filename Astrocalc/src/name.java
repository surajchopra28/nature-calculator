import java.lang.Math;
import java.lang.String;

public class name
{
	
		//static members
	public static int z=0;
	public static double max;
	public static char bt;
	public static String gstr,ans,firstname, lastname, gender, bloodgroup;
	public static final String reset = "\u001B[0m";
	public static final String red = "\u001B[1;31m";
	public static final String green = "\u001B[1;32m";
	public static final String yellow = "\u001B[1;33m";
	public static final String blue = "\u001B[1;34m";
	public static final String pink = "\u001B[1;35m";
	public static final String cyan = "\u001B[1;36m";
	public static final String blackbackground = "\u001b[40m";
	public static final String greenbackground = "\u001b[42m";  
	public static final String pinkbackground = "\u001b[1;105m";
	private static int date_of_birth, result;
	

	
			//constructor
	name(String fn, String ln, String gd, String bd, int dob)
	{
		gstr = gd;
		firstname = fn;
		lastname = ln;
		gender = gd;	
		bloodgroup = bd;
		date_of_birth = dob;
		
	}
	
	
	
			//data manipulations 
    void namemanipulation()
	{
		int i,j,flag=0;	
		
				//male block
		if ( gstr.contentEquals("m") || gstr.contentEquals(" m") || gstr.contentEquals("m ") || gstr.contentEquals(" m ") ||
			gstr.contentEquals("male") || gstr.contentEquals(" male") || gstr.contentEquals("male ") || gstr.contentEquals(" male ") ||
			gstr.contentEquals("Male") || gstr.contentEquals(" Male") || gstr.contentEquals("Male ") || gstr.contentEquals(" Male ") ||
			gstr.contentEquals("MALE") || gstr.contentEquals(" MALE") || gstr.contentEquals("MALE ") || gstr.contentEquals(" MALE ") ||
			gstr.contentEquals("M") || gstr.contentEquals(" M") || gstr.contentEquals("M ") || gstr.contentEquals(" M "))
		{
			bt = 'm';
			flag = 1;
			firstname();
			bloodgroup();
			dateofbirth(date_of_birth);
		}
			
		
				//female block
		else if ( gstr.contentEquals("f") || gstr.contentEquals(" f") || gstr.contentEquals("f ") || gstr.contentEquals(" f ") ||
				gstr.contentEquals("female") || gstr.contentEquals(" female") || gstr.contentEquals("female ") || gstr.contentEquals(" female ") ||
				gstr.contentEquals("Female") || gstr.contentEquals(" Female") || gstr.contentEquals("Female ") || gstr.contentEquals(" Female ") ||
				gstr.contentEquals("FEMALE") || gstr.contentEquals(" FEMALE") || gstr.contentEquals("FEMALE ") || gstr.contentEquals(" FEMALE ") ||
				gstr.contentEquals("F") || gstr.contentEquals(" F") || gstr.contentEquals("F ") || gstr.contentEquals(" F "))
		{
			bt = 'f';
			flag = 1;
			firstname();
			bloodgroup();
			dateofbirth(date_of_birth);
		}
		
		
				//others block
		else if (gstr.contentEquals("o") || gstr.contentEquals(" o") || gstr.contentEquals("o ") || gstr.contentEquals(" o ") ||
				gstr.contentEquals("other") || gstr.contentEquals(" other") || gstr.contentEquals("other ") || gstr.contentEquals(" other ") ||
				gstr.contentEquals("Other") || gstr.contentEquals(" Other") || gstr.contentEquals("Other ") || gstr.contentEquals(" Other ") ||
				gstr.contentEquals("OTHER") || gstr.contentEquals(" OTHER") || gstr.contentEquals("OTHER ") || gstr.contentEquals(" OTHER ") ||
				gstr.contentEquals("O") || gstr.contentEquals(" O") || gstr.contentEquals("O ") || gstr.contentEquals(" O ") ||
				gstr.contentEquals("others") || gstr.contentEquals(" others") || gstr.contentEquals("others ") || gstr.contentEquals(" others ") ||
				gstr.contentEquals("Others") || gstr.contentEquals(" Others") || gstr.contentEquals("Others ") || gstr.contentEquals(" Others ") ||
				gstr.contentEquals("OTHERS") || gstr.contentEquals(" OTHERS") || gstr.contentEquals("OTHERS ") || gstr.contentEquals(" OTHERS "))
		{
			bt = 'o';
			flag = 1;
			firstname();
			bloodgroup();
			dateofbirth(date_of_birth);
		}
		
		
				//default block 
		else if(flag == 0)
		{
			System.out.println(gender+ " is not a gender !");
		}
		
		
				//random calculation block
		int m,min = 0;
		double x;
		char c;
		String s, ss, str ="0";
		x =  Math.random();
		s=Double.toString(x);
		i=s.indexOf('.');
		for(j = 1; j<s.length(); j++)
		{
			 
			if (s.indexOf(str) == 2)
			{
				i++;
				z++;
				str = " ";
		        continue;
			}
			
			else 
			{
				ss = s.substring(i+1);
				c = ss.charAt(z);
				m = Character.getNumericValue(c);
				if (m == 0)
				{
					m = 1;
				}
				
				max = m;
				break;
			}
		}
		
		result = (int) ((Math.random()*((max - min)+1)+min)*10);
		System.out.println(greenbackground+cyan+"Well your nature is "+reset+greenbackground+result+" %"+cyan+" positive from others"+reset+"\n");
		System.out.println(red+"NOTE: This is random based calculation of yours, If wrong then please do not mind"+reset);
	}
	
	private static void firstname()
	{
		for (int i = 0; i < firstname.length(); i++)
		{
			
			if ( bt != 'o' && i == 0)
			{
				if ( bt == 'm')            ////male block////
				{
					
					if (firstname.charAt(i) == 'c' || firstname.charAt(i) == 'C')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [K] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'd' || firstname.charAt(i) == 'D')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [F] or [L] !! \n"+reset);
					}
										
					else if (firstname.charAt(i) == 'f' || firstname.charAt(i) == 'F')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [D] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'h' || firstname.charAt(i) == 'H')
					{
					    System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [J] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'j' || firstname.charAt(i) == 'J')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [H] or [S] or [Y]!! \n"+reset);
					}
					
					if (firstname.charAt(i) == 'k' || firstname.charAt(i) == 'K')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [C] or [V] or [T] !! \n"+reset);
					}
					
					else if (firstname.charAt(2) == 'l' || firstname.charAt(2) == 'L')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [S] or [D] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'm' || firstname.charAt(i) == 'M')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [S] or [Z] !! \n"+reset);
					}
					
					if (firstname.charAt(i) == 'n' || firstname.charAt(i) == 'N')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [R] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'p' || firstname.charAt(i) == 'P')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [T] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'r' || firstname.charAt(i) == 'R')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [N] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 's' || firstname.charAt(i) == 'S')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [S] or [M] or [L] or [J] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 't' || firstname.charAt(i) == 'T')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [P] or [K]!! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'v' || firstname.charAt(i) == 'V')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [K] !! \n"+reset);
					}
					
					else if (firstname.charAt(i) == 'z' || firstname.charAt(i) == 'Z')
					{
						System.out.print(blackbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
						System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be wife's name / wife's name starts with alphabet [M] !! \n"+reset);
					}
				}
			    else if ( bt == 'f')                 ////female block////
			    {
				if (firstname.charAt(i) == 'c' || firstname.charAt(i) == 'C')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [K] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'd' || firstname.charAt(i) == 'D')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [F] or [L] !! \n"+reset);
				}
									
				else if (firstname.charAt(i) == 'f' || firstname.charAt(i) == 'F')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [D] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'h' || firstname.charAt(i) == 'H')
				{
				    System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [J] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'j' || firstname.charAt(i) == 'J')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [H] or [S] or [Y]!! \n"+reset);
				}
				
				if (firstname.charAt(i) == 'k' || firstname.charAt(i) == 'K')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [C] or [V] or [T] !! \n"+reset);
				}
				
				else if (firstname.charAt(2) == 'l' || firstname.charAt(2) == 'L')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [S] or [D] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'm' || firstname.charAt(i) == 'M')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [S] or [Z] !! \n"+reset);
				}
				
				if (firstname.charAt(i) == 'n' || firstname.charAt(i) == 'N')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [R] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'p' || firstname.charAt(i) == 'P')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [T] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'r' || firstname.charAt(i) == 'R')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [N] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 's' || firstname.charAt(i) == 'S')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [S] or [M] or [L] or [J] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 't' || firstname.charAt(i) == 'T')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [P] or [K]!! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'v' || firstname.charAt(i) == 'V')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [K] !! \n"+reset);
				}
				
				else if (firstname.charAt(i) == 'z' || firstname.charAt(i) == 'Z')
				{
					System.out.print(pinkbackground+cyan+firstname + " " + lastname + ", Nice name ! \n"+reset);
					System.out.print(greenbackground+cyan+"According to BestCoupleNames.com, your would be husband's name / husband's name starts with alphabet [M] !! \n"+reset);
				}
			    }
			}	
		    else if (i == 2)
			{
			if (firstname.charAt(i) == 'a' || firstname.charAt(i) == 'A') 
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are CUTE guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'b' || firstname.charAt(i) == 'B')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are SMART guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'c' || firstname.charAt(i) == 'C')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are NAUGHTY person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'd' || firstname.charAt(i) == 'D')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are INDEPENDENT guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'e' || firstname.charAt(i) == 'E')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are TALENTED person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'f' || firstname.charAt(i) == 'F')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are GOOD LOOKING guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'g' || firstname.charAt(i) == 'G')
			{
		     	System.out.print(greenbackground+cyan+"Name accordingly you are BRAVE guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'h' || firstname.charAt(i) == 'H')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are CONFIDENT guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'i' || firstname.charAt(i) == 'I')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are POSSESSIVE person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'j' || firstname.charAt(i) == 'J')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are STRONG guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'k' || firstname.charAt(i) == 'K')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are LOYAL person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(2) == 'l' || firstname.charAt(2) == 'L')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are STYLISH person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'm' || firstname.charAt(i) == 'M')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are  CARING person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'n' || firstname.charAt(i) == 'N')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are HURTED person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'o' || firstname.charAt(i) == 'O')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are CREATIVE person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'p' || firstname.charAt(i) == 'P')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are LONELY guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'q' || firstname.charAt(i) == 'Q')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are HAPPY-CHAPPIE person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'r' || firstname.charAt(i) == 'R')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are FUNNY guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 's' || firstname.charAt(i) == 'S')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are ENERGETIC person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 't' || firstname.charAt(i) == 'T')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are INTELLIGENT person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'u' || firstname.charAt(i) == 'U')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are CHILDISH guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'v' || firstname.charAt(i) == 'V')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are SWEET person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'w' || firstname.charAt(i) == 'W')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are PASSIONATE guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'x' || firstname.charAt(i) == 'X')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are LOVING person !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'y' || firstname.charAt(i) == 'Y')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are EMOTIONAL guy !! \n"+reset);
				break;
			}
			
			else if (firstname.charAt(i) == 'z' || firstname.charAt(i) == 'Z')
			{
				System.out.print(greenbackground+cyan+"Name accordingly you are CRAZY guy !! \n"+reset);
				break;		
			}
			}
			}
    }
	
	private static void bloodgroup()
	{
		
		if ( bt == 'm')
		{
			switch (bloodgroup)
			{
			case "A+" : case " A+" : case "A+ " : case " A+ " :  
			case "a+" : case " a+" : case "a+ " : case " a+ " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are leaders "+yellow+"[Good leadership qualities]"+reset);
				break;
			case "A-" : case " A-" : case "A- " : case " A- " :
			case "a-" : case " a-" : case "a- " : case " a- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are very "+yellow+"[Hardworking]"+reset);
				break;
			case "b+" : case " b+" : case "b+ " : case " b+ " :
			case "B+" : case " B+" : case "B+ " : case " B+ " :
				System.out.println(greenbackground+cyan+"According to research people with this blood group are so nice that they "+yellow+"[Can give up for others !]"+reset);
				break;
			case "b-" : case " b-" : case "b- " : case " b- " : 
			case "B-" : case " B-" : case "B- " : case " B- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are "+yellow+"[Non-flexible , Selfish and  Sadistic also !]"+reset);
				break;
			case "o+" : case " o+" : case "o+ " : case " o+ " : 
			case "O+" : case " O+" : case "O+ " : case " O+ " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are very helpful to others "+yellow+"[Born to help !]"+reset);
				break;
			case "O-" : case " O-" : case "O- " : case " O- " :
			case "o-" : case " o-" : case "o- " : case " o- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group have "+yellow+"[Narrow minded nature !]"+reset);
				break;
			case "AB+" : case " AB+" : case "AB+ " : case " AB+ " :
			case "ab+" : case " ab+" : case "ab+ " : case " ab+ " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are "+yellow+"[Very difficult to understand !]"+reset);
				break;
			case "ab-" : case " ab-" : case "ab- " : case " ab- " :
			case "AB-" : case " AB-" : case "AB- " : case " AB- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group have different level of intelligence "+yellow+"[Sharp and Intelligent !]"+reset);
				break;
			default:
			    System.out.println(red+"[Incorrect blood group]"+reset);
	    	}
		}
		else if ( bt == 'o')
		{
			switch (bloodgroup)
			{
			case "A+" : case " A+" : case "A+ " : case " A+ " :  
			case "a+" : case " a+" : case "a+ " : case " a+ " :
				System.out.println(blackbackground+cyan+"According to reaserch it is found that People with this bood group have "+yellow+"[Good Leadership qualities]"+reset);
				break;
			case "A-" : case " A-" : case "A- " : case " A- " :
			case "a-" : case " a-" : case "a- " : case " a- " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group are very "+yellow+"[Hardworking]"+reset);
				break;
			case "b+" : case " b+" : case "b+ " : case " b+ " :
			case "B+" : case " B+" : case "B+ " : case " B+ " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group are vrey nice that they "+yellow+"[Can give up for others]"+reset);
				break;
			case "b-" : case " b-" : case "b- " : case " b- " : 
			case "B-" : case " B-" : case "B- " : case " B- " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group are "+yellow+"[Non-flexible , Selfish and Sadistic also]"+reset);
				break;
			case "o+" : case " o+" : case "o+ " : case " o+ " : 
			case "O+" : case " O+" : case "O+ " : case " O+ " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group are very helpful "+yellow+"[Born to help]"+reset);
				break;
			case "O-" : case " O-" : case "O- " : case " O- " :
			case "o-" : case " o-" : case "o- " : case " o- " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group have narrow minded nature "+yellow+"[Narrow minded]"+reset);
				break;
			case "AB+" : case " AB+" : case "AB+ " : case " AB+ " :
			case "ab+" : case " ab+" : case "ab+ " : case " ab+ " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group are very "+yellow+"[difficult to understand]"+reset);
				break;
			case "ab-" : case " ab-" : case "ab- " : case " ab- " :
			case "AB-" : case " AB-" : case "AB- " : case " AB- " :
				System.out.println(blackbackground+cyan+"According to research it is found that people with this blood group are on different level of intelligence "+yellow+"[Sharp and Intelligent]"+reset);
				break;
			default:
			    System.out.println(red+"[Incorrect blood group]"+reset);
	    	}
		}
		else if ( bt == 'f')
		{
			switch (bloodgroup)
			{
			case "A+" : case " A+" : case "A+ " : case " A+ " :  
			case "a+" : case " a+" : case "a+ " : case " a+ " :
				System.out.println(greenbackground+cyan+"According to reaserch it is found that People with this bood group have "+yellow+"[Good Leadership qualities]"+reset);
				break;
			case "A-" : case " A-" : case "A- " : case " A- " :
			case "a-" : case " a-" : case "a- " : case " a- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are very "+yellow+"[Hardworking]"+reset);
				break;
			case "b+" : case " b+" : case "b+ " : case " b+ " :
			case "B+" : case " B+" : case "B+ " : case " B+ " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are vrey nice that they "+yellow+"[Can give up for others]"+reset);
				break;
			case "b-" : case " b-" : case "b- " : case " b- " : 
			case "B-" : case " B-" : case "B- " : case " B- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are "+yellow+"[Non-flexible , Selfish and Sadistic also]"+reset);
				break;
			case "o+" : case " o+" : case "o+ " : case " o+ " : 
			case "O+" : case " O+" : case "O+ " : case " O+ " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are very helpful "+yellow+"[Born to help]"+reset);
				break;
			case "O-" : case " O-" : case "O- " : case " O- " :
			case "o-" : case " o-" : case "o- " : case " o- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group have narrow minded nature "+yellow+"[Narrow minded]"+reset);
				break;
			case "AB+" : case " AB+" : case "AB+ " : case " AB+ " :
			case "ab+" : case " ab+" : case "ab+ " : case " ab+ " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are very "+yellow+"[difficult to understand]"+reset);
				break;
			case "ab-" : case " ab-" : case "ab- " : case " ab- " :
			case "AB-" : case " AB-" : case "AB- " : case " AB- " :
				System.out.println(greenbackground+cyan+"According to research it is found that people with this blood group are on different level of intelligence "+yellow+"[Sharp and Intelligent]"+reset);
				break;
			default:
			    System.out.println(red+"[Incorrect blood group]"+reset);
	    	}
		}
	}
	
	 private static String dateofbirth(int a)
		{
			int b = a;
			if ( b >= 1 && b <= 31 )
			{
				switch (b)
				{
				case 1:
					ans = "Active [or] Ziddi";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break;
				case 2:
					ans = "Lucky person [or] Hoshyar";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
				case 3:
					ans = "Smart & Honest [or] Hot";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 4:
					ans = "Studious  [or] Duffer";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 5:
					ans = "Smart Insan [or] Soft Nature";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break;
				case 6:
					ans = "Caring [or] Good Person";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 7:
					ans = "Good Person [or] Careless";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 8:
					ans = "Sensitive [or] Cruel";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 9:
					ans = "Bade Dilwala [or] Smart";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 10:
					ans = "True Lover [or] Velay";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 11: 
					ans = "Cutest [or] Loving";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break;
				case 12:
					ans = "Loving [or] Maasoom";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 13:
					ans = "Hero [or] Open Mind";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break;
				case 14:
					ans = "Emotional [or] Naughty";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 15:
					ans = "Maa Ka Ladla [or] Danger";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 16:
					ans = "chanchal [or] Selfish";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 17:
					ans = "Make others jealous [or] Crazy";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 18:
					ans = "Baazigar [or] Sober";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 19:
					ans = "Perfect Person [or] Quite";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 20:
					ans = "Shareef [or] Romantic";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 21:
					ans = "Helpful [or] Awaara";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 22:
					ans = "Sabka Baap [or] Average";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 23:
					ans = "Always Ready for Party [or] Sexy";
					System.out.print(ans);
					break; 
				case 24:
					ans = "Yaaro Ka Yaar [or] Hottest";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 25:
					ans = "Fun Loving and Caring [or] Beautiful";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 26:
					ans = "Play With Hearts [or] Kanjus";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 27:
					ans = "Intelligent Person [or] Pagal";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 28:
					ans = "Happy Go Lucky [or] Funny";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 29:
					ans = "Smiling Face Always [or] velay";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 30:
					ans = "Imaandar Insan [or] Firangi Dimaag";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				case 31:
					ans = "Biggest Kamchor [or] Dashing";
					System.out.print(greenbackground+cyan+"According to entered date :  "+ans+reset);
					System.out.print("\n");
					break; 
				}
			}
			else 
			{
				System.out.print(red+"Incorrect date");
			}
			return ans;
		}

}