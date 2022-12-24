import java.util.Scanner;

public class TV extends Toko{
    Scanner input = new Scanner(System.in);
    String jenis;
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
    //menerapkan method setJenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    //menerapkan method getJenis
    public String getJenis(){
        return jenis;
    }

    @Override
    void Pilihan() {
        System.out.println("\n----------Pembelian TV-------------------");
        System.out.println("-------------------------------------");
        System.out.println("TV yang tersedia di entry(Jenis) : ");
        System.out.println("1.LG       (LED TV)  Rp.5000");
        System.out.println("2.Samsung  (LCD TV)  Rp.6000");
        System.out.println("3.Mi      (SmartTV)  Rp.7000");
    }

    @Override
    void PilihMenu() {
        TV tv = new TV();
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        System.out.println("jumlah barang : ");
        int jumlah = input.nextInt();
        switch (pilih){
            case 1:
                System.out.println("------------------------------------------");
                System.out.println("anda memilih pilihan 1");
                tv.setMerk("LG");
                System.out.println("Merk yg anda pilih " + tv.getMerk());
                tv.setJenis("LED TV");
                System.out.println("jenis tv : " + tv.getJenis());
                tv.setHarga(jumlah * 5000);
                System.out.println("Total harga : " + tv.getHarga());
                total1 = tv.getHarga();
                break;
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("anda memilih pilihan 1");
                tv.setMerk("Samsung");
                System.out.println("Merk yg anda pilih " + tv.getMerk());
                tv.setJenis("LED TV");
                System.out.println("jenis tv : " + tv.getJenis());
                tv.setHarga(jumlah * 6000);
                System.out.println("Total harga : " + tv.getHarga());
                total2 = tv.getHarga();
                break;
            case 3:
                System.out.println("------------------------------------------");
                System.out.println("anda memilih pilihan 1");
                tv.setMerk("Mi");
                System.out.println("Merk yg anda pilih " + tv.getMerk());
                tv.setJenis("SMART TV");
                System.out.println("jenis tv : " + tv.getJenis());
                tv.setHarga(jumlah * 7000);
                System.out.println("Total harga : " + tv.getHarga());
                total1 = tv.getHarga();
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
