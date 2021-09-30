package praktikum3;

import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();// trim() digunakan untuk membuang karakter spasi di awal dan akhir dari sebuah string
        if (s.length() == 0) {		//jika length dari variabel s sama dengan 0
            System.out.println(0);	//maka akan muncul output berupa angka int 0
        } else {
        	/*split(), method yang berfungsi  mengambil nilai dari variabel tipe data string tertentu menggunakan regex
        	 lalu akan dikembalikan dengan nilai char array */
            String[] strings = s.split("['!?,._@ ]+");	//menampung nilai dari hasil split pola [!,?._'@ ] variabel s
            System.out.println(strings.length);			//menampilkan output length dari variabel array strings
         // looping for each, untuk str bernilai variabel array strings
            /* looping untuk menampilkan nilai yang dipisahkan oleh split()*/
            for (String str : strings)
                System.out.println(str);
        }
    }
}
