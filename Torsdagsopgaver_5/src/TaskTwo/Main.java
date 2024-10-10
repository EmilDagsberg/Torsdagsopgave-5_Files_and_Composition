package TaskTwo;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // 2.g
        Cafe c1 = new Cafe();
        c1.loadMenuData();

        // 2.h
        ArrayList<String> menu = c1.getCoffeeMenu();

        for(String e : menu) {
            System.out.println(e);
        }

    }
}
