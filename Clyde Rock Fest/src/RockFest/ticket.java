package RockFest;

public class ticket {
 double ticketprice = 00.00;

	public  void setTicketPrice(double NoDaysTickets){
	if (NoDaysTickets ==1)
	{
		ticketprice = 80.00;
	}
    if (NoDaysTickets == 2)
	{
		ticketprice = 150.00;
	}
	if (NoDaysTickets == 3)
	{
		ticketprice = 230.00;
	}
}
	public  double getTicketPrice() {
		
		return ticketprice;
	}
	
}
