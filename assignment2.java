import java.util.Random;

	public class Ticket {
		
		Random random = new Random();
		
		private String name;
		private int speed; 
		private int speedLimit;
		private boolean schoolZone;
		private boolean workZone;
		double fine;
		private String notice;
		private String ticketType;  
		
		public Ticket(String name, int speed, int speedLimit, boolean schoolZone, boolean workZone) 
		{
			this.name = name;
			this.speed = speed;
			this.speedLimit = speedLimit;
			this.schoolZone = schoolZone;
			this.workZone = workZone;
		}
		
		public Ticket(String name, int speed, int speedLimit) {
			this.name = name;
			this.speed = speed;
			this.speedLimit = speedLimit;
			this.schoolZone = false;
			this.workZone = false; 
			
		}
		

		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getSpeedLimit() {
			return speedLimit;
		}
		public void setSpeedLimit(int speedLimit) {
			this.speedLimit = speedLimit;
		}
		public boolean isSchoolZone() {
			return schoolZone;
		}
		public void setSchoolZone(boolean school) {
			this.schoolZone = school;
		}
		public boolean isWorkZone() {
			return workZone;
		}
		public void setWorkZone(boolean work) {
			this.workZone = work;
		}
		
		
		 
		public double calculateFine() {
			int overLimit = speed - speedLimit; 
			
			if (overLimit <= 10 && overLimit >= 1)
				{
				fine += 140;
				
				if (schoolZone) {
					fine =200;
				}
				else  if (workZone) {
					fine =250;	
				}
			}
			else if (overLimit <= 20 && overLimit >= 11) {
				fine += 195;
			
			if (schoolZone) {
				fine =300;
				
			}else  if (workZone) {
				fine =350;
				
			}
			}
			else if (overLimit <= 30 && overLimit > 21)
			{
			fine += 450;
			
				
			}{
			
			
			if   (overLimit >= 40)
		  fine += 600;
		
		}return fine;
		}
			
		
		
		private int generateTicketNum() {
			return random.nextInt(900000) + 100000; 
		}
		
		public int generateCourtDate() {
			return random.nextInt(1) + 31; 
		}
		
		public String ticketType() {
			
			if (fine <= 450) {
				ticketType = "Payable";
			}
			if (fine <= 495) {
				ticketType = "Must Appear";
			}
			
			return ticketType;
			
		}
		
		public String printNotice() {
			String notice = "Department of Motor Vehicles\n" + "Automated Traffic Enforcement\n" + 
							"\n\nDear "+ name + " Please pay the following speeding fine of $" + calculateFine() + " to the DMV within 10 days of\r\n" + 
							"receiving this notice to avoid a driver's license suspension. You are being fined for going  "
							+ speed + " MPH in a " + speedLimit + " MPH zone.\n\n" + "Ticket Type: "+ ticketType ()+ "\n\nTicket Number: "+ generateTicketNum() + 
							"\n\nReturned checks are subject to a returned check fee of $35.00\n\n" + "Sincerely\n" +  "Keren Belay";
			
			return notice;
		}
		
		

		@Override
		public String toString() {
			return "Assignment2 [random=" + random + ", name=" + name + ", speed=" + speed + ", speedLimit=" + speedLimit
					+ ", school=" + schoolZone + ", work=" + workZone + ", fine=" + fine + ", notice=" + notice + ", ticketType="
					+ ticketType + ", overLimit=" + speedLimit + "]";
		}
		
		
		
		
		

		

	}



