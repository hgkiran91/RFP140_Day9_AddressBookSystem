package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.addPerson();
    }
}
