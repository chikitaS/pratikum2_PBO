package praktikum3;

import java.util.*;

public class Soal4 {
	public static void main(String []argh) {
		Scanner input = new Scanner(System.in);
		final int gajiPokok = 500000;	// nilai tetap gaji pokok per-bulan
		final int satuItem = 50000;		// nilai tetap harga penjualan satu item
		int hargaItem = 0;				//harga total item yang dijual selama sebulan
		int gaji = 0;					//gaji bersih yang diterima pegawai perbulan
		int jmlItem = input.nextInt();	// jumlah item yang dijual per-bulan
		input.close();
	/*	Jika jumlah item yang dijual per-bulan lebih dari 80 item */
		if(jmlItem > 80 ) {
			hargaItem = jmlItem * satuItem;
			double bonus =(double) hargaItem * 0.35;
			gaji = gajiPokok + (int) bonus;
	/*	Jika jumlah item yang dijual per-bulan minimal 40 item */
		} else if (jmlItem >= 40 && jmlItem <= 80) {
			hargaItem = jmlItem * satuItem;
			double bonus = (double) hargaItem * 0.25;
			gaji = gajiPokok + (int) bonus;
	/*	Jika jumlah item yang dijual per-bulan kurang dari 15 item */
		} else if (jmlItem < 15) {
			hargaItem = (15 * satuItem) - (jmlItem * satuItem);
			double denda = (double) hargaItem * 0.15;
			gaji = gajiPokok - (int) denda;
	/*	Jika jumlah item yang dijual per-bulan diluar ketentuan jumlah item tertentu */
		} else {
			double bonus = (double) satuItem * 0.10 * (double)jmlItem;
			gaji = gajiPokok + (int) bonus;
		}
	/* Menampilkan output dari variabel gaji */
		System.out.println(gaji);
	}
}
