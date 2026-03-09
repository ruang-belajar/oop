
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

Sistem perangkat lunak seringkali sangat kompleks. Abstraction membantu programmer bekerja dengan **model yang lebih sederhana**.

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

#### Contoh (Java)

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

---

#### Abstract Method

**Abstract Method** adalah method yang **tidak memiliki implementasi** pada kelas induk.

Contoh:

```java
abstract void makeSound();
```

Implementasi method tersebut **harus dibuat pada subclass**.

---

### 4.2. Interface

**Interface** adalah struktur yang mendefinisikan **sekumpulan method yang harus diimplementasikan oleh class yang menggunakannya**.

Interface hanya mendefinisikan **perilaku (behavior)** tanpa implementasi.

---

#### Contoh Interface (Java)

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

## 6. Hubungan Abstraction dengan Encapsulation

Baik *encapsulation* maupun *abstraction* sama-sama *menyembunyikan sesuatu*. Secara spesifik, berikut perbedaan antara *abstraction* dengan *encapsulation*.

|Aspek|Encapsulation|Abstraction|
|---|---|---|
|**Pengertian**|Teknik untuk **membungkus data dan method dalam satu class serta membatasi akses terhadap data tersebut**|Konsep untuk **menyembunyikan kompleksitas implementasi dan hanya menampilkan fungsi penting kepada pengguna**|
|**Fokus utama**|**Perlindungan data (data hiding)**|**Penyederhanaan kompleksitas sistem**|
|**Apa yang disembunyikan**|**Data internal (atribut/variabel)**|**Detail implementasi atau cara kerja sistem**|
|**Tujuan**|Mengontrol akses terhadap data agar tidak dimodifikasi sembarangan|Menyederhanakan penggunaan sistem dengan menampilkan fungsi penting saja|
|**Cara implementasi**|Menggunakan **access modifier** seperti `private`, `protected`, `public`|Menggunakan **abstract class** dan **interface**|
|**Komponen utama**|Field (atribut) + method pengakses (getter/setter)|Method abstrak yang harus diimplementasikan oleh subclass|
|**Tingkat penerapan**|Level **class dan atribut**|Level **desain sistem dan struktur class**|
|**Contoh dalam kode**|Variabel dibuat `private` dan diakses melalui `getter/setter`|Mendefinisikan method tanpa implementasi pada `abstract class` atau `interface`|
|**Analogi kehidupan nyata**|**Kapsul obat**: isi di dalam kapsul tidak terlihat langsung|**ATM**: pengguna hanya melihat menu tanpa mengetahui proses internal|
|**Hubungan dengan konsep OOP lain**|Mendukung **data security** dalam objek|Mendukung **polymorphism dan inheritance**|

### Contoh Singkat dalam Kode

**Encapsulation**

```java
class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
```

Di sini:
- `balance` **disembunyikan**
- hanya bisa diakses melalui method.

---

**Abstraction**

```java
abstract class Vehicle {

    abstract void start();

}
```

Subclass:

```java
class Car extends Vehicle {

    void start() {
        System.out.println("Car engine started");
    }

}
```

Di sini:
- class hanya mendefinisikan **apa yang harus dilakukan**
- implementasi diberikan oleh subclass.

---

## 7. Contoh Studi Kasus Encapsulation

### Sistem Pembayaran

Abstraction dapat digunakan untuk berbagai metode pembayaran.

Abstract class:

```java
abstract class Payment {

    abstract void pay(double amount);

}
```

Subclass:

```java
class CreditCardPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid using credit card: " + amount);
    }

}

class EWalletPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid using e-wallet: " + amount);
    }

}
```


