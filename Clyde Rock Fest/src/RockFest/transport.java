package RockFest;

public class transport {
	 double transportprice = 00.00;
	
	public  void setTransportPrice(double NoDaysTransport){
		if (NoDaysTransport == 1){
		transportprice = 10.00;
		}
		
		if (NoDaysTransport == 2){
			transportprice = 20.00;
		}
		
        if (NoDaysTransport == 3){
		transportprice = 30.00;	
		}
	}
		
	
	
		public  double getTransportPrice() {
			
			return transportprice;
		}
		
	}