# Object Oriented Programming (OOP)

## Pengertian

Pemrograman Berorientasi Objek atau **Object-Oriented Programming (OOP)** adalah paradigma pemrograman yang berfokus pada **objek** sebagai unit utama dalam pembangunan perangkat lunak.  Pada pendekatan ini, program disusun sebagai kumpulan objek yang **saling berinteraksi** untuk menyelesaikan suatu masalah.

Pendekatan OOP berkembang sebagai solusi untuk mengatasi keterbatasan paradigma sebelumnya seperti **pemrograman prosedural**, terutama ketika sistem menjadi **besar, kompleks, dan sulit dipelihara**.

### Contoh Sederhana OOP

Sebuat form terdiri dari komponen *input box*, *dropdown* dan *button*. Pada OOP, masing-masing komponen diperlakukan sebagai objek yang masing-masing memiliki atribut warna tulisan, lebar box, jenis tulisan, dan masing-masing objek ini bisa saling berinteraksi.

  ![](01-pengantar-oop-contoh-1.png)

---

## Keunggulan OOP

### 1. Modularitas (Modularity)

**Modularitas** adalah kemampuan sistem untuk dipecah menjadi **bagian-bagian kecil (modul)** yang berdiri sendiri.  
Dalam OOP, modul direpresentasikan dalam bentuk **class dan object**.

Setiap class:
- memiliki **tanggung jawab spesifik**
- menyembunyikan detail implementasi internal
- berinteraksi dengan class lain melalui antarmuka yang jelas

---

#### Mengapa Modularitas Penting?

Pada sistem non-modular (misalnya prosedural besar):
- satu file berisi banyak fungsi
- perubahan kecil bisa berdampak luas
- sulit dipahami oleh tim lain

Dengan modularitas OOP:
- setiap developer dapat fokus pada satu modul
- pemahaman sistem menjadi lebih cepat
- konflik kode berkurang

---

#### Contoh Konseptual

Dalam **sistem akademik**:

|Class|Tanggung Jawab|
|---|---|
|Mahasiswa|Data & perilaku mahasiswa|
|Dosen|Data & aktivitas dosen|
|MataKuliah|Informasi mata kuliah|
|KRS|Proses pengambilan mata kuliah|

Perubahan pada class `Mahasiswa` **tidak memengaruhi** `Dosen` atau `MataKuliah`.

---

#### Dampak Nyata Modularitas

- Pengembangan paralel oleh tim
- Debugging lebih cepat
- Arsitektur sistem lebih rapi

---

### 2. Reusability (Penggunaan Ulang Kode)

**Reusability** adalah kemampuan menggunakan kembali kode yang sudah ada **tanpa menulis ulang**.

Dalam OOP, reusability dicapai melalui:
- **Inheritance**
- **Composition**
- **Interface**
- **Library / framework berbasis class**

#### Reusability melalui Inheritance

Class umum (_superclass_) menyimpan perilaku dasar  

Class khusus (_subclass_) memperluas atau memodifikasi perilaku tersebut

Contoh konseptual:

```
Pegawai
 ├── Dosen
 ├── Staff
 └── TenagaAdministrasi
```

Semua jenis pegawai:
- memiliki `nama`
- memiliki `gaji`
- memiliki `hitungGaji()`

Namun detail perhitungan bisa berbeda.

#### Keuntungan Praktis Reusability

- Mengurangi **duplikasi kode**
- Konsistensi logika bisnis
- Waktu pengembangan lebih singkat
- Biaya pemeliharaan lebih rendah

#### Reusability vs Copy-Paste

|Copy-Paste|Reusability OOP|
|---|---|
|Sulit dipelihara|Mudah dipelihara|
|Bug berulang|Perbaikan terpusat|
|Tidak konsisten|Konsisten|

---

### 3. Maintainability (Kemudahan Pemeliharaan)

**Maintainability** adalah kemampuan sistem untuk:
- diperbaiki
- dimodifikasi
- ditingkatkan

dengan **usaha, risiko, dan biaya minimal**.

OOP meningkatkan maintainability melalui:
- encapsulation
- modularitas
- pemisahan tanggung jawab

---

#### Encapsulation dan Maintainability

Dengan encapsulation:
- data internal dilindungi
- perubahan logika tidak merusak bagian lain

