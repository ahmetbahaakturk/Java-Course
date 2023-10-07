package Account;

import Address.Address;

import java.util.ArrayList;

public class User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String job;
    private String lastLogInDate;
    private int age;
    private ArrayList<Address> addresses;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSirName(String surName) {
        this.surName = surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLastLogInDate() {
        return lastLogInDate;
    }

    public void setLastLogInDate(String lastLogInDate) {
        this.lastLogInDate = lastLogInDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nSurname: " + surName +
                "\nE-Mail: " + email +
                "\nJob: " + job +
                "\nAge: " + age +
                "\nLast Log In: " + lastLogInDate;
    }
}
