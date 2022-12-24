import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Customer{

    protected final void isiFormulir(){
        //TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        //penampung
        String nama = "";
        String noHP = "";
        String alamat = "";

        //minta inputan
        System.out.println("masukan nama anda  : ");
        nama = in.nextLine();
        System.out.println("masukan alamat anda : ");
        alamat = in.nextLine();
        System.out.println("masukan noHP anda  : ");
        noHP = in.nextLine();
        System.out.print("MASUKKAN ANTRIAN CUSTOMER : ");
        int antriCust = in.nextInt();
        Transaksi kode = new Transaksi(antriCust);
        System.out.println("KODE TRANSAKSI : " + kode.getKodeTransaksi());

        try {
            File data = new File("cst.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data, false ));
            pr.println("------data costumer---------");
            pr.println("nama   : " + nama);
            pr.println("alamat : " + alamat);
            pr.println("noHP   : " + noHP);
            pr.println("KODE TRANSAKSI : " + kode.getKodeTransaksi());
            pr.close();
            System.out.println("saved to cst.txt");
        }catch (Exception e)
        {
            System.out.println("tidak dapat dicetak");
        }

    }

}
