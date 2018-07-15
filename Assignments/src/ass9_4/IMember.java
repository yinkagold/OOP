package ass9_4;

public interface IMember {
	String clubName = "City";
	String foundationYear = "1945";

	public abstract String search(String name);

	public abstract int membershipDuration();

}
