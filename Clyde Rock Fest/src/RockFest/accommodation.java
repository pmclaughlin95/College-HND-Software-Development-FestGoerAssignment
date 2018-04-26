package RockFest;

public class accommodation {
	 double accommodationprice = 00.00;
	
	public void setAccommodationPrice (String accommodationA){
		if (accommodationA.equals("tent"))
		{
			accommodationprice = 135.00;
		}
		if (accommodationA.equals("selfPitch"))
	{
			accommodationprice = 71.00;
	}
		if (accommodationA.equals("no")){
		accommodationprice = 0;
	}
}
	public  double getAccommodationPrice() {
		
		return accommodationprice;
	}
	
}

	
