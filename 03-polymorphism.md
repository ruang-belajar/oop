
# Polymorphism

## 1. Pengertian Polymorphism

**Polymorphism** berasal dari bahasa Yunani:

- **Poly** = banyak
    
- **Morphe** = bentuk
    

Dalam **Object Oriented Programming (OOP)**, **polymorphism** adalah kemampuan suatu **method atau objek untuk memiliki banyak bentuk atau perilaku yang berbeda** tergantung pada konteks pemanggilannya.

Secara sederhana:

> **Polymorphism memungkinkan satu interface digunakan untuk berbagai implementasi.**

Contoh sederhana dalam kehidupan sehari-hari:

Objek **"kendaraan"** memiliki perilaku **bergerak**, tetapi cara bergeraknya berbeda.

|Objek|Cara Bergerak|
|---|---|
|Mobil|Menggunakan roda|
|Pesawat|Terbang|
|Kapal|Berlayar|

Meskipun sama-sama menggunakan fungsi **bergerak()**, implementasinya berbeda.

---

## 2. Tujuan Polymorphism

Polymorphism digunakan untuk:

1. **Meningkatkan fleksibilitas program**
    
2. **Mengurangi kompleksitas kode**
    
3. **Mempermudah pengembangan dan pemeliharaan software**
    
4. **Mendukung prinsip OOP seperti inheritance dan abstraction**
    

Dengan polymorphism, kita dapat menulis kode yang **lebih umum dan reusable**.

---

## 3. Jenis Polymorphism

Secara umum polymorphism dibagi menjadi dua jenis utama:

### 1. Compile Time Polymorphism

(disebut juga **Static Polymorphism**)

Polymorphism yang terjadi **saat proses kompilasi**.

Biasanya menggunakan:

- **Method Overloading**
    
- **Operator Overloading**
    

#### Method Overloading

Method memiliki **nama yang sama tetapi parameter berbeda**.

Contoh (Java):

```java
class Kalkulator {

    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}
```

Pemanggilan:

```java
Kalkulator k = new Kalkulator();

k.tambah(2,3);
k.tambah(2,3,4);
k.tambah(2.5,3.5);
```

Walaupun methodnya sama (**tambah**), bentuknya berbeda.

---

### 2. Runtime Polymorphism

(disebut juga **Dynamic Polymorphism**)

Polymorphism yang terjadi **saat program dijalankan**.

Biasanya menggunakan:

- **Method Overriding**
    
- **Inheritance**
    

Subclass **mengganti implementasi method dari superclass**.

---

## 4. Method Overriding

**Method overriding** terjadi ketika **subclass mendefinisikan ulang method dari superclass** dengan nama yang sama.

Contoh (Java):

### Superclass

```java
class Hewan {

    void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }

}
```

### Subclass

```java
class Kucing extends Hewan {

    void suara() {
        System.out.println("Kucing mengeong");
    }

}
```

```java
class Anjing extends Hewan {

    void suara() {
        System.out.println("Anjing menggonggong");
    }

}
```

### Program Utama

```java
public class Main {

    public static void main(String[] args) {

        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }

}
```

Output:

```
Kucing mengeong
Anjing menggonggong
```

Walaupun tipe variabelnya **Hewan**, perilaku methodnya berbeda.

Inilah **runtime polymorphism**.

---

## 5. Diagram Konsep Polymorphism

Struktur hubungan class:

```
        Hewan
          |
   ----------------
   |              |
 Kucing         Anjing
   |              |
suara()        suara()
```

Method **suara()** memiliki banyak bentuk implementasi.

---

## 6. Keuntungan Polymorphism

Beberapa keuntungan polymorphism dalam pengembangan perangkat lunak:

### 1. Kode Lebih Fleksibel

Program dapat menggunakan **satu interface untuk berbagai objek**.

### 2. Reusability Tinggi

Method yang sama dapat digunakan oleh berbagai class.

### 3. Mudah Dikembangkan

Jika ada class baru, tidak perlu mengubah kode lama.

Contoh:

Tambahkan class baru:

```
class Burung extends Hewan
```

Tanpa mengubah program utama.