Contoh konseptual, jika aturan saldo bank berubah:
- cukup ubah logika di class `Rekening`
- tidak perlu mengubah class lain yang menggunakan rekening
    
#### Dampak Maintainability dalam Sistem Nyata

Pada sistem jangka panjang:
- kebutuhan bisnis berubah
- regulasi diperbarui
- fitur baru ditambahkan

Tanpa OOP:
- perubahan memicu _ripple effect_
- risiko bug tinggi

Dengan OOP:
- perubahan bersifat lokal
- dampak sistemik terkendali

#### Indikator Sistem yang Maintainable

- Class tidak terlalu besar (_low coupling_)
- Setiap class punya satu tanggung jawab
- Perubahan kecil tidak memerlukan refactor besar

---

### 4. Scalability (Kemampuan Berkembang)

**Scalability** adalah kemampuan sistem untuk:
- menangani peningkatan kompleksitas
- menambah fitur
- mendukung pertumbuhan pengguna dan data

tanpa perlu menulis ulang sistem dari awal.

#### Hubungan OOP dan Scalability

OOP mendukung scalability karena:
- struktur sistem sudah modular
- class dapat diperluas tanpa mengubah kode lama
- polymorphism memungkinkan perilaku baru tanpa refactor besar
    
#### Contoh Kasus Nyata

Awalnya sistem hanya memiliki:
- Mahasiswa reguler

Kemudian berkembang:
- Mahasiswa internasional
- Mahasiswa beasiswa
- Mahasiswa online

Dengan OOP:
- cukup menambah subclass baru
- sistem lama tetap berjalan

Tanpa OOP:
- logika bercabang semakin kompleks
- kode menjadi sulit dikontrol

#### Prinsip OOP yang Mendukung Scalability

- **Open–Closed Principle**  
    Terbuka untuk pengembangan, tertutup untuk perubahan
    
- **Polymorphism**  
    Mendukung variasi perilaku
    
- **Interface**  
    Memungkinkan integrasi sistem eksternal
    

---

## Batasan Object-Oriented Programming (OOP)

Walaupun OOP memiliki banyak keunggulan (modularitas, reusability, maintainability, scalability), paradigma ini **bukan solusi universal**. Dalam konteks tertentu, OOP memiliki keterbatasan baik dari sisi **teknis, konseptual, maupun praktis**.

---

### 1. Kompleksitas Awal yang Tinggi

OOP menuntut perancangan sistem yang matang sejak awal, seperti:
- pemodelan class
- relasi antar object
- hierarki inheritance
- abstraksi dan interface

Untuk program kecil atau sederhana, pendekatan ini justru **terasa berlebihan**.

#### Dampak Praktis

- Waktu pengembangan awal lebih lama
- Kurva belajar lebih tinggi bagi pemula
- Banyak boilerplate code

#### Contoh Kasus

Program sederhana seperti:
- perhitungan matematika
- skrip otomatisasi kecil
- prototipe cepat

seringkali **lebih efisien menggunakan pendekatan prosedural atau skrip sederhana**.

---

### 2. Overhead Performa dan Memori

OOP menggunakan object, reference, dan mekanisme runtime seperti:
- dynamic dispatch
- polymorphism
- garbage collection (pada bahasa tertentu)

Hal ini dapat menimbulkan **overhead memori dan performa**.

#### Dampak Teknis

- Konsumsi memori lebih besar
- Eksekusi sedikit lebih lambat dibanding pendekatan low-level
- Tidak optimal untuk sistem dengan keterbatasan sumber daya

#### Contoh Kasus

Pada:
- embedded system
- real-time system
- game engine level rendah

pendekatan prosedural atau berbasis struktur data sering lebih efisien.

---

## 3. Risiko Desain yang Buruk (Overengineering)

Salah satu masalah umum OOP adalah **overengineering**, yaitu:
- terlalu banyak class
- hierarki inheritance yang dalam
- abstraksi yang tidak perlu

Alih-alih menyederhanakan, OOP justru **membuat sistem sulit dipahami**.

#### Contoh Masalah

- Class hanya berisi satu method
- Inheritance digunakan padahal lebih cocok composition
- Terlalu banyak interface tanpa kebutuhan nyata

#### Dampak

- Sulit dipelihara
- Sulit dipahami developer baru
- Refactor menjadi mahal

---

### 4. Inheritance yang Tidak Tepat (Inheritance Abuse)

