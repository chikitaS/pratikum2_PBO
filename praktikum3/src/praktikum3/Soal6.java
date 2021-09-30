package praktikum3;
import java.util.*;
import java.math.*;
public class Soal6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 /*menginisialisasi variabel a, b dengan tipe data BigInteger oleh inputan keyboard
	   inputan keyboard sebelumnya diubah kedalam tipe data BigInteger sebelum diinisialisasi kedalam variabel a, b */ 
	    BigInteger a = scan.nextBigInteger();
	    BigInteger b = scan.nextBigInteger();
	    System.out.println(a.add(b));		//menampilkan output dari hasil penambahan a + b untuk tipe data BigInteger
	    System.out.println(a.multiply(b));	//menampilkan output dari hasil perkalian a * b untuk tipe data BigInteger
	    scan.close();
	}
}
