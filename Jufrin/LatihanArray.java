package jufrin;
import java.util.*;
public class LatihanArray {
    public static void main(String[] args) {
        ArrayList<String>mobil = new ArrayList<String>();
        mobil.add("mersi");//mersi,bmw,avanza,xenia
        mobil.add("BMW");
        mobil.add("Avanza");
        mobil.add("xenia");
        for (int i=0;i<mobil.size();i++)
        {
            if(mobil.get(i).equalsIgnoreCase("Avanza"))
            {
                mobil.set(i,"Agya");
            }
            else
            {
                System.out.println("");
            }
            System.out.println(mobil);

        }


    }

}
