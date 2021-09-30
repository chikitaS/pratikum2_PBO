package praktikum3;

import java.util.*;

public class Soal5 {
	public static void main(String []argh) {
	Scanner input = new Scanner(System.in);
	/* mendeklarasikan nomor plakat  variabel mobil1, mobil2, mobil3, mobil4 dengan tipe data string */ 
		String mobil1 = input.next();
		String mobil2 = input.next();
		String mobil3 = input.next();
		String mobil4 = input.next();
		input.close();
		//menjumlahkan variabel mobil1, mobil2, mobil3, mobil4
		String jmlMobil = mobil1 + mobil2 + mobil3 + mobil4;	
	/* mengubah variabel jmlMobil bertipe data string ke dalam tipe data long 
	   dan meng inisialisasi variabel longJmlMobil
	 */
		long longJmlMobil = Long.parseLong(jmlMobil);
		// pengurangan nilai variabellongJmlMobil dengan 999999 
		long kurangMobil = longJmlMobil - 999999;
		// operasi sisa bagi variabel kurangMobil dibagi 5
		int bagiMobil = (int) kurangMobil % 5;
		// if else dengan pengkondisian bagiMobil == 0 
		if(bagiMobil == 0)
			System.out.println("Berhenti");
		else System.out.println("Jalan");
	}
}
