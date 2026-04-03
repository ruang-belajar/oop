# Encapsulation (Enkapsulasi)

## 1. Pengertian Encapsulation

**Encapsulation (Enkapsulasi)** adalah konsep dalam **Pemrograman Berorientasi Objek (OOP)** yang digunakan untuk **membungkus data (atribut) dan metode (fungsi)** yang berhubungan ke dalam satu unit yang disebut **class**, serta **membatasi akses langsung terhadap data tersebut**.

Dengan kata lain, encapsulation bertujuan untuk:
- Melindungi data
- Mengontrol akses terhadap data
- Menyembunyikan detail implementasi

Secara sederhana:

> Encapsulation = **Data Hiding + Controlled Access**

---

## 2. Tujuan Encapsulation

Encapsulation memiliki beberapa tujuan utama melindungi mata dengan cara memberikan kontrol akses.

Keamanan yang dimaksud bukanlan keamanan dari hacker, tapi lebih kepada membatas akses programmer supaya tidak melakukan perubahan para program diluar dari desain program.

Jika atribut suatu objek dapat diubah secara bebas oleh bagian program lain, maka beberapa masalah dapat muncul:
#### 1️⃣ Data Tidak Konsisten
Nilai atribut dapat diubah menjadi nilai yang tidak logis, contoh:
```java
mahasiswa.umur = -5;  
rekening.saldo = -100000;
```

Nilai tersebut **tidak valid secara logika**, tetapi tetap dapat terjadi jika data tidak dilindungi.

#### 2️⃣ Program Sulit Dikontrol
Jika banyak bagian program dapat mengubah data secara langsung, maka:
- sulit melacak perubahan data
- sulit melakukan debugging
- sulit memastikan integritas data

#### 3️⃣ Potensi Error Lebih Besar
Kesalahan kecil pada satu modul dapat mempengaruhi modul lain karena data yang sama dapat diakses langsung oleh banyak bagian program.

---

## 3. Ilustrasi Konsep Encapsulation

Contoh analogi dalam kehidupan nyata:

**ATM Bank**

Nasabah tidak dapat langsung mengakses sistem internal bank.  
Nasabah hanya dapat berinteraksi melalui fitur yang disediakan seperti:
- tarik tunai
- cek saldo
- transfer

Struktur internal sistem bank **disembunyikan**.

Diagram sederhana:

```
User
  |
  v
+-------------------+
|       ATM         |
|-------------------|
| cekSaldo()        |
| tarikTunai()      |
| transfer()        |
+-------------------+
        |
        v
   Data Rekening
```

User hanya berinteraksi melalui **method**, bukan langsung ke **data**.

---

## 4. Access Modifier dalam Encapsulation

Encapsulation biasanya menggunakan **access modifier** untuk mengatur hak akses atribut.

|Modifier|Akses|
|---|---|
|public|dapat diakses dari mana saja|
|private|hanya dapat diakses dalam class itu sendiri|
|protected|dapat diakses dalam class dan subclass|
|default (package)|hanya dalam package yang sama|

Prinsip umum encapsulation:

> **Atribut dibuat private, akses melalui method**

---

## 5. Getter dan Setter

Dalam encapsulation dikenal metode:

### Getter

Digunakan untuk **mengambil nilai atribut**

Contoh:

```java
public String getNama(){
    return nama;
}
```

### Setter

Digunakan untuk **mengubah nilai atribut**

Contoh:

```java
public void setNama(String nama){
    this.nama = nama;
}
```

---

## 6. Contoh Encapsulation

### Tanpa Encapsulation

```java
class Mahasiswa {
    public String nama;
    public int umur;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.nama = "Andi";
        m.umur = -10; // data tidak valid
    }
}
```

Masalah:
- Data dapat diubah bebas
- Tidak ada validasi

---

### Dengan Encapsulation

```java
class Mahasiswa {

    private String nama;
    private int umur;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setUmur(int umur){
        if(umur > 0){
            this.umur = umur;
        }
    }

    public int getUmur(){
        return umur;
    }
}
```

Penggunaan:

```java
public class Main {
    public static void main(String[] args) {

        Mahasiswa m = new Mahasiswa();

        m.setNama("Andi");
        m.setUmur(20);

        System.out.println(m.getNama());
        System.out.println(m.getUmur());
    }
}
```


### Contoh class `Orang`

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
    
    // perubahan jenis kelamin tidak bisa langsung, harus lewat fungsi ini
    // karena perubahan jenis kelamin harus merubah juga titel
    public void setJenisKelamin(String jenisKelamin) {
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
        
        // contoh salah:
        // baris program dibawah ini akan error jika dieksekusi
        //orang2.jenisKelamin = "P";
        //System.out.println(orang2.jenisKelamin);
        
  }
}
```
[source code @ leetcode](https://leetcode.com/playground/o4fyisto) 

Perhatikan kelas di atas, telah mengisolasi data yang ada di property `jenisKelamin` dan `titel` dengan memberikannya modifier `private`. Dengan demikian, mengubah properti ini di luar class akan menyebabkan error. Sebagai contoh, Anda bisa _uncomment_ perintah `orang2.jenisKelamin = "P"` atau perintah `System.out.println(orang2.jenisKelamin)`, kemudian eksekusi programnya. Java akan mengeluarkan _runtime error_.

Untuk mengubah atau membaca properti dengan modifier `private` maka kita menggunakan fungsi _getter_ (`getJenisKelamin()`) dan _setter_ (`setJenisKelamin()`).

---

# 7. Keuntungan Encapsulation

1. **Data lebih aman**
2. **Mengurangi kesalahan program**
3. **Memudahkan debugging**
4. **Memungkinkan validasi data**
5. **Mempermudah pengembangan program besar**
    

---

# 8. Hubungan Encapsulation dengan Konsep OOP Lain

|Konsep OOP|Peran|
|---|---|
|Encapsulation|menyembunyikan dan melindungi data|
|Inheritance|pewarisan atribut dan metode|
|Polymorphism|kemampuan metode memiliki banyak bentuk|
|Abstraction|menyederhanakan kompleksitas sistem|

Encapsulation sering menjadi **fondasi awal** sebelum konsep lain digunakan.

---

# 9. Best Practice Encapsulation

Beberapa praktik yang umum digunakan:
1. **Gunakan atribut private**
2. **Sediakan getter dan setter seperlunya**
3. **Tambahkan validasi di setter**
4. **Jangan membuka akses yang tidak diperlukan**

Contoh:

```
private double saldo;
```

Akses melalui:

```
getSaldo()
setSaldo()
```

---

# 10. Kesimpulan

Encapsulation adalah konsep penting dalam OOP yang bertujuan untuk:

- Membungkus **data dan metode dalam class**
    
- Menyembunyikan **detail implementasi**
    
- Mengontrol **akses terhadap data**
    

Dengan encapsulation, program menjadi:

- lebih **aman**
    
- lebih **terstruktur**
    
- lebih **mudah dikembangkan**
    

---

## Latihan

1. Buatlah class **RekeningBank** dengan atribut:
    - `nomorRekening`
    - `namaPemilik`
    - `saldo`
        
2. Terapkan **encapsulation** dengan aturan:
    - semua atribut **private**
    - buat **getter dan setter**
    - saldo tidak boleh bernilai negatif
        
3. Buat program untuk:
    - menambah `saldo`
    - menampilkan `saldo`
        
