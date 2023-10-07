package Address;

import java.util.ArrayList;
import java.util.Comparator;

import Input.Input;

public class AddressManager {
    public static void addAddress(ArrayList<Address> addresses) {
        String name;
        String address;
        int preference;

        System.out.print("""
                1-Home Address
                2-Business Address
                Enter Number:\s""");

        preference = Input.nextInt(1, 3);

        System.out.print("Enter Address Name: ");
        name = Input.nextLine();
        System.out.println("Enter Full Address:");
        address = Input.nextLine();

        switch (preference) {
            case 1 -> addresses.add(new HomeAddress(name, address));
            case 2 -> addresses.add(new BusinessAddress(name, address));
        }
        reList(addresses);
    }

    public static void removeAddress(ArrayList<Address> addresses) {
        printAddresses(addresses);
        System.out.print("Enter Number or Press Q to Back: ");
        int addressIndex = Input.nextInt(1, addresses.size() + 1) - 1;
        addresses.remove(addressIndex);
    }

    public static void printAddresses(ArrayList<Address> addresses) {
        int i = 0;
        System.out.println("------------------------Addresses------------------------");
        for (Address address : addresses)
            System.out.println((++i) + "-" + address.toString() +
                    "\n---------------------------------------------------------");
    }

    private static void reList(ArrayList<Address> addresses) {
        addresses.sort(Comparator.comparing((Address address) -> address.getName()));
    }
}