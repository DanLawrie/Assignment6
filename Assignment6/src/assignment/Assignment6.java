package assignment;
import java.io.PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException  {
		File inputarea = new File("C:\\Users\\dlawr\\eclipse-workspace\\Assignment6\\src\\assignment\\worldarea.txt");
		File inputpop = new File("C:\\Users\\dlawr\\eclipse-workspace\\Assignment6\\src\\assignment\\worldpop.txt");
		Scanner onearea = new Scanner(inputarea);
		Scanner twopop = new Scanner(inputpop);
		PrintWriter out = new PrintWriter("C:\\Users\\dlawr\\eclipse-workspace\\Assignment6\\src\\assignment\\world_pop_density.txt");
		

		
		String area;
		String population = "";
		String name = "";
		double density;
		while (onearea.hasNextLine() && twopop.hasNextLine())
		{
		String linearea = onearea.nextLine();
		
		//area
		int i = 0;
		while (!Character.isDigit(linearea.charAt(i))) 
		{ i++;}
		name = linearea.substring(0, i);  
		area = linearea.substring(i);
		double are = Double.parseDouble(area);
		
		
		//population
		String linepop = twopop.nextLine();
		int x = 0;
		while (!Character.isDigit(linepop.charAt(x))) 
		{ x++;}
		 population = linepop.substring(i);
		
		
		double pop = Double.parseDouble(population);
		density = pop/are;
		name = name.trim();
		//out.printf("%-15s%10.2f%", name + ":", density );
		out.printf("%-8s%12.2f", name + ":", density );
		out.println();
		}
		
		
		out.close();
	}

}
