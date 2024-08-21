import java.util.Scanner;

public class Karyawan {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    // Meminta input jumlah jam kerja
    System.out.println("Masukkan jumlah jam kerja: ");
    int  jam_Kerja = Scanner.nextInt();
    
    //Meminta input tarif per jam 
    System.out.println("Masukkan tafif per jam: ");
    int tarif_per_jam = Scanner.nextInt();

    //Menghitung gaji bruto 
    int gaji_bruto = jam_Kerja * tarif_per_jam;

    //Menghitung potongan pajak 
    double potongan_pajak = gaji_bruto * 0.10;

    //Menghitung gaji bersih 
    double gaji_bersih = gaji_bruto - potongan_pajak;

    //Menampilkan hasil
    System.out.println("Gaji bruto: " + gaji_bruto);
    System.out.println("Potongan pajak: " + potongan_pajak);
    System.out.println("Gaji bersih: " + gaji_bersih);
    }
}
