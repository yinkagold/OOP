package house;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class MainHouse {

	public static void main(String[] args) {
		House[] house = new House[3];
		house[0] = new House("H001", 75, "17.4.2004", new String[] { args[0] });
		house[1] = new House("H002", 85, "17.4.2005", new String[] { args[1] });
		house[2] = new House("H001", 95, "17.4.2006", new String[] { args[2] });

		for (int i = 0; i < house.length; i++) {
			System.out.println(house[i].toString());
			// System.out.println(house[i].find("H001"));
		}
		Hashtable<Double, House> buildings = new Hashtable<Double, House>();
		// adding elements of members to the hashtable
		buildings.put(new Double(75), new House("H001", 75, "17.4.2004", new String[] { args[0] }));
		buildings.put(new Double(85), new House("H002", 85, "17.4.2005", new String[] { args[1] }));
		buildings.put(new Double(95), new House("H003", 95, "17.4.2006", new String[] { args[2] }));
		// here we declare enumeration which will hold objects of type integer

		Enumeration<Double> ids = buildings.keys();
		System.out.println("Content of the hashtable: ");
		Double ID = null;
		while (ids.hasMoreElements()) {
			ID = ids.nextElement();
			System.out.println(ID + " = " + buildings.get(ID));
		}
		System.out.println("Enter House Area to get information ");
		// Member mem = new Member();
		Scanner input = new Scanner(System.in);
		Double houseArea = new Double(input.nextLine());
		House house1 = buildings.get(houseArea);
		System.out.println("House with area: " + houseArea + house1);

	}

	public static void store() {
		try {
			FileOutputStream fileOut = new FileOutputStream("C:/Flight/hashTable.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(fileOut);;
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

/*	private static void fetch() {
		Hashtable buildings = null;

		try {
			FileInputStream fileIn = new FileInputStream("C:/Flight/hashTable.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);

			buildings = (Hashtable) in.readObject();

			in.close();
			fileIn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Enumeration e = buildings.keys(); e.hasMoreElements();) {
			Object obj = e.nextElement();
			System.out.println("Values:" + buildings.get(obj));
		}
*/
	}

