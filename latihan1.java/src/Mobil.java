
class Mobil {
    
    String merek; 
    String warna;
    int tahunProduksi;

    // Kita gunakan method
    void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public static void main(String[] args) {
        // Kita buat objeknya
        Mobil mobilPertama = new Mobil();

        mobilPertama.merek = "Toyota";
        mobilPertama.warna = "Hitam";
        mobilPertama.tahunProduksi = 2020;

        System.out.println("Informasi Mobil Pertama:");
        mobilPertama.tampilkanInfo();

        // Kita tambah objek lain dari class "Mobil"
        Mobil mobilKedua = new Mobil();
       
        mobilKedua.merek = "Honda";
        mobilKedua.warna = "Putih";
        mobilKedua.tahunProduksi = 2019;

        System.out.println("\nInformasi Mobil Kedua:");
        mobilKedua.tampilkanInfo();
    }
}













/* 
class Mobil {
    String warna = "Hitam";
    String merk = "Toyota SUV";
    
    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }
 
    public static void main(String[] args) {
        // Membuat object mobilSaya
        Mobil mobilSUV = new Mobil();
        
        // Memanggil object
        mobilSUV.maju();
        mobilSUV.mundur();
    }
}
*/




 






















