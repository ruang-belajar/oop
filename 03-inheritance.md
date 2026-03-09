# Inheritance (Pewarisan)

## 1. Pengantar Inheritance

**Inheritance** adalah mekanisme dalam **Pemrograman Berorientasi Objek (OOP)** yang memungkinkan sebuah **class baru (subclass)** mewarisi **atribut dan metode** dari **class yang sudah ada (superclass)**.

Tujuan utama inheritance adalah:
- **Reusability** → menggunakan kembali kode yang sudah ada
- **Extensibility** → memperluas fungsi class tanpa mengubah class asli
- **Hierarki class** → membuat struktur yang lebih terorganisasi

### Ilustrasi Konsep

```
Class Induk (Superclass)
        |
        ↓
Class Turunan (Subclass)
```

Contoh konsep di dunia nyata:

```
Kendaraan
 ├── Mobil
 ├── Motor
 └── Sepeda
```

Semua turunan memiliki sifat dasar dari **Kendaraan**.

---

## 2. Terminologi dalam Inheritance

|Istilah|Penjelasan|
|---|---|
|**Superclass / Parent Class**|Class induk yang diwarisi|
|**Subclass / Child Class**|Class turunan yang mewarisi|
|**Inheritance**|Mekanisme pewarisan atribut dan metode|
|**Override**|Mengganti implementasi metode dari parent|
|**Extend**|Kata kunci untuk melakukan pewarisan|

---

## 3. Contoh Inheritance Sederhana

### Contoh 1

**Class Parent**

Contoh menggunakan **Java**

```java
class Kendaraan {

    String nama;

    void jalan() {
        System.out.println("Kendaraan sedang berjalan");
    }

}
```

**Class Child**

```java
class Mobil extends Kendaraan {

    void klakson() {
        System.out.println("Mobil berbunyi klakson");
    }

}
```

**Program Utama**

```java
public class Main {

    public static void main(String[] args) {

        Mobil m = new Mobil();

        m.nama = "Toyota";
        m.jalan();
        m.klakson();

    }

}
```

**Output:**

```
Kendaraan sedang berjalan
Mobil berbunyi klakson
```

Penjelasan:

Class **Mobil** otomatis mewarisi:
- atribut `nama`
- method `jalan()`

### Contoh 2

Simak contoh kode berikut:

