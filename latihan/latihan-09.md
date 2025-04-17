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
        System.out.println(orang1.getTitel()+" "+orang1.namaLengkap());

        Orang orang2 = new Orang("Dyah", "Ayu", "P");
        System.out.println(orang2.getTitel()+" "+orang2.namaLengkap());
        orang2.namaDepan = "Nurani"; // contoh merubah nama secara langsung
        System.out.println(orang2.getTitel()+" "+orang2.namaLengkap());
               
    }
}
```

## Latihan
### Soal 1
Berdasarkan **contoh program #1**, buat class turunan 