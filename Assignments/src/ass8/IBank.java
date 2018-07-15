package ass8;

public interface IBank {
	String name = "Nordea";
	String address = "Vaasa";

	public abstract void setBalance();

	public abstract double getBalance();
}
