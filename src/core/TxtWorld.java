package core;

import java.util.Scanner;

public class TxtWorld
{

	Scanner stdin;
	
	public void init()
	{
		System.out.println("===== TXT WRLD =====");
		System.out.println("(N)ew game or (L)oad from existing data?");
		stdin = new Scanner(System.in);
		String tmp = stdin.nextLine();
		if (tmp.toUpperCase().equals("N"))
		{
			System.out.println("New game! Creating a new character.");
			System.out.println("Name of your character?");
			
		}
	}
	
	public void run()
	{
		
	}
	
	public static void main(String[] args)
	{
		TxtWorld prog = new TxtWorld();
		prog.init();
		prog.run();
	}
	
}
