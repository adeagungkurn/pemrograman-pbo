
//Contoh Penggunaan Method Accessor & Mutator
public class Mahasiswa {
    private String nama;
    private int umur;

    // Accessor (Getter) untuk mengambil nilai atribut 'name'
    public String getName() {
        return nama;
    }

    // Mutator (Setter) untuk mengubah nilai atribut 'name'
    public void setName(String newName) {
        nama = newName;
    }

    // Accessor (Getter) untuk mengambil nilai atribut 'age'
    public int getAge() {
        return umur;
    }

    // Mutator (Setter) untuk mengubah nilai atribut 'age'
    public void setAge(int newAge) {
        if (newAge >= 20) {
            umur = newAge;
        } else {
            System.out.println("Usia tidak valid. Harap masukkan nilai usia yang benar.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // Mengatur nilai atribut menggunakan mutator
        mahasiswa1.setName("Ade Agung Kurniawan, Get & Set Berhasil Dijalankan");
        mahasiswa1.setAge(200);//Dapat mengubah nilai setter usia

        // Mengambil nilai atribut menggunakan accessor
        System.out.println("Nama: " + mahasiswa1.getName());
        System.out.println("Usia: " + mahasiswa1.getAge() + " tahun");
    }
}