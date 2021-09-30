package praktikum3;

import java.util.Scanner;

public class cobaa {
	public static void main(String []argh) {
		Scanner input = new Scanner(System.in);	
			long mobil1 = input.nextInt();
			String mobil1a = Long.toString(mobil1);
			long mobil2 = input.nextInt();
			String mobil2a = Long.toString(mobil2);
			long mobil3 = input.nextInt();
			String mobil3a = Long.toString(mobil3);
			long mobil4 = input.nextInt();
			String mobil4a = Long.toString(mobil4);
			input.close();
			String jmlMobil = mobil1a + mobil2a + mobil3a + mobil4a;
			//String jmlMobil = mobil1 + mobil2 + mobil3 + mobil4;
			System.out.println(jmlMobil);
			long longJmlMobil = Long.parseLong(jmlMobil);
			long kurangMobil = longJmlMobil - 999999;
			long bagiMobil = kurangMobil % 5;
			if(bagiMobil == 0)
				System.out.println("Berhenti");
			else System.out.println("Jalan");
		}
}
