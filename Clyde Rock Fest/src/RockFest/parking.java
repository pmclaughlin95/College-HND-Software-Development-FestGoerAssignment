package RockFest;

public class parking {
	double parkingprice = 00.00;

public  void setParkingPrice(double NoDaysParking){
	if (NoDaysParking == 1){
	  	parkingprice = 12.50; 
    }
    
    if (NoDaysParking == 2){
    	parkingprice = 25.00;
    }
    
    if (NoDaysParking == 3){
       parkingprice = 37.50;
    }
  }

public  double getParkingPrice() {
	
	return parkingprice;
}

}
    
  


