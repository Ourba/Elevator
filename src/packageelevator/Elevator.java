package packageelevator;

public class Elevator {
	private String state;
	private String id;
	private int current_floor;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCurrent_floor() {
		return current_floor;
	}
	public void setCurrent_floor(int current_floor) {
		this.current_floor = current_floor;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
