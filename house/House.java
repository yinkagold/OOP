package house;

import java.util.Arrays;

public class House implements IHouse {
	private String id;
	private double area;
	private String constructionDate;
	private String[] args;

	public House() {

	}

	public House(String id, double area, String constructionDate, String[] args) {
		this.id = id;
		this.area = area;
		this.constructionDate = constructionDate;
		this.args = args;
	}

	@Override
	public String find(String id) {
		if (this.id.equals(id))
			return toString();
		else
			return "";
	}

	@Override
	public void update() {
		
	}
	/*public String search(String area){
		if(this.area.equals(area))
			return toString();
		else
			return "";
	}*/

	@Override
	public String toString() {
		return "House [id=" + id + ", area=" + area + "sqkm"+", constructionDate=" +
	constructionDate +" "+ "Conditions :" + Arrays.toString(args);
	}

}
