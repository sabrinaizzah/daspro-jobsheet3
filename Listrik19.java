import java.util.Scanner;
/**
  * Listrik19
  */
 public class Listrik19 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaListrik = 1500, jmlListrik, totalHargaListrik;
        boolean statusListrik;

        System.out.println("Masukkan Jumlah Listrik (kwh)\t\t: ");
        jmlListrik = sc.nextInt();

        statusListrik = jmlListrik > 500;

        totalHargaListrik = jmlListrik * hargaListrik;

        System.out.printf("\nOutput:\n\nApakah Listrik Melebihi 500 kWh?\t: %s\nJumlah Listrik\t\t\t\t: %s\nHarga Listrik (kWh)\t\t\t: %s\nTotal Bayar Listrik\t\t\t: %s", statusListrik, jmlListrik, hargaListrik, totalHargaListrik);
    }
 }