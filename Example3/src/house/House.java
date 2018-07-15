package house;

public class House implements IHouse {

	private String houseId;
	private double area;
	private String constructionDate;
	private String condition;
	
	public House(){
		
	}

	public House(String houseId, double area, String constructionDate,
			String condition) {
		this.houseId = houseId;
		this.area = area;
		this.constructionDate = constructionDate;
		this.condition = condition;

	}

	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", area=" + area
				+ ", constructionDate=" + constructionDate + ", condition="
				+ condition + "]";
	}

	@Override
	public String update() {
		
		return null;
	}

	@Override
	public String find(String houseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