```java
class Orang {
    public String namaDepan;
    public String namaBelakang;
    public String jenisKelamin;

    public String namaLengkap() {
        return this.namaDepan+" "+this.namaBelakang;
    }
}

class OrangJawa extends Orang {
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
        OrangJawa orang1 = new OrangJawa();
        orang1.namaDepan = "Budi";
        orang1.namaBelakang = "Arman";
        orang1.jenisKelamin = "L";
        System.out.println(orang1.namaLengkap());
        System.out.println(orang1.panggilan());

        OrangJawa orang2 = new OrangJawa();
        orang2.namaDepan = "Dyah";
        orang2.namaBelakang = "Ayu";
        orang2.jenisKelamin = "P";
        System.out.println(orang2.namaLengkap());
        System.out.println(orang2.panggilan());
    }
}
```
[try @ leetcode](https://leetcode.com/playground/kex3eLdR)


Jika program di atas dijalankan, makan akan memberikan output seperti berikut:
```
Budi Arman
Mas Budi
Dyah Ayu
Mba Dyah
```

Kata kunci `extends` menandakan bahwa class turunan `OrangJawa` adalah turunan dari class `Orang`. Dengan demikian, atribute dan method class `OrangJawa` yang diwariskan dari _parent_ classnya (class `Orang`) sehingga kita tidak perlu lagi mendeklarasikan kembali.


---

## 4. Hierarki Pewarisan

Inheritance membentuk **struktur hierarki class**.

Contoh:

```
        Kendaraan
           |
   -----------------
   |       |       |
 Mobil   Motor   Sepeda
```

Contoh implementasi:

```java
class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan berjalan");
    }
}

class Mobil extends Kendaraan {
}

class Motor extends Kendaraan {
}
```

---

## 5. Method Overriding

Subclass dapat **mengganti implementasi method dari parent class**.

### Contoh

```java
class Kendaraan {

    void suara() {
        System.out.println("Kendaraan mengeluarkan suara");
    }

}
```

Subclass:

```java
class Mobil extends Kendaraan {

    @Override
    void suara() {
        System.out.println("Mobil berbunyi klakson");
    }

}
```

Program utama:

```java
Mobil m = new Mobil();
m.suara();
```

Output:

```
Mobil berbunyi klakson
```

---

## 6. Inheritance Class dengan Constructor

### Penggunaan `super`

Keyword `super` digunakan untuk mengakses **method atau atribut milik parent class**.

Contoh:

```java
class Kendaraan {

    void jalan() {
        System.out.println("Kendaraan berjalan");
    }

}
```

Subclass:

```java
class Mobil extends Kendaraan {

    void jalan() {
        super.jalan();
        System.out.println("Mobil berjalan lebih cepat");
    }

}
```

Output:

```
Kendaraan berjalan
Mobil berjalan lebih cepat
```


### Contoh

Simak contoh program berikut:

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
[source code @ leetcode](https://leetcode.com/playground/DF63wuGb) untuk melihat bagaimana mengimplementasikan _inheritace_ pada class yang memiliki _constructor


---

## 7. Jenis-Jenis Inheritance

Secara konsep terdapat beberapa jenis inheritance:

### 1. Single Inheritance

Satu subclass memiliki satu parent.

```
A → B
```

---

### 2. Multilevel Inheritance

Pewarisan bertingkat.

```
A → B → C
```

Contoh:

```
Kendaraan → Mobil → MobilSport
```

---

### 3. Hierarchical Inheritance

Satu parent memiliki beberapa child.

```
      A
   /  |  \
  B   C   D
```

---

### 4. Multiple Inheritance

Satu class memiliki lebih dari satu parent.

```
A   B
 \ /
  C
```

Beberapa bahasa seperti **Java tidak mendukung multiple inheritance untuk class**, tetapi dapat menggunakan **interface**.

---

# 8. Keuntungan Inheritance

### 1. Code Reusability

Kode yang sudah dibuat dapat digunakan kembali.

### 2. Mempermudah Maintenance

Perubahan pada parent otomatis mempengaruhi child.

### 3. Struktur Program Lebih Rapi

Membentuk hierarki yang jelas.

### 4. Mendukung Polymorphism

Inheritance menjadi dasar bagi konsep **polymorphism**.

---

# 9. Kekurangan Inheritance

Jika digunakan secara berlebihan dapat menyebabkan:
- **Tight coupling**
- **Hierarki class terlalu kompleks**
- **Sulit dipelihara**

Karena itu, sering digunakan prinsip:

> **Favor Composition Over Inheritance**

---

# 10. Contoh Studi Kasus

Misalkan sistem **manajemen pegawai**.

Class dasar:

```
Pegawai
```

Subclass:

```
PegawaiTetap
PegawaiKontrak
PegawaiMagang
```

Implementasi sederhana:

```java
class Pegawai {

    String nama;

    void kerja() {
        System.out.println("Pegawai bekerja");
    }

}
```

Subclass:

```java
class PegawaiTetap extends Pegawai {

    void tunjangan() {
        System.out.println("Mendapat tunjangan tetap");
    }

}
```

---

# 11. Latihan Mahasiswa

### Soal 1

Buatlah class berikut:

```
Hewan
 ├── Kucing
 └── Anjing
```

Ketentuan:

Class **Hewan**

- atribut: `nama`
    
- method: `bersuara()`
    

Subclass:

- `Kucing` → override `bersuara()`
    
- `Anjing` → override `bersuara()`
    

Output contoh:

```
Kucing mengeong
Anjing menggonggong
```

---

### Soal 2

Buat sistem berikut:

```
BangunDatar
 ├── Persegi
 └── Lingkaran
```

Class **BangunDatar**

- method `hitungLuas()`
    

Subclass:

- implementasi luas masing-masing.
    

