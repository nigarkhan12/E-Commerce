package p1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class shopping 
{
	static Scanner scan=new Scanner(System.in);
	static String s=null;
	static String t="";
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================================================================================");
		System.out.println("                                                                               WELCOME TO MY SHOPPING");
		System.out.println("Please Enter your Name                                                    EVERYDAY ADD COLOURS TO YOUR LIFE");
		header();
		t=t.toUpperCase();
		System.out.println();
		System.out.println("======================================================================================================================================================================================");
		System.out.println();
		System.out.println(java.time.LocalDate.now()+"                                                                         Welcome: "+ t +"                                                                       "+java.time.LocalTime.now());
		System.out.println();
		System.out.println("======================================================================================================================================================================================");
		mainshopping.mainshopping();
	}
	public static void header()
	{
		scan=new Scanner(System.in);
		s=scan.nextLine();
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				t=t+s.charAt(i);
			}
			else
			{
				System.out.println("Invalid Name....plase enter the valid Name");
				t="";
				header();
				break;
			}
		}
		
	}
}
class mainshopping
{
	static void mainshopping()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println();
		System.out.println("										1: Clothing");
		System.out.println("										2: Sports");
		System.out.println("										3: Baby");
		System.out.println("										4: Electronics");
		System.out.println("										5: Cart");
		System.out.println("										Press Any Other Key to exit");
		int i=0;
		try
		{
			i=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			mainshopping();
		}
		switch(i)
		{
			case 1:
			{
				clothing.clothes();
				break;
			}
			case 2:
			{
				sports.sports();
				break;
			}
			case 3:
			{
				Baby.baby();
				break;
			}
			case 4:
			{
				Electronics.electronics();
				break;
			}
			case 5:
			{
				cart.billing();
				break;
			}
			default:
			{
					System.out.println("           Are you sure you want to exit");
					System.out.println("1: Yes");
					System.out.println("2: No");
					int j=scan.nextInt();
					switch(j)
					{
						case 1:
						{
							System.exit(0);
						}
						case 2:
						{
							mainshopping();
							break;
						}
					}
			}
		}

	}
}
class clothing
{
	static void clothes()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: mens");
		System.out.println("										2: womens");
		System.out.println("										press any number to return to previous menu");
		int i=0;
		try
		{
		i=scn.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			clothes();
		}
		switch(i)
		{
			case 1:
			{
				mens.menclothes();
				break;
			}
			case 2:
			{
				women.womenclothes();
				break;
			}
			default:
			{
				mainshopping.mainshopping();
				break;
			}
		}
	}
}
class mens extends cart
{
	static void menclothes()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Jeans");
		System.out.println("										2: T-shirts");
		System.out.println("										3: Formals");
		System.out.println("										4: Casuals");
		System.out.println("										5: Back to Previous Menu");
		System.out.println("										6: Back to Main Menu");
		System.out.println("										7: Cart");
		System.out.println("										press any other number to Exit");
		int i=0;
		try
		{
		i=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			menclothes();
		}
		switch(i)
		{
			case 1:
			{
				jeans();
				break;
			}
			case 2:
			{
				tshirts();
				break;
			}
			case 3:
			{
				formals();
				break;
			}
			case 4:
			{
				casuals();
				break;
			}
			case 5:
			{
				clothing.clothes();
				break;
			}
			case 6:
			{
				mainshopping.mainshopping();
				break;
			}
			case 7:
			{
				cart.billing();
				break;
			}
			default :
			{
				System.exit(0);
			}
		}
	}
	static void jeans()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Levis jeans------Rs-3499/-");
		System.out.println("										2: Wrangler jeans------Rs-2999/-");
		System.out.println("										3: Lee jeans-------Rs-3399/-");
		System.out.println("										4: pepe jeans------Rs-3799/-");
		System.out.println("										press any other number to return to previous menu");
		int i=0;
		try
		{
		i=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			jeans();
		}
		int j=0;
		switch(i)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
				j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				System.out.println("you opted Levis jeans of "+j+" Quantity.");
				j=j*3499;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
				k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("levis jeans",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
						k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							jeans();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
				j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				System.out.println("you opted Wrangler jeans of "+j+" Quantity.");
				j=j*2999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
				k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				switch (k)
				{
					case 1:
					{
						hashmap("wrangler jeans",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							jeans();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}	
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
					
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				System.out.println("you opted Lee jeans of "+j+" Quantity.");
				j=j*3399;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				switch (k)
				{
				case 1:
				{
					hashmap("lee jeans",j);
					System.out.println("Are you like to continue shopping");
					System.out.println("1: Yes");
					System.out.println("2: No");
					try
					{
						k=scan.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Invalid input!!!!");
						System.out.println("please enter the Valid input,with reagrding to the options given");
						jeans();
					}
					switch(k)
					{
						case 1:
						{
							mainshopping.mainshopping();
							break;
						}
						case 2:
						{
							if (sum==0)
							{
								System.out.println("                Thank You Visit Again");
								System.exit(0);
							}
							else
							{
								cart.billing();
								break;
							}
							break;
						}
					}
					break;
				}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					jeans();
				}
				System.out.println("you opted pepe jeans of "+j+" Quantity.");
				j=j*3799;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=scan.nextInt();
				switch (k)
				{
					case 1:
					{
						hashmap("pepe jeans",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							jeans();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
					
				}
				break;
			}
			default :
			{
				menclothes();
				break;
			}
		}
		
	}
	static void tshirts()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: peter england-------Rs-2999/-");
		System.out.println("										2: louis phillippe-------Rs-2499/-");
		System.out.println("										3: Black berrys-------Rs-1999/-");
		System.out.println("										4: john player-------Rs-1499/-");
		System.out.println("										press any other number to return to previous menu");
		int i=0;
		try
		{
			i=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			tshirts();
		}
		switch(i)
		{
			case 1:
			{
				System.out.println("Please enter the quantity");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				System.out.println("you opted Peter England T-shirt of "+k+" Quantity.");
				k=k*2999;
				System.out.println("You are adding item to cart of Rs-"+k+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int j=0;
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				switch(j)
				{
					case 1:
					{
						hashmap("Peter England",k);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							tshirts();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tshirts();
						break;
					}
				}
					break;
			}
			case 2:
			{
				System.out.println("Please enter the quantity");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				System.out.println("you opted Louis Phillippe T-shirt of "+k+" Quantity.");
				k=k*2499;
				System.out.println("You are adding item to cart of Rs-"+k+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int j=0;
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				switch(j)
				{
					case 1:
					{
						hashmap("Louis Phillippe",k);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							tshirts();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tshirts();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("Please enter the quantity");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				System.out.println("you opted Black Berrys T-shirt of "+k+" Quantity.");
				k=k*1999;
				System.out.println("You are adding item to cart of Rs-"+k+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int j=0;
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				switch(j)
				{
					case 1:
					{
						hashmap("Black Berrys",k);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							tshirts();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tshirts();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("Please enter the quantity");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				System.out.println("you opted John Players T-shirt of "+k+" Quantity.");
				k=k*1499;
				System.out.println("You are adding item to cart of Rs-"+k+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int j=0;
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					tshirts();
				}
				switch(j)
				{
					case 1:
					{
						hashmap("John Players",k);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							tshirts();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tshirts();
						break;
					}
				}
				break;
			}
			default :
			{
				menclothes();
				break;
			}
		}	
	}
	static void formals() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Raymond------->Rs-989/-");
		System.out.println("										2: Solo------->Rs-795/-");
		System.out.println("										3: Waggle------->Rs-626/-");
		System.out.println("										4: Wintage------->Rs-879/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			formals();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				System.out.println("you opted Raymond Casuals of "+j+" Quantity.");
				j=j*989;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Raymond",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							formals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						formals();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				System.out.println("you opted Solo Casuals of "+j+" Quantity.");
				j=j*795;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("solo",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							formals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						formals();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				System.out.println("you opted Waggle Casuals of "+j+" Quantity.");
				j=j*626;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("waggle",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							formals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						formals();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				System.out.println("you opted Wintage Casuals of "+j+" Quantity.");
				j=j*879;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					formals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("wintage",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							j=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							formals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						formals();
						break;
					}
				}
				break;
			}
			default :
			{
				menclothes();
				break;
			}
		}
	}
	static void casuals()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Dinkart------->Rs-664/-");
		System.out.println("										2: Hasoer------->Rs-999/-");
		System.out.println("										3: FAILFIL------->Rs-911/-");
		System.out.println("										4: Showoff------->Rs-799/-");
		System.out.println("										Press any key to go to previous Menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			casuals();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				System.out.println("you opted Dinkart Casuals of "+j+" Quantity.");
				j=j*664;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Dinkart",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							casuals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casuals();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				System.out.println("you opted Hasoer Casuals of "+j+" Quantity.");
				j=j*999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Hasoer",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							casuals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casuals();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				System.out.println("you opted FAILFIL Casuals of "+j+" Quantity.");
				j=j*911;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("FAILFIL",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						k=scan.nextInt();
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casuals();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				System.out.println("you opted Showoff Casuals of "+j+" Quantity.");
				j=j*799;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					casuals();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Show off",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							casuals();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casuals();
						break;
					}
				}
				break;
			}
			default :
			{
				menclothes();
				break;
			}
		}
	}
}
class women extends cart
{
	static void womenclothes()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Jeans");
		System.out.println("										2: Sarees");
		System.out.println("										3: Party Wears");
		System.out.println("										4: Casual Wears");
		System.out.println("										5: Back to Previous Menu");
		System.out.println("										6: Back to Main Menu");
		System.out.println("										7: Cart");
		System.out.println("										press any other number to Exit");
		int i=0;
		try
		{
			i=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			womenclothes();
		}
		switch(i)
		{
			case 1:
			{
				jeans();
				break;
				
			}
			case 2:
			{
				sarees();
				break;
			}
			case 3:
			{
				partywears();
				break;
			}
			case 4:
			{
				casualwears();
				break;
			}
			case 5:
			{
				clothing.clothes();
				break;
			}
			case 6:
			{
				mainshopping.mainshopping();
				break;
			}
			case 7:
			{
				cart.billing();
				break;
			}
			default :
			{
				System.exit(0);
				break;
			}
				
		}
	}
	static void jeans( )
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Diesel Jeans------->Rs-3499/-");
		System.out.println("										2: SPYKAR jeans------->Rs-2499/-");
		System.out.println("										3: Flying Machine Jeans------->Rs-1999/-");
		System.out.println("										4: Denizen Jeans------->Rs-999/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			womenclothes();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Diesel jeans of "+j+" Quantity.");
				j=j*3499;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Diesel",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted SPYKAR jeans of "+j+" Quantity.");
				j=j*2499;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("SPYKAR",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("Yes");
						System.out.println("No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Flying Machine jeans of "+j+" Quantity.");
				j=j*1999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Flying machine",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Denizen jeans of "+j+" Quantity.");
				j=j*999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Denizen",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			default :
			{
				womenclothes();
				break;
			}
		}
	}
	static void sarees()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Paithini Saree------->Rs-1875/-");
		System.out.println("										2: Muga Saree------->Rs-1199/-");
		System.out.println("										3: Banasari Saree------->Rs-1180/-");
		System.out.println("										4: Chanderi Saree-------->Rs-3250/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			womenclothes();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Pathini Saree of "+j+" Quantity.");
				j=j*1875;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Pathini",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						sarees();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Muga Saree of "+j+" Quantity.");
				j=j*1199;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Muga",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						sarees();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Bansari Saree of "+j+" Quantity.");
				j=j*1180;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Bansari",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						sarees();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Chanderi Saree of "+j+" Quantity.");
				j=j*3250;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Chanderi",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						sarees();
						break;
					}
				}
				break;
			}
			default :
			{
				womenclothes();
				break;
			}
		}
	}
	static void partywears()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Vero Moda------->Rs-804/-");
		System.out.println("										2: Harpa------->Rs-721/-");
		System.out.println("										3: Provouge------->Rs-499/-");
		System.out.println("										4: Aurelia------->Rs-1299/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			womenclothes();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Vero Moda Dress of "+j+" Quantity.");
				j=j*804;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Vero Moda",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						partywears();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Harpa Dress of "+j+" Quantity.");
				j=j*721;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Harpa",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						partywears();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Provogue Dress of "+j+" Quantity.");
				j=j*499;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Provogue",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						partywears();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Aurelia Dress of "+j+" Quantity.");
				j=j*1299;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("aurelia",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						partywears();
						break;
					}
				}
				break;
			}
			default :
			{
				womenclothes();
				break;
			}
		}
	}
	static void casualwears()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Tokyo Talkies------->Rs-721/-");
		System.out.println("										2: Trendy Fab------->Rs-987/-");
		System.out.println("										3: Monique------->Rs-767/-");
		System.out.println("										4: Cottinfab------->Rs-989/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			womenclothes();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				j=scan.nextInt();
				System.out.println("you opted Tokyo Talkies Dress of "+j+" Quantity.");
				j=j*721;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Tokyo Talkies",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casualwears();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Trendy Fab Dress of "+j+" Quantity.");
				j=j*987;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Trendy Fab",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						jeans();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Monique Dress of "+j+" Quantity.");
				j=j*767;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Monique",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casualwears();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				System.out.println("you opted Cottinfab Dress of "+j+" Quantity.");
				j=j*989;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					womenclothes();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Cottinfab",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							womenclothes();
						}
						switch(k)
		
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						casualwears();
						break;
					}
				}
				break;
			}
			default :
			{
				womenclothes();
				break;
			}
		}
	}
	
}
class Electronics extends cart
{
	static void electronics()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Watches");
		System.out.println("										2: Mobiles");
		System.out.println("										3: Headsets");
		System.out.println("										4: Laptops");
		System.out.println("										5: Main Menu");
		System.out.println("										6: Cart");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			electronics();
		}
		switch(j)
		{
			case 1:
			{
				watches();
				break;
			}
			case 2:
			{
				mobiles();
				break;
			}
			case 3:
			{
				headset();
				break;
			}
			case 4:
			{
				laptops();
				break;
			}
			case 5:
			{
				mainshopping.mainshopping();
				break;
			}
			case 6:
			{
				cart.billing();
				break;
			}
			default :
			{
				System.exit(0);
				break;
			}
		}
	}
	static void watches()

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Honor watch------->Rs-8999/-");
		System.out.println("										2: Fastrack Watch------->Rs-1499/-");
		System.out.println("										3: Ambrane watch------->Rs-999/-");
		System.out.println("										4: mi Watch------->Rs-1999/-");
		System.out.println("										Press any other Key to go to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			electronics();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Honor Watch of "+j+" Quantity.");
				j=j*8999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Honor",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						watches();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Fast track Watch of "+j+" Quantity.");
				j=j*1499;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("fast track",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						watches();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Ambrane Watch of "+j+" Quantity.");
				j=j*999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Ambrane",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						watches();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted mi Watch of "+j+" Quantity.");
				j=j*1999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("mi",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						watches();
						break;
					}
				}
				break;
			}
			default :
			{
				electronics();
				break;
			}
		}
	}
	static void mobiles()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: mi mobile------->Rs-13,999/-");
		System.out.println("										2: Realme mobile------->Rs-16,999/-");
		System.out.println("										3: Sony mobile------->Rs-25,999/-");
		System.out.println("										4: Apple mobile------->Rs-34,999/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			electronics();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted redmi mobile of "+j+" Quantity.");
				j=j*13999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("redmi",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						mobiles();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Realme mon=bile Watch of "+j+" Quantity.");
				j=j*16999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Realme",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						mobiles();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Sony mobile of "+j+" Quantity.");
				j=j*25999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Sony",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							j=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						mobiles();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Apple mobile of "+j+" Quantity.");
				j=j*34999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Apple",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						mobiles();
						break;
					}
				}
				break;
			}
			default :
			{
				electronics();
				break;
			}
		}
		
	}
	static void headset()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Skull Candy------->Rs-2799/-");
		System.out.println("										2: JBL------->Rs-749/-");
		System.out.println("										3: BOAT------->Rs-1399/-");
		System.out.println("										4: BOSE------->Rs-949/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			electronics();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				j=scan.nextInt();
				System.out.println("you opted Skull Candy Headset of "+j+" Quantity.");
				j=j*2799;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Skull Candy",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						headset();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted JBL Headset of "+j+" Quantity.");
				j=j*749;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("JBL",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						headset();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Boat Headset of "+j+" Quantity.");
				j=j*1399;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("BOAT",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						headset();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted BOSE Headset of "+j+" Quantity.");
				j=j*949;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("BOSE",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						headset();
						break;
					}
				}
				break;
			}
			default :
			{
				electronics();
				break;
			}
		}
	}
	static void laptops()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: DELL------->Rs-29,990/-");
		System.out.println("										2: HP------->Rs-22,990/-");
		System.out.println("										3: ASUS------->Rs-13,990/-");
		System.out.println("										4: Lenovo------->Rs-28,990/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			electronics();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted DELL Laptop of "+j+" Quantity.");
				j=j*29990;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("DELL",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						laptops();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted HP Laptop of "+j+" Quantity.");
				j=j*22990;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("HP",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						laptops();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted ASUS Laptop of "+j+" Quantity.");
				j=j*13990;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("ASUS",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						laptops();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				System.out.println("you opted Lenovo laptop of "+j+" Quantity.");
				j=j*28990;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					electronics();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Lenovo",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							electronics();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						laptops();
						break;
					}
				}
				break;
			}
			default:
			{
				electronics();
				break;
			}
		}
	}
}
class sports extends cart
{
	static void sports()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Cricket");
		System.out.println("										2: Badminton");
		System.out.println("										3: Swimming");
		System.out.println("										4: Table Tennis");
		System.out.println("										5: Main Menu");
		System.out.println("										6: Cart");
		System.out.println("										press any other number to Exit");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			sports();
		}
		switch(j)
		{
			case 1:
			{
				cricket();
				break;
			}
			case 2:
			{
				badminton();
				break;
			}
			case 3:
			{
				swimming();
				break;
			}
			case 4:
			{
				tabletennis();
				break;
			}
			case 5:
			{
				mainshopping.mainshopping();
				break;
			}
			case 6:
			{
				cart.billing();
				break;
			}
			default :
			{
				System.exit(0);
			}
		}
	}
	static void cricket()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Bat------->Rs-8999/-");
		System.out.println("										2: Ball------->Rs-99/-");
		System.out.println("										3: Wickets------->Rs-199/-");
		System.out.println("										4: Kit Bag------->Rs-1999/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			sports();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted BAT of "+j+" Quantity.");
				j=j*8999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("BAT",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cricket();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted BALL of "+j+" Quantity.");
				j=j*99;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("BALL",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cricket();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Wickets of "+j+" Quantity.");
				j=j*999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Wickets",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cricket();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted KIT Bag of "+j+" Quantity.");
				j=j*1999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Kit Bag",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							j=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cricket();
						break;
					}
				}
				break;
			}
			default :
			{
				sports();
				break;
			}
		}
	}
	static void badminton()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Racquet------->Rs-2,235/-");
		System.out.println("										2: Shuttles------->Rs-1149/-");
		System.out.println("										3: NETs------->Rs-599/-");
		System.out.println("										4: Shoes------->Rs-999/-");
		System.out.println("										press any other number to return to previous menu");System.out.println("										Press any other key to go to Previous Menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			sports();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Racquet of "+j+" Quantity.");
				j=j*2235;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Racquet",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						badminton();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Shuttles of "+j+" Quantity.");
				j=j*1149;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Shuttles",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						badminton();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted NETS of "+j+" Quantity.");
				j=j*599;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("NETS",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						badminton();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Shoes of "+j+" Quantity.");
				j=j*999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Shoes",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						badminton();
						break;
					}
				}
				break;
			}
			default:
			{
				sports();
				break;
			}
		}
	}
	static void swimming()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Goggles------->Rs-599/-");
		System.out.println("										2: Cap------->Rs-149/-");
		System.out.println("										3: Ear plugs------->Rs-99/-");
		System.out.println("										4: Nose Plugs------->Rs-89/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			sports();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Goggles of "+j+" Quantity.");
				j=j*599;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Goggles",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						swimming();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Cap of "+j+" Quantity.");
				j=j*149;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Cap",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						swimming();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Ear Plugs of "+j+" Quantity.");
				j=j*99;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Ear Plugs",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						swimming();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Nose Plugs of "+j+" Quantity.");
				j=j*89;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Nose Plugs",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						swimming();
						break;
					}
				}
				break;
			}
			default :
			{
				sports();
				break;
			}
		}
	}
	static void tabletennis()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: TTRacquets------->Rs-679/-");
		System.out.println("										2: Tables------->Rs-15,300/-");
		System.out.println("										3: Balls------->Rs-500/-");
		System.out.println("										4: Bags------->Rs-692/-");
		System.out.println("										press any other number to return to previous menu"); 
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			sports();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				j=scan.nextInt();
				System.out.println("you opted TTRacquets of "+j+" Quantity.");
				j=j*679;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("TTRacquets",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tabletennis();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Tables of "+j+" Quantity.");
				j=j*15300;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Tables",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tabletennis();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Balls of "+j+" Quantity.");
				j=j*500;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Balls",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tabletennis();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				System.out.println("you opted Bags of "+j+" Quantity.");
				j=j*692;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					sports();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Bags",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							sports();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						tabletennis();
						break;
					}
				}
				break;
			}
			default :
			{
				sports();
				break;
			}
		}
	}
}
class Baby extends cart
{
	static void baby()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Carrier");
		System.out.println("										2: Cradle");
		System.out.println("										3: Strollers");
		System.out.println("										4: Health");
		System.out.println("										5: Main Menu");
		System.out.println("										6: Cart");
		System.out.println("										press any other number to Exit");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			baby();
		}
		switch(j)
		{
			case 1:
			{
				carrier();
				break;
			}
			case 2:
			{
				cradle();
				break;
			}
			case 3:
			{
				strollers();
				break;
			}
			case 4:
			{
				Health();
				break;
			}
			case 5:
			{
				mainshopping.mainshopping();
				break;
			}
			case 6:
			{
				cart.billing();
				break;
			}
			default:
			{
				System.exit(0);
			}
		}
	}
	static void carrier()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Antils------->Rs-430/-");
		System.out.println("										2: ATXP------->Rs-399/-");
		System.out.println("										3: HOLMES------->Rs-499/-");
		System.out.println("										4: inEffable------->Rs-449/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			baby();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Antils of "+j+" Quantity.");
				j=j*430;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("Yes");
				System.out.println("No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Antils",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						carrier();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted ATXP of "+j+" Quantity.");
				j=j*399;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("ATXP",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						carrier();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted HOLMES of "+j+" Quantity.");
				j=j*199;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Holmes",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						carrier();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted InEffable of "+j+" Quantity.");
				j=j*1999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("inEffable",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							j=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						carrier();
						break;
					}
				}
				break;
			}
			default :
			{
				baby();
				break;
			}
		}
	}
	static void cradle()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: VParents------->Rs-999/-");
		System.out.println("										2: Prrize World------->Rs-2,915/-");
		System.out.println("										3: Luke------->Rs-799/-");
		System.out.println("										4: Orange------->Rs-1,299/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			baby();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted VParents of "+j+" Quantity.");
				j=j*999;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("VParents",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cradle();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Prrize World of "+j+" Quantity.");
				j=j*2915;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Prizze",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cradle();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted LUke of "+j+" Quantity.");
				j=j*799;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Luke",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cradle();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Orange of "+j+" Quantity.");
				j=j*1299;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Orange",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						cradle();
						break;
					}
				}
				break;
			}
			default:
			{
				baby();
				break;
			}
		}
	}
	static void strollers()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Lolllipop------->Rs-3,817/-");
		System.out.println("										2: MeeMee------->Rs-6499/-");
		System.out.println("										3: Panda------->Rs-1135/-");
		System.out.println("										4: Amardeep------->Rs-850/-");
		System.out.println("										press any other number to return to previous menu");
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			baby();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Lollipop of "+j+" Quantity.");
				j=j*3817;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Lollipop",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						strollers();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted MeeMee of "+j+" Quantity.");
				j=j*6499;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("MeeMee",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						strollers();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Panda of "+j+" Quantity.");
				j=j*1135;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Panda",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						strollers();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Amardeep of "+j+" Quantity.");
				j=j*850;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Amardeep",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						strollers();
						break;
					}
				}
				break;
			}
			default :
			{
				baby();
				break;
			}
		}
	}
	static void Health()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================================================================================================================================================");
		System.out.println("										1: Powder------->Rs-262/-");
		System.out.println("										2: Shampoo------->Rs-254/-");
		System.out.println("										3: Oil------->Rs-429/-");
		System.out.println("										4: Pillows------->Rs-349/-");
		System.out.println("										press any other number to return to previous menu"); 
		int j=0;
		try
		{
			j=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!!");
			System.out.println("please enter the Valid input,with reagrding to the options given");
			baby();
		}
		switch(j)
		{
			case 1:
			{
				System.out.println("please enter the quantity");
				j=scan.nextInt();
				System.out.println("you opted Baby Powder of "+j+" Quantity.");
				j=j*262;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Powder",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						Health();
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Baby Shampoo of "+j+" Quantity.");
				j=j*254;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Shampoo",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						Health();
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Baby Oil of "+j+" Quantity.");
				j=j*429;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Baby Oil",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						Health();
						break;
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("please enter the quantity");
				try
				{
					j=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				System.out.println("you opted Baby Pilows of "+j+" Quantity.");
				j=j*349;
				System.out.println("You are adding item to cart of Rs-"+j+"/-");
				System.out.println("Are you sure");
				System.out.println("1: Yes");
				System.out.println("2: No");
				int k=0;
				try
				{
					k=scan.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Invalid input!!!!");
					System.out.println("please enter the Valid input,with reagrding to the options given");
					baby();
				}
				switch(k)
				{
					case 1:
					{
						hashmap("Baby Pillows",j);
						System.out.println("Are you like to continue shopping");
						System.out.println("1: Yes");
						System.out.println("2: No");
						try
						{
							k=scan.nextInt();
						}
						catch(Exception e)
						{
							System.out.println("Invalid input!!!!");
							System.out.println("please enter the Valid input,with reagrding to the options given");
							baby();
						}
						switch(k)
						{
							case 1:
							{
								mainshopping.mainshopping();
								break;
							}
							case 2:
							{
								if (sum==0)
								{
									System.out.println("                Thank You Visit Again");
									System.exit(0);
								}
								else
								{
									cart.billing();
									break;
								}
								break;
							}
						}
						break;
					}
					case 2:
					{
						Health();
						break;
					}
				}
				break;
			}
			default :
			{
				baby();
				break;
			}
		}
	}
}
class cart
{
	
