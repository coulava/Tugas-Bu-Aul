import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan harga Awal"); 
    double harga_awal = input.nextDouble();
    System.out.println("Masukkan besar diskon");
    float besaran_diskon = input.nextFloat();
    System.out.println("Masukkan banyaknya barang");
    int banyaknya_barang = input.nextInt();

    double harga_setelah_diskon = (harga_awal - (harga_awal*(besaran_diskon/100))) * banyaknya_barang;
    System.out.println("harga setelah diskon yaitu" + " " + harga_setelah_diskon);
    
        
    }
}
