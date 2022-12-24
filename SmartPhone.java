import java.util.Scanner;

public class SmartPhone extends Toko{
    Scanner input = new Scanner(System.in);
    float total1, total2, total3, totalHarga;
    int jmlKamera;

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
    //menerapkan method setjmlKamera
    public void setjmlKamera(int jmlKamera){
        this.jmlKamera = jmlKamera;
    }
    //menerapkan method getjmlKamera
    public int getjmlKamera(){
        return jmlKamera;
    }
    @Override
    void Pilihan() {
        System.out.println("\n----------Pembelian SmartPhone-----------");
        System.out.println("-------------------------------------");
        System.out.println("Smartphone yang tersedia di entry : ");
        System.out.println("1.aipong    QuadCamera(4) Rp.15000");
        System.out.println("2.Oppo TripleCamera(3) Rp.20000");
        System.out.println("3.Samsung TripleCamera(3) Rp.18000");
    }
    @Override
    void PilihMenu() {
        SmartPhone hp = new SmartPhone();
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        System.out.println("jumlah barang : ");
        int jumlah = input.nextInt();
        switch (pilih){
            case 1:
                System.out.println("\n----------Pembelian SmartPhone-----------");
                System.out.println("-------------------------------------");
                System.out.println("anda memilih pilihan 1");
                hp.setMerk("aipong");
                System.out.println("merk : " + hp.getMerk());
                hp.setjmlKamera(4);
                System.out.println("quad camera " + hp.getjmlKamera());
                hp.setHarga(jumlah * 15000);
                System.out.println("Total harga : " + hp.getHarga());
                total1 = hp.getHarga();
                break;
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("anda memilih pilihan 2");
                hp.setMerk("oppo");
                System.out.println("merk : " + hp.getMerk());
                hp.setjmlKamera(3);
                System.out.println("triple camera  " + hp.getjmlKamera());
                hp.setHarga(jumlah * 20000);
                System.out.println("Total harga : " + hp.getHarga());
                total2 = hp.getHarga();
                break;
            case 3:
                System.out.println("------------------------------------------");
                System.out.println("anda memilih pilihan 3");
                hp.setMerk("Samsung");
                System.out.println("merk : " + hp.getMerk());
                hp.setjmlKamera(3);
                System.out.println("triple camera " + hp.getjmlKamera());
                hp.setHarga(jumlah * 18000);
                System.out.println("Total harga : " + hp.getHarga());
                total3 = hp.getHarga();
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