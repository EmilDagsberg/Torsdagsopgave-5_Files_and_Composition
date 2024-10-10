package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g
        Room r1 = new Room(3, 2);
        Room r2 = new Room(10, 20);
        Room r3 = new Room(30, 30);

        // 3.h
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        // 3.i
        Building b1 = new Building(rooms, 2);
        Building b2 = new Building(rooms, 4);


        System.out.println("Total number of lamps: " + countLampsInBuilding(b1));

        System.out.println("Total number of windowds: " + countWindowsInBuilding(b1));

        System.out.println("Total number of rooms: " + countRoomsInBuilding(rooms));

        System.out.println("There are as many floors or more, as room: " + isNormal(b1, rooms));

        System.out.println("There are as many floors or more, as room: " + isNormal(b2, rooms));

    }


    // 3.j
    static int countLampsInBuilding(Building building){
        int totalNumber = 0;
        for(Room room : building.getRooms()){
            totalNumber += room.getNumberOfLamps();
        }
        return totalNumber;
    }

    static int countWindowsInBuilding(Building building) {
        int totalNumber = 0;
        for(Room room : building.getRooms()){
            totalNumber += room.getNumberOfWindows();
        }
        return totalNumber;
    }

    static int countRoomsInBuilding(ArrayList<Room> rooms) {
        return rooms.size();
    }

    // 3.k
    static boolean isNormal(Building building, ArrayList<Room> rooms) {
        if(building.getNumberOfFloors() >= rooms.size()) {
            return true;
        }else{
            return false;
        }
    }


}
