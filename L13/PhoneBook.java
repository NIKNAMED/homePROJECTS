package L13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> phones = phoneBook.getOrDefault(surname, new ArrayList<>());
        phones.add(phoneNumber);
        phoneBook.put(surname, phones);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("наруто", "1337");
        phoneBook.add("саске", "1488");
        phoneBook.add("пейн", "228");

        System.out.println("Телефоны для фамилии наруто: " + phoneBook.get("наруто"));
        System.out.println("Телефоны для фамилии саске: " + phoneBook.get("саске"));
        System.out.println("Телефоны для фамилии пейн: " + phoneBook.get("пейн"));
    }
}