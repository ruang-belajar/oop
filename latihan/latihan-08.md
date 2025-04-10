# Latihan 8: Inheritance

Berdasarkan source code berikut, kerjakan **Soal Latihan**

```java
class Orang {
  public String namaDepan;
  public String namaBelakang;
  public String jenisKelamin;

  public Orang(String namaDepan, String namaBelakang, String jenisKelamin) {
      this.namaDepan = namaDepan;
      this.namaBelakang = namaBelakang;
      this.jenisKelamin = jenisKelamin;
  }
  
  public String namaLengkap() {
    return this.namaDepan+" "+this.namaBelakang;
  }

}

class OrangJawa extends Orang {
    public OrangJawa(String namaDepan, String namaBelakang, String jenisKelamin) {
        super(namaDepan, namaBelakang, jenisKelamin);
    }

    public String panggilan() {
        if(jenisKelamin.equals("L")) {
            return "Mas "+this.namaDepan;
        }
        if(jenisKelamin.equals("P")) {
            return "Mba "+this.namaDepan;
        }
        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        OrangJawa orang1 = new OrangJawa("Budi", "Rahman", "L");
        System.out.println(orang1.namaLengkap());
        System.out.println(orang1.panggilan());

        OrangJawa orang2 = new OrangJawa("Dyah", "Ayu", "P");
        System.out.println(orang2.namaLengkap());
        System.out.println(orang2.panggilan());
  }
}
```

## Soal Latihan
### Soal 1
file: **Inheritance1.java**
- Buat class _OrangBarat_ turunan dari _Orang_
- Memiliki fungsi `panggilan()` yang memunculkan nama panggilan menggunakan nama belakang, sesuai dengan jenis kelamin. Misal:
  - _Budi Raharjo_ ➡ _Mr. Raharjo_
  - _Laura Hermawan_ ➡ _Ms. Hermawan_
  
### Soal 2
file: **Inheritance2.java**
- Buat class _OrangIndonesia_ turunan dari _Orang_
- Memiliki status `menikah` _boolean_
- Memiliki fungsi `panggilan()` yang memunculkan nama panggilan sesuai status dan jenis kelamin: _Bapak_, _Ibu_, _Saudari_, _Saudara_. Misal:\
  - _Budi Raharjo_, menikah ➡ _Bapak Budi_
  - _Laura Hermawan_, belum menikah ➡ _Saudari Laura_

### Soal 3
file: **Inheritance3.java**
- Buat class _OrangIndonesia2_ turunan dari _Orang_
- Memiliki status `menikah` _boolean_
- Memiliki `umur` Integer
- Memiliki fungsi `panggilan()` yang memunculkan nama panggilan sesuai status dan jenis kelamin: _Bapak_, _Ibu_, _Saudari_, _Saudara_, Tambahkan penggilan _Oma_ dan _Opa_ jika ia seseorang berumur lebih dari 60 tahun.