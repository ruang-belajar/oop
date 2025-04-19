# Latihan 9

**Contoh program #1**

```java
class Orang {
    public String namaDepan;
    public String namaBelakang;
    private String jenisKelamin; 
    private String titel; 

    public Orang(String namaDepan, String namaBelakang, String jenisKelamin) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.setJenisKelamin(jenisKelamin);
    }
    
    public String namaLengkap() {
        return this.namaDepan+" "+this.namaBelakang;
    }
    
    private void setJenisKelamin(String jenisKelamin) {
        if(jenisKelamin.equals("L")) {
            this.titel = "Bapak";
        } 
        if(jenisKelamin.equals("P")) {
            this.titel = "Ibu";
        }
    }
    
    // fungsi untuk membaca jenis kelamin
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    // fungsi untuk membaca titel
    public String getTitel() {
        return this.titel;
    }

}

public class Main {
    public static void main(String[] args) {
        Orang orang1 = new Orang("Budi", "Rahman", "L");
        System.out.println(orang1.panggilan());
        System.out.println(orang1.panggilan(20));

        Orang orang2 = new Orang("Dyah", "Ayu", "P");
        System.out.println(orang2.panggilan(40));
               
    }
}
```

## Latihan
### Soal 1
Berdasarkan **contoh program #1**, buat class turunan `OrangSunda` dengan ketentuan sebagai berikut:
- Memiliki method `panggilan()` yang memunculkan nama panggilan _Mas/Mba_ sesuai dengan jenis kelamin, diikuti dengan nama depan. Misal: _Budi Rahajo_ ➡ _Mas Budi_
- Memiliki method `panggilan(umur)` yang memunculkan nama panggilan _Mas/Mba_ sesuai dengan jenis kemian, jika umur < 30 tahun maka akan ditambahkan 3 huruf pertama sebagai nama panggilan. Misal: _Budi Rahajo_ ➡ _Mas Bud_; _Ratnasari_ ➡ _Mba Rat_.
- Rubah program utama untuk bisa menampilkan contoh penggunaan fungsi `panggilan` yang barusan dibuat.

### Soal 2
Berdasarkan program **Soal 1**, buat _class diagram_ dari class tersebut