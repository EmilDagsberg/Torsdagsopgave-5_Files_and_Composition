package TaskOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.e
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Emil", "Dagsberg", "Emil Racerbil"));
        customers.add(new Customer("Christine", "Jepsersen", "Chrillemuz"));
        customers.add(new Customer("Daniel", "Jepsen", "StenStenSten"));




        printCustomers(customers);

    }
     // 1.f
    static void printCustomers(ArrayList<Customer> customers) {
        for(Customer c : customers) {
            System.out.println(c);
        }

    }
}
