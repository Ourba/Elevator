package packageelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Building {

	//number of floors in the building
	
private int numberOfFloors;
//each building have a list of elevators
private Map<String , Elevator> elevators;

//private List<Elevator> elevatorsOfbuilding = new ArrayList<>();

//la methode move 
public void move (String  id_elevator , String direction){
	if (direction.equals("DOWN")) {
		//le cas 
	}
	else {
		if(direction.equals("UP")) {}
		else {}
	}
}

//la methode stopat
public void stopAt (String  id_elevator , int floor){
	
}

//la methode request elevator 
public void requestElevator (int floor) {}

private ElevatorFactory elevatorFactory = ConcrteteElevatorFactory.getInstance();
/**
 * @return the numberOfFloors
 */
public int getNumberOfFloors() {
	return numberOfFloors;
}
/**
 * @param numberOfFloors the numberOfFloors to set
 */
public void setNumberOfFloors(int numberOfFloors) {
	this.numberOfFloors = numberOfFloors;
}
/**
 * @return the elevatorsOfbuilding
 */
public List<Elevator> getElevatorsOfbuilding() {
	return elevatorsOfbuilding;
}
/**
 * @param elevatorsOfbuilding the elevatorsOfbuilding to set
 */
public void setElevatorsOfbuilding(List<Elevator> elevatorsOfbuilding) {
	this.elevatorsOfbuilding = elevatorsOfbuilding;
}

/**
 * @return the elevators
 */
public Map<String , Elevator> getElevators() {
	return elevators;
}

/**
 * @param elevators the elevators to set
 */
public void setElevators(Map<String , Elevator> elevators) {
	this.elevators = elevators;
}
}
