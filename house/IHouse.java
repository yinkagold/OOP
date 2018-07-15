package house;

import java.util.concurrent.locks.Condition;

public interface IHouse {
	
	public abstract String find(String id);
	public abstract void update();
	
}
