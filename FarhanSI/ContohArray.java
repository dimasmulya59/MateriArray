package FarhanSI;

import java.util.ArrayList;

    public class ContohArray {
        public static void main(String[] args) {
            ArrayList<String> buah= new ArrayList<String>();
            buah.add("anggur");
            buah.add("jeruk");
            buah.add("mangga");
            buah.add("semangka");
            buah.add("manggis");
            buah.remove(1);
            buah.set(3,"Hantu" );

            System.out.println(buah);

            for(int i=2 ; i < buah.size(); i++){
                System.out.println(buah.get(i));
            }

            for(String a : buah ){
                System.out.println(a);
            }
        }
    }