### 4. Mengurangi Duplikasi Kode

Program lebih **ringkas dan modular**.

---

## 7. Contoh Kasus Polymorphism

Misalkan kita membuat sistem **perhitungan luas bangun datar**.

Superclass:

```
BangunDatar
```

Subclass:

```
Persegi
Lingkaran
Segitiga
```

Method:

```
hitungLuas()
```

Setiap subclass memiliki rumus yang berbeda.

|Class|Rumus|
|---|---|
|Persegi|sisi × sisi|
|Lingkaran|π × r²|
|Segitiga|½ × alas × tinggi|

Namun semuanya menggunakan method yang sama: **hitungLuas()**.

---

## 8. Perbandingan Overloading vs Overriding

|Aspek|Overloading|Overriding|
|---|---|---|
|Waktu|Compile Time|Runtime|
|Class|Dalam class yang sama|Parent dan child class|
|Nama Method|Sama|Sama|
|Parameter|Berbeda|Sama|
|Konsep|Static Polymorphism|Dynamic Polymorphism|

---

## 9. Perbandingan dengan Overriding dalam Konteks Inheritance

_Overriding_ muncul pada pembahasan _inheritance_ dan _polymorphism_ karena ia menjadi **jembatan antara inheritance dan polymorphism**.

Dengan kata lain:
- **Overriding adalah mekanisme**
- **Inheritance adalah struktur pewarisan**
- **Polymorphism adalah perilaku dinamis yang memanfaatkan overriding**

### 9.1. Overriding dalam Konteks Inheritance

Pada **inheritance**, overriding dijelaskan sebagai:

> **Subclass mengganti implementasi method dari superclass.**

Fokusnya adalah pada **hubungan pewarisan antar class**.

Contoh:

```java
class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeong");
    }
}
```

Penjelasan pada inheritance:
- `Kucing` **mewarisi** method `suara()`
- kemudian **mengganti implementasinya**

Fokus pembahasannya adalah **pewarisan dan perubahan method**.

---

### 9.2. Overriding dalam Konteks Polymorphism

Pada **polymorphism**, overriding dijelaskan sebagai:

> **Objek yang berbeda dapat memberikan perilaku berbeda terhadap method yang sama.**

Fokusnya adalah **perilaku dinamis saat runtime**.

Contoh:

```java
Hewan h;

h = new Kucing();
h.suara();

h = new Anjing();
h.suara();
```

Output:

```
Kucing mengeong
Anjing menggonggong
```

Penjelasan pada polymorphism:
- variabel `h` bertipe **Hewan**
- tetapi objek sebenarnya bisa **Kucing atau Anjing**
- method yang dipanggil ditentukan **saat runtime**

Ini disebut **runtime polymorphism** atau **dynamic binding**.

### 9.3. Perbedaan Fokus Penjelasan

|Aspek|Inheritance|Polymorphism|
|---|---|---|
|Fokus|Struktur pewarisan class|Perilaku objek|
|Tujuan|Mengubah atau memperluas method parent|Menghasilkan perilaku berbeda|
|Waktu pembahasan|Saat membahas hubungan class|Saat membahas dynamic behavior|
|Mekanisme|Method overriding|Method overriding|

Jadi:

```
Inheritance → memungkinkan overriding
Polymorphism → memanfaatkan overriding
```

---

# 4. Analogi Sederhana

Misalkan ada class **Hewan** dengan method `suara()`.

Subclass:

```
Kucing → mengeong
Anjing → menggonggong
Sapi   → moo
```

**Inheritance perspective**

> Subclass mengganti implementasi method `suara()`.

**Polymorphism perspective**

> Method `suara()` menghasilkan perilaku berbeda tergantung objeknya.


Penjelasan **overriding pada inheritance dan polymorphism menggunakan mekanisme yang sama**, tetapi **tujuan penjelasannya berbeda**:
- Pada **inheritance** → menekankan **bagaimana subclass mengganti method parent**
- Pada **polymorphism** → menekankan **bagaimana method yang sama menghasilkan perilaku berbeda**

Sehingga secara konsep:

```
Inheritance + Overriding → memungkinkan Polymorphism
```
