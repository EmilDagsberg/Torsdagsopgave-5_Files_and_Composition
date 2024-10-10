package TaskThree;

import java.util.ArrayList;
// 3.d
public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfFloors;

    // 3.e
    Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // 3.f
    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public void setRooms(ArrayList<Room> newRooms) {
        this.rooms = newRooms;
    }

    public void setNumberOfFloors(int newNumber) {
        this.numberOfFloors = newNumber;
    }
}
