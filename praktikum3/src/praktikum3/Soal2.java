package praktikum3;

import java.util.*;

public class Soal2 {

    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String str=input.next();
                int x=input.nextInt();
             // "%" berarti penulisan selanjutnya adakah argumen pemformatan
             // "-" output disejajarkan ke kiri
             // "15" jumlah blok yang diisi oleh string pertama inputan dan sisanya diisidengan spasi
             // "s" memformat string, d memformat nilai integer
             // "3" jumlah blok yang dapat digunakan oleh nilai integer
             // "0" menunjukkan karakter isian yang diperlukan
             // jika nilai integer kurang dari 3 digit maka sisa blok diisi oleh (0)
                System.out.printf("%-15s", str);
                System.out.printf("%03d%n", x ); 
            }
            input.close();
            System.out.println("================================");
    }
}
