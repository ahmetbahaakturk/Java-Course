package Account;

import Address.Address;

import java.util.ArrayList;

public class User {
    private final String name;
    private final String surName;
    private final String email;
    private final String password;
    private final String job;
    private String lastLogInDate;
    private final int age;
    private final ArrayList<Address> addresses;

    public User(String name, String surName, String email, String password, String job, String lastLogInDate, int age) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.lastLogInDate = lastLogInDate;
        this.age = age;
        addresses = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setLastLogInDate(String lastLogInDate) {
        this.lastLogInDate = lastLogInDate;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "--------------------Account Information--------------------" +
                "\nName: " + name +
                "\nSurname: " + surName +
                "\nE-Mail: " + email +
                "\nJob: " + job +
                "\nAge: " + age +
                "\nLast Log In: " + lastLogInDate +
                "\n-----------------------------------------------------------";
    }
}