	static int total;
	static int sum=0;
	static int sum1;
	static Map<String,Integer>	map=new LinkedHashMap();
	public static void hashmap(String s,int i)
	{
		if (map.containsKey(s)==false)
		{
			map.put(s,i);
		}
		else
		{
			int old=(int)map.get(s);
			int nwe=old+i;
			map.put(s, nwe);
		}
		sum+=i;
		/*Set<Map.Entry<String,Integer>> lhmap=map.entrySet();
		for(Map.Entry<String,Integer> data:lhmap)
		{
			if(data.getValue()>0)
			{
				sum=sum+data.getValue();
			}
		}*/
		System.out.println("																			Amount adding to cart = "+i);
		System.out.println("																			Total amount in cart = "+sum);
		//sum=0;
		//System.out.println(sum1);
	}
	public static void billing()
	{
		Scanner scan=new Scanner(System.in);
		Set<String> s= map.keySet();
		//System.out.println(s);
		Object[] str=s.toArray();
		if (sum>0)
		{
		System.out.println("======================================================================================================================================================================================");
		System.out.println("	S.no		|			Item						|						Amount");
		for (int i=0;i<str.length;i++)
		{
			System.out.println("	"+(i+1)+"		|		"+str[i]+"						|						"+map.get(str[i]));
		}
		System.out.println("======================================================================================================================================================================================");
		//System.out.println(map);
		System.out.println("																			Total Amount = "+sum);
		System.out.println("1: Proceed to chekout");
		System.out.println("2: Proceed to Shopping");
		int i=0;
			try
			{
				i=scan.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Invalid input.. Please enter the valid option");
			}
			switch(i)
			{
				case 1:
				{
					bildisp();
					break;
				}
				case 2:
				{
					mainshopping.mainshopping();
					break;
				}
				default:
				{
					System.out.println("Invali Input!!!");
					billing();
					break;
				}
			}
		}
		else
		{
			System.out.println("Nothing in Cart!!!!..");
			System.out.println("please do Shopping..");
			mainshopping.mainshopping();
		}
	}
	public static void bildisp()
	{
		System.out.println("																			CGST = Rs-"+(sum*0.06)+"/-");
		System.out.println("																			SGST = Rs-"+(sum*0.06)+"/-");
		if (sum>20000&&sum<=30000)
		{
			System.out.println("======================================================================================================================================================================================");
			System.out.println("Congratulation..your bill crossed 20000.");
			System.out.println("you will get an extra 5% Discount on your bill of Rs-"+0.05*sum+"/-");
			System.out.println("Now,your bill to pay is "+(((sum*0.12)+sum)-(0.05*sum)));
			System.out.println("Hope for a HAPPY DAY");
			System.out.println("Thanking you Visit again...........");
			System.out.println("======================================================================================================================================================================================");
		}
		else if(sum>30000&&sum<=40000)
		{
			System.out.println("======================================================================================================================================================================================");
			System.out.println("Congratulation..your bill crossed 30000.");
			System.out.println("you will get an extra 7% Discount on your bill of Rs-"+0.07*sum+"/-");
			System.out.println("Now,your bill to pay is "+(((sum*0.12)+sum)-(0.07*sum)));
			System.out.println("Hope for a HAPPY DAY");
			System.out.println("Thanking you Visit again...........");
			System.out.println("======================================================================================================================================================================================");
		}
		else if(sum>40000)
		{
			System.out.println("======================================================================================================================================================================================");
			System.out.println("Congratulation..your bill crossed 40000.");
			System.out.println("you will get an extra 10% Discount on your bill of Rs-"+0.1*sum+"/-");
			System.out.println("Now,your bill to pay is "+(((sum*0.12)+sum)-(0.1*sum)));
			System.out.println("Hope for a HAPPY DAY");
			System.out.println("Thanking you Visit again...........");
			System.out.println("======================================================================================================================================================================================");
		}
		else
		{
			System.out.println("Your need to pay a bill of Rs-"+((sum*0.12)+sum)+"/-");
			System.out.println("Hope for a HAPPY DAY!!");
			System.out.println("Thanking you Visit again...........");
		}
		System.exit(0);
	}
}