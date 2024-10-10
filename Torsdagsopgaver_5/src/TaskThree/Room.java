package TaskThree;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    // 3.b
    Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // 3.c
    public int getNumberOfLamps() {
        return this.numberOfLamps;
    }

    public int getNumberOfWindows() {
        return this.numberOfWindows;
    }

    public void setNumberOfLamps(int newNumber) {
            this.numberOfLamps = newNumber;
    }

    public void setNumberOfWindows(int newNumber) {
        this.numberOfWindows = newNumber;
    }
}
