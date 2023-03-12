package jufrin;
import java.util.*;

public class LatihanArray2 {
    public static void main(String[] args) {
        System.out.println("==BikinArrayNotList==");
        String [] nama = {"Miya Khalifa","MariaOzama","Yukimura","Hatake","yubimitsuka"};
        int umur [] = {20,34,39,12,13,67};
        System.out.println("menghitung subuah panjang suatu arry = " + nama.length +" p.array");
        System.out.println("Memanggl samua intex blok array = 0 "+ nama[0]);//index array mulai dari 0;
        System.out.println("Memanggl samua intex blok array = 1 "+ nama[1]);//memanggil sebuah index harus ada [index];
        System.out.println("Memanggl samua intex blok array = 2 "+ nama[2]);
        System.out.println("Memanggl samua intex blok array = 3 "+ nama[3]);
        System.out.println("Memanggl samua intex blok array = 4 "+ nama[4]);
        System.out.println("Memanggl samua intex blok array = 0 "+ umur[0]);//index array mulai dari 0;
        System.out.println("Memanggl samua intex blok array = 1 "+ umur[1]);
        System.out.println("Memanggl samua intex blok array = 2 "+ umur[2]);
        System.out.println("Memanggl samua intex blok array = 3 "+ umur[3]);
        System.out.println("Memanggl samua intex blok array = 4 "+ umur[4]);
        System.out.println("================ARRAYLIST=====================");
        ArrayList list = new ArrayList<>();
        list.add("Kopi");//add .itu menbahkan suatu objek pada array list
        list.add("Minasarua");
        list.add("hentai");
        list.add("COCOK dulu baru tanam");
        list.add("linkbiru"); //index ada 5 colums {0,1,2,3,4}
        list.remove("hentai"); //menghapus index <index,objek>
        System.out.println("arrya sebelum di hapus");
        list.set(3,"JumboMambo"); // mengreplace sebuah objek dan menambah ke index;
        System.out.println("Hasil sebuah array list"+list);
        System.out.println("arrya sebelum kondisi perulangan");
        for (int i=0;i<list.size();i++)//kondisi perulangan//////
            {
         if (list.get(i).equals("Kopi")) {
             list.set(3,"Coca cola");
             System.out.println(list);
         }
         else
         {
             System.out.println("");
         }
            }
    }
}
