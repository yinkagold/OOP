package shop;

public class Customer {

	
		
		String name;
		String phoneNumber;
		double purchase;
		boolean privileged;
		
		// constructor - a special method that does not have a return type at all, help to initialize in a more efficient way
		
		 Customer() {
			 name = "not known";  // variables not defined here would be returned as default
			 phoneNumber = "not known";
			
		}
		
		void setValues(String cName, String cPhoneNumber, double cPurchase, boolean cPrivleged){
			// right hand will be copied to the left hand with "="
			name = cName;
			phoneNumber = cPhoneNumber;
			purchase = cPurchase;
			privileged = cPrivleged;
			
		}
		
		double getPurchase(){
			return purchase;
		}
		
		String getInfo(){
			return name +" " + phoneNumber + " " + purchase+ " " + privileged;
		}
	}


