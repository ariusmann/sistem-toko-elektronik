import java.util.Scanner;

public class KipasAngin extends Toko{
    Scanner input = new Scanner(System.in);
    int ukuran;
    float total1, total2, total3, totalHarga;

    //menerapkan method setHarga
    public void setHarga(int harga){
        super.harga = harga;
    }
    //menerapkan method getHarga
    public int getHarga(){
        return harga;
    }
    //menerapkan method setMerk
    public void setMerk(String merk){
        super.merk = merk;
    }
    //menerapkan method getMerk
    public String getMerk(){
        return merk;
    }
    public void setUkuran(int ukuran){
        this.ukuran = ukuran;
    }

    public int getUkuran(){
        return ukuran;
    }




    @Override
    void Pilihan() {
        System.out.println("\n----------Pembelian Kipas Angin----------");
        System.out.println("----------------------------------------");
        System.out.println("Kipas Angin yang tersedia di entry : ");
        System.out.println("1.Kosmos     5inc  Rp.8000");
        System.out.println("2.Samsung    6inc  Rp.9000");
        System.out.println("3.Maspion    7inc  Rp.10000");
    }

    @Override
    void PilihMenu() {
        KipasAngin ka = new KipasAngin();
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        System.out.println("jumlah barang : ");
        int jumlah = input.nextInt();
        switch (pilih){
            case 1:
                System.out.println("------------------------------------------");
                System.out.println("Anda memilih pilihan 1");
                ka.setMerk("kosmos");
                System.out.println("Merk yang anda pilih : " + ka.getMerk());
                ka.setUkuran(5);
                System.out.println("ukuran : " + ka.getUkuran());
                ka.setHarga(jumlah * 8000);
                System.out.println("Total harga : " + ka.getHarga());
                total1 = ka.getHarga();

                break;
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("Anda memilih pilihan 2");
                ka.setMerk("Samsung");
                System.out.println("Merk yang anda pilih : " + ka.getMerk());
                ka.setUkuran(6);
                System.out.println("ukuran : " + ka.getUkuran());
                ka.setHarga(jumlah * 9000);
                System.out.println("Total harga : " + ka.getHarga());
                total2 = ka.getHarga();
                break;
            case 3:
                System.out.println("------------------------------------------");
                System.out.println("anda memilih pilihan 3");
                ka.setMerk("Maspion");
                System.out.println("Merk yang anda pilih : " + ka.getMerk());
                ka.setUkuran(7);
                System.out.println("ukuran : " + ka.getUkuran());
                ka.setHarga(jumlah * 10000);
                System.out.println("Total harga : " + ka.getHarga());
                total3 = ka.getHarga();
                break;

        }
    }
    void TotalBrg() {
        totalHarga = total1 + total2 + total3 ;
        System.out.println("TOTAL SELURUH HARGA : Rp" + totalHarga);
    }

    void Pembayaran() {
        System.out.println("------------------------------------------");
        System.out.print("TUNAI PEMBELI : Rp");
        float tunai = input.nextFloat();
        float kembali = tunai - totalHarga;
        if (kembali > totalHarga) {
            System.out.println("KEMBALI       : Rp" + kembali);
            System.out.println("-----TERIMAKASIH-----");
        } else if (kembali == 0) {
            System.out.println("KEMBALI       : TUNAI PAS");
            System.out.println("-----TERIMAKASIH-----");
        } else {
            System.out.println("KEMBALI       : " + kembali);
            System.out.println("--TERIMAKASIH--");
        }
    }
}