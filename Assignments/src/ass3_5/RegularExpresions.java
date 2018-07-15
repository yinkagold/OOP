package ass3_5;

public class RegularExpresions {

	public static void main(String[] args) {
		String phoneRegex =  "[+]\\d{1,3}-\\d{2}-\\d{7}";
		String phone =  "+358-40-1345678";
		String scNumberRegex = "(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}-[0-9]{3}[A-Z]";
		String scNumber = "270890-305X"; //120570-467W
		String numberLessRegex = "100|[1-9]{1,3}";
		String numberLess = "1000";
		String dateNameRegex = "((Jan)|(Feb)|(Mar)|(April)(May)|(June)|(July)|(Aug)|(Sept)|(Oct)|(Nov)|(Dec)).([1-9]|[1-2][0-9]|3[0-1]).[1-2][0-9]{3}";
				 
		String dateName = "Mar.15.2010";
		System.out.println(phone + " "+"is a valid number? : "+ phone.matches(phoneRegex));
		System.out.println(scNumber + " "+"is a valid number? : "+ scNumber.matches(scNumberRegex));
		System.out.println(numberLess + " "+"is a valid number? : "+ numberLess.matches(numberLessRegex));
		System.out.println(dateName + " "+"is a valid number? : "+ dateName.matches(dateNameRegex));

	}

}
