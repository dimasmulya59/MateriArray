package Tyas;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Kucing");
        hewan.add("Anjing");
        hewan.add("Kelinci");
        hewan.add("Ayam");
        hewan.add("Lalat");

        hewan.remove(2);
        hewan.set(3, "Anoman");
        System.out.println(hewan);
        System.out.println(" ");

        for (String a : hewan) {
            System.out.println(a);

        }
    }
}