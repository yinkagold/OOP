package ass9_4;

import java.security.KeyStore.Entry;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Hashtable<Integer, Member> customer = new Hashtable<Integer, Member>();
		// adding elements of members to the hashtable
		customer.put(new Integer(1), new Member("John", "15/04/2014", 26.5,
				"Vuorikatu", 14, 65100, "Vaasa"));
		customer.put(new Integer(2), new Member("Paul", "15/03/2015", 45.5,
				"Klmentikatu", 5, 65200, "Vaasa"));
		customer.put(new Integer(3), new Member("Peter", "15/06/2014", 22.5,
				"Mylukatu", 9, 65100, "Vaasa"));
		// here we declare enumeration which will hold objects of type integer
		Enumeration<Integer> ids = customer.keys();
		System.out.println("Content of the hashtable: ");
		Integer ID = null;
		while (ids.hasMoreElements()) {
			ID = ids.nextElement();
			System.out.println(ID + " = " + customer.get(ID));
		}
		System.out.println("---------------------");
		System.out.println("Printing based on iterator");
		// next us printing through an iterator
		// here we get content of hash table as a set
		Set<java.util.Map.Entry<Integer, Member>> set = customer.entrySet();
		// define an iterator to go through the content of the hash table
		// Iterator<java.util.Map.Entry<Integer, Member>> iterator =
		// set.iterator();
		// here we define an iterator that goes through the content of the hash
		// table.
		Iterator<java.util.Map.Entry<Integer, Member>> iterator = customer
				.entrySet().iterator();
		// taking input from the keyboard to show information

		while (iterator.hasNext()) {

			java.util.Map.Entry<Integer, Member> entry = iterator.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());

		}
		System.out.println("------------------------------");
		System.out.println("Enter ID to get information ");
		// Member mem = new Member();
		Scanner input = new Scanner(System.in);
		Integer memId = new Integer(input.nextLine());
		Member mem = customer.get(memId);

		System.out.println("Id:" + ""+ memId + mem);

	}

}
