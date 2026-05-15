
# Abstraction

## 1. Pengertian Abstraction

**Abstraction (abstraksi)** adalah konsep dalam OOP yang bertujuan untuk **menyederhanakan kompleksitas sistem dengan hanya menampilkan informasi yang penting kepada pengguna dan menyembunyikan detail implementasi**.

Dengan abstraksi, pengguna atau programmer hanya perlu mengetahui **apa yang dilakukan sebuah objek**, tanpa perlu mengetahui **bagaimana proses internalnya dilakukan**.

Secara sederhana:

> **Abstraction = Menampilkan fungsi penting, menyembunyikan detail implementasi.**

---

## 2. Tujuan Abstraction

Beberapa tujuan utama dari abstraksi dalam pemrograman berorientasi objek adalah:

### 1️⃣ Mengurangi Kompleksitas Sistem

Sistem perangkat lunak seringkali sangat kompleks. *Abstraction* membantu programmer bekerja dengan **model yang lebih sederhana**.

Contoh: \
Pengguna mobil hanya perlu tahu:
- cara menyalakan mesin
- menginjak pedal gas
- menginjak rem

Pengguna **tidak perlu memahami mekanisme pembakaran mesin secara detail**.

---

### 2️⃣ Memisahkan Interface dan Implementasi

Abstraction memisahkan:

|Komponen|Penjelasan|
|---|---|
|**Interface**|Apa yang dapat dilakukan objek|
|**Implementation**|Bagaimana objek melakukannya|

Dengan demikian perubahan pada implementasi **tidak selalu mempengaruhi kode pengguna**.

---

### 3️⃣ Meningkatkan Maintainability

Karena detail implementasi tersembunyi, maka perubahan internal:
- lebih mudah dilakukan
- tidak merusak sistem lain

---

### 4️⃣ Mendukung Desain Sistem yang Modular

Abstraction membantu membangun sistem yang:
- modular
- mudah dikembangkan
- mudah diuji

---

## 3. Contoh Konsep Abstraction dalam Kehidupan Sehari-hari

### Contoh 1: ATM

Ketika menggunakan ATM, pengguna hanya melihat menu seperti:
- Tarik Tunai
- Transfer
- Cek Saldo

Pengguna **tidak mengetahui proses internal seperti:**
- verifikasi database
- komunikasi jaringan bank
- enkripsi transaksi

Semua proses tersebut **diabstraksikan dari pengguna**.

---

### Contoh 2: Mobil

Pengemudi hanya menggunakan:
- setir
- pedal gas
- rem

Namun di dalam mobil terdapat sistem kompleks seperti:
- sistem injeksi bahan bakar
- transmisi
- kontrol mesin

Semua ini disembunyikan oleh abstraksi.

---

## 4. Abstraction dalam Pemrograman

Dalam OOP, abstraksi biasanya direalisasikan melalui:
1. **Abstract Class**
2. **Interface**

### 4.1. Abstract Class

**Abstract Class** adalah kelas yang **tidak dapat dibuat objeknya secara langsung** dan biasanya digunakan sebagai **kelas dasar (base class)**.

Abstract class dapat memiliki:
- method abstrak
- method biasa
- atribut

#### Karakteristik Abstract Class
- Tidak dapat diinstansiasi
- Digunakan sebagai kelas turunan
- Dapat memiliki method abstrak dan non-abstrak

---

#### Abstract Method

**Abstract Method** adalah method yang **tidak memiliki implementasi** pada kelas induk.

Contoh:

```java
abstract void makeSound();
```

Implementasi method tersebut **harus dibuat pada subclass**.

#### Contoh Penggunaan Abstract

```java
abstract class Animal {

    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
```

Class turunan:

```java
class Dog extends Animal {

	@Override
    void makeSound() {
        System.out.println("Dog barks");
    }

}
```

Penggunaan:

```java
Dog d = new Dog();
d.makeSound();
d.sleep();
```

> 💡 Penggunaan `@Override` pada implementasi _abstract method_ adalah tidak wajib tapi merupakan *best-practice*. Dengan menggunakan `@Override` maka compiler akan memberikan peringatan kesalahan jika terjadi _typo_ ketika implementasi _abstract method_.\
> Contoh: jika di class `Dog`, `makeSound()` ditulis jadi `makesound()`

---

### 4.2. Interface

**Interface** adalah struktur yang mendefinisikan **sekumpulan method yang harus diimplementasikan oleh class yang menggunakannya**.

Interface hanya mendefinisikan **perilaku (behavior)** tanpa implementasi.

#### Contoh Penggunaan Interface

```java
interface Vehicle {

    void start();

    void stop();

}
```

Class implementasi:

```java
class Car implements Vehicle {

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

}
```

---

## 5. Perbedaan Abstract Class dan Interface

|Aspek|Abstract Class|Interface|
|---|---|---|
|Tujuan|Basis class|Kontrak perilaku|
|Method|Bisa abstrak dan non-abstrak|Umumnya abstrak|
|Atribut|Bisa memiliki atribut|Biasanya konstanta|
|Multiple Inheritance|Tidak|Bisa|

---

## 6. Contoh Penggunaan Abstract & Interface

**AbstractOrang.java**
```java
abstract class AbstractOrang {
    private String namaDepan;
    private String namaBelakang;

    public AbstractOrang(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String namaLengkap() {
        return this.namaDepan + " " + this.namaBelakang;
    }

    public String getNamaDepan() {
        return this.namaDepan;
    }

    public String getNamaBelakang() {
        return this.namaBelakang;
    }

    abstract public String getNamaPanggilan();
}
```

**Penyanyi.java**
```java
interface Penyanyi {
    void bernyanyi();
}
```

**Penari.java**
```java
public interface Penari {
    void menari();
}
```

**OrangPadang.java**
```java
/* OrangPadang adalah turunan dari AbstractOrang, dengan mengimplementasikan interface Penyanyi dan Penari */
public class OrangPadang extends AbstractOrang implements Penyanyi,Penari{

    public OrangPadang(String namaDepan, String namaBelakang) {
        super(namaDepan, namaBelakang);
    }

	/* deklarasi method getNamaPanggilan yang diwajibkan AbstractOrang */
	@Override
    public String getNamaPanggilan() {
        return "Uda "+this.getNamaDepan();
    }

	/* implementasi method bernyayi dari interface Penyanyi */
    public void bernyanyi() {
        System.out.println("Nyanyi");
    }

	/* implementasi method menari dari interface Penari */
    public void menari() {
        System.out.println("Joget");
    }
    
}
```

**LatihanOrangPadang.java**
```java
public class LatihanOrangPadang {
    public static void main(String[] args) {
        OrangPadang orang1 = new OrangPadang("Budi", "Raharjo");
        
        /* OrangPadang bisa buat ke objek AbstractOrang karena OrangPadang adalah turunan dari AbstractOrang */
        AbstractOrang orang2 = new OrangPadang("Firzah", "Kirai");

        System.out.println(orang1.getNamaPanggilan());
        orang1.bernyanyi();

        System.out.println(orang2.getNamaBelakang());
        
        /* Karena orang2 dideklarasikan sebagai AbstractOrang (yang tidak mengenal method menari(), maka harus dilakukan 'type casting' ke OrangParang agar orang2 bisa mengenali method menari() ) */
        ((OrangPadang) orang2).menari();
    }
}
```