# Latihan UML Model Java

Berikut adalah contoh model Laravel:

 ```java
 public class Mahasiswa {
    // Properti (Atribut)
    private String nama;
    private String nim;
    private double ipk;

    // Constructor untuk menginisialisasi objek Mahasiswa
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter dan Setter untuk properti Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk properti NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk properti IPK
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        // Validasi sederhana agar IPK tetap berada di rentang 0.0 - 4.0
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid! Harus di antara 0.0 sampai 4.0");
        }
    }

    // Method tambahan untuk menampilkan informasi mahasiswa
    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("--------------------");
    }
}
 ```

**🙋‍♂️ Soal:**

Berdasarkan model di atas, buat Class Diagram-nya