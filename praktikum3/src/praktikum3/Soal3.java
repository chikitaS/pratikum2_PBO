package praktikum3;
import java.util.*;

public class Soal3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int hasil = 0;
/*	menginisialisasi variabel A dengan inputan dari keyboard 
	yang sebelum diinisialisasi diubah ke tipe data integer	*/ 
	int A = input.nextInt();
/*	menginisialisasi variabel operator dengan inputan dari keyboard */ 
	String operator = input.next();
	int B = 0;
/*	percabangan switch-case untuk operasi saat menginisialisasi variabel operator */
	if (A >= 1) {
		switch (operator) {
			case "+" :
				B = input.nextInt();
				if(B <= 1000) 
					hasil = A + B;
				else
					System.out.println("Angka di luar batas persyaratan");
				break;
			case "-" :
				B = input.nextInt();
				if(B <= 1000) 
					hasil = A - B;
				else
					System.out.println("Angka di luar batas persyaratan");
				break;
			case "*" :
				B = input.nextInt();
				if(B <= 1000) 
					hasil = A * B;
				else
					System.out.println("Angka di luar batas persyaratan");
				break;
			case "/" :
				B = input.nextInt();
				if(B <= 1000) 
					hasil = A / B;
				else
					System.out.println("Angka di luar batas persyaratan");
				break;
			case "%" :
				B = input.nextInt();
				if(B <= 1000) 
					hasil = A % B;
				else
					System.out.println("Angka di luar batas persyaratan");
				break;
			default :
				System.out.println("Operator tidak tersedia");
				break;
		}
		input.close();
	} else
		System.out.println("Angka di luar batas persyaratan");
/*	output yang akan ditampilkan jika memenuhi pengkondisian if */
	if (A >= 1 && B <= 1000)
		System.out.println(hasil);
	} 
}
