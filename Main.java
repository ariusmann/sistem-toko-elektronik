import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer cstm = new Customer();
        cstm.isiFormulir();

        System.out.println("=========================================");
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Jenis elektronik :");
        System.out.println("1. smartphone");
        System.out.println("2. Kipas Angin");
        System.out.println("3. Tv");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1 :
                Toko Smartphone = new SmartPhone();
                Smartphone.Pilihan();
                for (String b = "y"; b.equals("y") || b.equals("Y");) {
                    Smartphone.PilihMenu();
                    System.out.print("APA ANDA INGIN MENAMBAH BARANG? (Y/T): ");
                    b = input.next();
                    System.out.println("------------------------------------------");
                }
                Smartphone.TotalBrg();
                Smartphone.Pembayaran();
                break;
            case 2:
                Toko KipasAngin = new KipasAngin();
                KipasAngin.Pilihan();
                for (String b = "y"; b.equals("y") || b.equals("Y");) {
                    KipasAngin.PilihMenu();
                    System.out.print("APA ANDA INGIN MENAMBAH BARANG? (Y/T): ");
                    b = input.next();
                    System.out.println("------------------------------------------");
                }
                KipasAngin.TotalBrg();
                KipasAngin.Pembayaran();
                break;
            case 3:
                Toko TV = new TV();
                TV.Pilihan();
                for (String b = "y"; b.equals("y") || b.equals("Y");) {
                    TV.PilihMenu();
                    System.out.print("APA ANDA INGIN MENAMBAH BARANG? (Y/T): ");
                    b = input.next();
                    System.out.println("------------------------------------------");
                }
                TV.TotalBrg();
                TV.Pembayaran();
                break;
            default:
                System.out.println("MASUKIN ANGKA YANG BENER TOD");
                break;
        }

    }
}