Inheritance adalah fitur kuat, tetapi jika digunakan sembarangan dapat menimbulkan:
- ketergantungan tinggi antar class
- efek domino saat superclass diubah

Hierarki inheritance yang dalam (**deep inheritance tree**) sulit dirawat.

#### Contoh Masalah

- Perubahan kecil di superclass merusak banyak subclass
- Subclass mewarisi method yang tidak relevan
- Sulit mengganti perilaku tertentu

#### Prinsip Penting

> “Favor composition over inheritance”

Inheritance bukan selalu solusi terbaik dalam OOP.

---

### 5. Tidak Selalu Cocok untuk Semua Masalah

OOP sangat baik untuk sistem yang:
- berorientasi objek dunia nyata
- berbasis entitas dan interaksi

Namun kurang optimal untuk:
- pemrosesan numerik intensif
- data pipeline
- pemrograman paralel dan fungsional

---

### 6. Testing Bisa Menjadi Lebih Kompleks

Dalam OOP, object sering:
- saling bergantung
- memiliki state internal

Hal ini menyulitkan:
- unit testing
- mocking dependency
- isolasi komponen

#### Dampak

- Test setup lebih kompleks
- Lebih banyak dependency yang harus di-_mock_
- Debugging membutuhkan pemahaman relasi object

---

### 7. Kurang Efektif untuk Prototyping Cepat

OOP menuntut struktur yang relatif lengkap sejak awal, sedangkan:
- prototyping
- eksplorasi ide
- proof of concept

membutuhkan fleksibilitas dan kecepatan.
Dalam kondisi ini:
- scripting
- procedural code
- dynamic typing

sering lebih produktif.

---

## Perbandingan Kode Program Imperatif vs OOP
Berikut ini perbandingan kode program Python yang ditulis menggunakan paradigma _imperatif_ dan _OOP_.

**Imperatif**
```python
def hitung_luas_persegi_panjang(panjang, lebar):
    return panjang * lebar

panjang = 10
lebar = 5
luas = hitung_luas_persegi_panjang(panjang, lebar)
print("Luas:", luas)
```

**OOP**
```python
class PersegiPanjang:
    def __init__(self, panjang, lebar):
        self.panjang = panjang
        self.lebar = lebar

    def hitung_luas(self):
        return self.panjang * self.lebar

persegi_panjang = PersegiPanjang(10, 5)
print("Luas:", persegi_panjang.hitung_luas())
```

## Elemen-elemen Penting OOP

- **Class:** template yang digunakan untuk membuat objek.\
  Class merupakan sebuah prototipe atau blueprints yang mendefinisikan variabel-variabel dan method-method secara umum.\
  Sebuah program yang utuh terdiri dari beberapa class yang saling berinteraksi satu sama lain. Class yang serupa atau memiliki kesamaan dikumpulkan dalam satu paket (module).

- **Object:** hasil _instansiasi_/turunan dari suatu class.\
  Dalam kode program, Class harus diimplementasikan menjadi sebuah objek, karena class tidak bisa langsung digunakan. Objek disebut juga dengan instance dari suatu class.

- **Attribute/Property:** Atribut adalah data yang membedakan antara objek satu dengan yang lainnya.\
  Atribut dibedakan menjadi dua jenis yaitu _Instance Variable_ dan _Class Variable_.
  _Instance Variable_ adalah atribut untuk tiap objek yang kelasnya sama.
  _Class Variable_ adalah atribut untuk semua objek yang dibuat dari class yang sama.

- **Method/Function/Procedure:** serangkaian kode program dalam suatu _class_ yang melakukan tugas tertentu.\
  Kode program dalam _method_ biasanya bertugas mengekseksi perintah tertentu, memodifikasi atau mengambil nilai pada atribut. Method juga digunakan untuk objek berkomunikasi dengan objek yang lain. 
  
- **Parameter:** Memanggil method bisa juga disertai dengan parameter.
  Parameter adalah nilai yang diberikan kepada suatu fungsi atau metode ketika dipanggil. Parameter digunakan untuk memberikan informasi yang diperlukan untuk menjalankan fungsi atau metode tersebut.

> 💡 Check [Latihan 1](latihan/latihan-01.md)


## 📚 Referensi

**PPTX**
- https://ndoware.com/paradigma-pemrograman.html
- https://www.scaler.com/topics/oops-advantages/