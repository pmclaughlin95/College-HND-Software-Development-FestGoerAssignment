package RockFest;

import java.io.IOException;
import java.util.Scanner;

public class Festgoer {

	
	public static void main(String[] args) throws IOException {
		String firstName = "";
		String secondName = "";
		String Address = "";
		String accommodationA;
		double AccommodationPrice = 0;
		int NoDaysTickets = 0;
		int NoDaysTransport = 0;
		int NoDaysParking = 0;
		double TicketPrice = 0;
		double TransportPrice = 0;
		double TotalCost = 0;
		double ParkingPrice = 0;
		int HouseNo;
		double ticketamount = 0;
		int Travel = 0;
		int Park = 0;
		int option = 0;
		String accommodationA1= "";
		boolean quit = false;
		Scanner sc = new Scanner(System.in);  // create scanner for input
		String file_name = "U:Clyde Rock Fest Assessment.txt";
		
		accommodation acc = new accommodation();
		ticket tc = new ticket();
		transport tr = new transport();
		parking pr = new parking();
		System.out.println(" 1. Enter Details ");
		System.out.println(" 2. Enter Ticket Information and calculate total cost ");
	    System.out.println(" 3. Display Cost ");
		System.out.println(" 4. Save to file ");
		System.out.println(" 5. Exit the program ");
		
		
		do{
			System.out.println(" pick a number to proceed ");
			if (option != 1-5)
			{
				option = sc.nextInt();
				System.out.println(" Please enter a valid number from the menu");
				System.out.println("");
			}
		
			else if(option == 1-5)
			
			{
				sc.next();
				System.out.println("");
			}
			
			switch (option){
			case 1: System.out.println(" 1. Enter First Name ");
			firstName = sc.next();
			
			System.out.println(" 2. Enter Surname ");
			secondName = sc.next();
			
			System.out.println(" 3. Enter address ");
			sc.nextLine();
			Address = sc.nextLine();
			
			break;
			
			
			case 2:System.out.println(" How many days' tickets will you be needing?");
			        NoDaysTickets = sc.nextInt();
					tc.setTicketPrice(NoDaysTickets);
					ticketamount = tc.getTicketPrice();
					if (sc.hasNextInt())
					{
					   
					  if(NoDaysTickets >= 1 && NoDaysTickets <= 3)
					   
				    {
						tc.setTicketPrice(NoDaysTickets);
					}
					  else
					{
						System.out.println("this is not a valid option, please choose 1, 2 or 3");
						System.out.println("");
						sc.nextInt();
					}
						
					}
	
			
					System.out.println(" Do you require a tent or a self pitch? ");
					accommodationA1 = sc.next();
					acc.setAccommodationPrice(accommodationA1)	;
					AccommodationPrice = acc.getAccommodationPrice();
					System.out.println(" Do you require bus tickets to get there? if yes, 0,1,2,3 days? ");
					NoDaysTransport = sc.nextInt();
					tr.setTransportPrice(NoDaysTransport);
					TransportPrice = tr.getTransportPrice();
					System.out.println("do you require parking, if yes, 0,1,2,3 days? ");
					NoDaysParking = sc.nextInt();
					pr.setParkingPrice(NoDaysParking);
					ParkingPrice = pr.getParkingPrice();
					TotalCost = ticketamount + AccommodationPrice + TransportPrice + ParkingPrice;
			break;
			case 3:
				//displays each individual cost, then displays the total cost.
				System.out.println(ticketamount + " " + AccommodationPrice + " " + TransportPrice + " " + ParkingPrice);
				System.out.println("the total cost of your Clyde Rock Fest Ticket is £ " + TotalCost );	
			break;
			case 4:
			WriteDetails data = new WriteDetails( file_name, true );
		    data.writeToFile(" First Name: " + firstName + " \r\nSurname: " + secondName + " \r\nAddress" + Address + " \r\nTicket Price: £ " + ticketamount + " \r\nAccommodation Price: £ " + AccommodationPrice + " \r\nTransport Price: £ " + TransportPrice + " Parking Price: £ " + ParkingPrice );
			System.out.println(" Data has been saved to file ");
			break;
			case 5:quit = true;    // quits program  
			
			
			}
			
			  
		}while (!quit);
		option = sc.nextInt();	
	}

}





























































































