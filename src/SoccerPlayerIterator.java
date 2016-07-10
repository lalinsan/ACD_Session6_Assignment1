/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 1
 * Java Programs that allows to enter Team and the system displays the List of Players in the matching List
 * Uses an Iterator to go through the List and Print the items on the List 
 */

import java.util.ArrayList; //Imports the Array List Class from Java API Library, to store the Array List and use its methods
import java.util.Iterator; //Imports the Iterator Class from Java API Library, to iterate through the ArrayList
import java.util.Scanner; //Imports the Scanner Class from Java API Library, to allows User's Input


public class SoccerPlayerIterator {

	@SuppressWarnings({ "rawtypes", "unchecked" }) //Suppress warning errors
	public static void main(String[] args) { //Main Method to run the Program
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Initiates the Scanner Instance
		String choice = "Y"; //Variable to store user's selection to question want to continue
		
		//Executes the code below as long as the variable choice = Yes or Y
		while (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y"))
		{
		
			System.out.print("Enter Barcelona or Juventus or Chelsea : "); //Prompts the user to enter a Soccer Team
			String team=sc.next(); //Stores the value entered by the User
			
			if (team.equalsIgnoreCase("Barcelona")) //Executes code below if the user enters Barcelona
			{
				ArrayList soccerPlayerB= new ArrayList(); //Create the ArrayList and store in variable soccerPlayetB
				
				//Add Players to the ArrayList
				soccerPlayerB.add("Claudio Bravo");	 
				soccerPlayerB.add("Leonardo Messi");
				soccerPlayerB.add("Dani Alves");
				soccerPlayerB.add("Neymar");
				soccerPlayerB.add("Gerard Pique");
				soccerPlayerB.add("Luis Suarez");
				soccerPlayerB.add("Andres Iniesta");
				soccerPlayerB.add("Javier Mascherano");
				soccerPlayerB.add("Samuel Umtiti");
				soccerPlayerB.add("Arda Turan");
				soccerPlayerB.add("Denis Suarez");
				
				System.out.println("+++++++ Barcelona Players +++++++++");
				System.out.println("==================================");
				Iterator iterator = soccerPlayerB.iterator(); //Creates an instance of the Iterator Class for soccerB
				while (iterator.hasNext()) //Execute code while there is a next element on the ArrayList 
				{
					Object listElement = iterator.next(); //Assign each Element on the List to to listElement variable
					System.out.println(listElement); //Assign each Element on the List to to listElement variable
				}
						
			}
			
			else if (team.equalsIgnoreCase("Juventus")) //Executes code below if the user enters Juventus
			{
				ArrayList soccerPlayerJ= new ArrayList(); //Create the ArrayList and store in variable soccerPlayetJ
				//Add Players to the ArrayList
				soccerPlayerJ.add("Gianluigi Buffon");
				soccerPlayerJ.add("Claudio Marchisio");
				soccerPlayerJ.add("Juan Cuadrado");
				soccerPlayerJ.add("Paul Pogba");
				soccerPlayerJ.add("Paulo Dybala");
				soccerPlayerJ.add("Sami Khedira");
				soccerPlayerJ.add("Simione Saza");
				soccerPlayerJ.add("Leonardo Bonucci");
				soccerPlayerJ.add("Martin Caceres");
				soccerPlayerJ.add("Roberto Pereyra");
				soccerPlayerJ.add("Mario Lemina");
				
				System.out.println("++++++++ Juventus Players ++++++++");
				System.out.println("==================================");
				Iterator iterator = soccerPlayerJ.iterator(); //Creates an instance of the Iterator Class for soccerJ
				while (iterator.hasNext()) //Execute code while there is a next element on the ArrayList
				{
					Object listElement = iterator.next(); //Assign each Element on the List to to listElement variable
					System.out.println(listElement); //Assign each Element on the List to to listElement variable
				}
			}
			
			else if (team.equalsIgnoreCase("Chelsea")) //Executes code below if the user enters Chelsea
			{
				ArrayList soccerPlayerC= new ArrayList(); //Create the ArrayList and store in variable soccerPlayetC
				//Add Players to the ArrayList
				soccerPlayerC.add("Thibaut Courtois");
				soccerPlayerC.add("Diego Costa");
				soccerPlayerC.add("Oscar");
				soccerPlayerC.add("John Terry");
				soccerPlayerC.add("Pedro");
				soccerPlayerC.add("Kenedy");
				soccerPlayerC.add("Nemanja Matic");
				soccerPlayerC.add("Kurt Zourma");
				soccerPlayerC.add("Matt Miazga");
				soccerPlayerC.add("Cesar Azpilicueta");
				soccerPlayerC.add("Baba Rahman");
				
				System.out.println("++++++++ Chelsea Players ++++++++");
				System.out.println("==================================");
				Iterator iterator = soccerPlayerC.iterator(); //Creates an instance of the Iterator Class for soccerC
				while (iterator.hasNext()) //Execute code while there is a next element on the ArrayList
				{
					Object listElement = iterator.next(); //Assign each Element on the List to to listElement variable
					System.out.println(listElement); //Assign each Element on the List to to listElement variable
				}
			}
			
			else 
			{
				System.out.println("Invalid Team"); //Displays message when the user does not enter Barcelona, Juventus, Chelsea
			}
			System.out.println("==================================");
			System.out.print("Do you want to try again ? Y|N ? "); //Prompts the user to try again
			choice=sc.next(); //stores the value entered by the User
		}
		System.out.println("==================================");
		System.out.print("Thanks for using the Soccer List Generator");	//Good bye message when user does not want to continue
		
		
	}

}
