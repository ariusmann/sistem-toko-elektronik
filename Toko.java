public abstract class Toko {

    //mendefinisikan variabel
    int harga;
    String merk;


    abstract void Pilihan();
    abstract void PilihMenu();
    abstract void TotalBrg();
    abstract void Pembayaran();


    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
}
