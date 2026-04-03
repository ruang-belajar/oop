# Pendahuluan

## Sekilas tentang Paradigma Pemrograman

![](images/martial-arts.webp)


# Paradigma Pemrograman

## 1. Pendahuluan

Dalam ilmu komputer, terdapat berbagai cara atau pendekatan untuk menyelesaikan masalah menggunakan program komputer. Pendekatan tersebut disebut **Paradigma Pemrograman**.

Paradigma pemrograman membantu programmer dalam:
- Menyusun logika program
- Mengorganisasi kode
- Mengelola kompleksitas sistem
- Membuat program lebih mudah dipelihara

Dengan kata lain, paradigma pemrograman adalah **cara berpikir dalam menulis program**.

---

## 2. Pengertian Paradigma Pemrograman

Paradigma adalah sudut pandang tertentu yang digunakan terhadap suatu problem, realitas, keadaan dan sebagainya. Paradigma membatasi dan mengkondisikan jalan berpikir seseorang, mengarahkannya terhadap beberapa atribut dan mengabaikan atribut lain, sehingga paradigma hanya memberikan pandangan yang terbatas terhadap sebuah realitas.

Paradigma menentukan:
- bagaimana program disusun
- bagaimana data dikelola
- bagaimana instruksi dieksekusi
- bagaimana komponen program saling berinteraksi

---

## 3. Analogi Paradigma Pemrograman

Agar lebih mudah dipahami, paradigma dapat dianalogikan sebagai **strategi menyelesaikan masalah**.

Misalnya seseorang ingin memasak mie:

- Ada yang mengikuti **langkah-langkah resep secara berurutan**
    
- Ada yang **membagi tugas ke beberapa orang**
    
- Ada yang **menyusun bahan menjadi modul terpisah**
    

Walaupun tujuannya sama, pendekatan yang digunakan berbeda.

Begitu juga dalam pemrograman.

---

## 4. Jenis-Jenis Paradigma Pemrograman

Beberapa paradigma yang umum digunakan dalam pengembangan perangkat lunak:

### 1️⃣ Paradigma Prosedural

Paradigma imperatif dalam pemrograman merujuk pada pendekatan dalam penulisan kode yang berfokus pada urutan instruksi yang harus dieksekusi oleh komputer untuk mencapai suatu tujuan.

Paradigma ini didasari oleh konsep mesin Von Newman (stored program concept) sekelompok tempat penyimpanan (memori), yang dibedakan menjadi memori instruksi dan memori data, masing-masing memori tersebut dapat diberi nama dan nilai, selanjutnya instruksi akan dieksekusi satu persatu secara sekuensial oleh sebuah proses tunggal.

Kelebihan dari paradigma ini adalah efisiensi eksekusi karena lebih dekat dengan konsep mesin, relatif paling mudah dipelajari dibanding paradigma lain. Sedangkan kekurangannya, pada program yang berskala besar, kompleksitas programnya akan jauh bertambah besar seiring dengan bertambahkan ukuran program.

Paradigma ini berfokus pada **urutan langkah atau prosedur**.

Ciri utama:
- Program terdiri dari fungsi atau prosedur
- Eksekusi berjalan secara berurutan
- Data dan fungsi biasanya terpisah

Contoh bahasa pemrograman:
- C
- Pascal

Contoh struktur program:

```
main()
 ├── inputData()
 ├── processData()
 └── displayResult()
```

---

### 2. Paradigma Berorientasi Objek (OOP)

OOP adalah salah satu paradigma pemrograman. Paradigma ini berfokus pada **objek yang merepresentasikan entitas dunia nyata**.

Konsep utama:
- Object
- Class
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

Contoh bahasa pemrograman:
- Java
- C++
- Python
    

Dalam paradigma ini program dibangun dari **interaksi antar objek**. Paradigma ini yang akan menjadi fokus pembahasan kita di semester ini.

---

### 3. Paradigma Fungsional

Paradigma ini berfokus pada **fungsi matematika**. Paradigma dengan pendekatan yang berfokus pada penggunaan fungsi sebagai unit dasar dari komputasi dan penanganan data. Dalam paradigma ini, fungsi dianggap sebagai objek yang dapat dipindahkan dan digunakan dalam cara yang sama seperti nilai-nilai lainnya.

Paradigma fungsional menekankan pada penghindaran perubahan keadaan dan mutasi data, serta mengutamakan komputasi yang bersifat deklaratif dan tanpa efek samping.

Ciri utama:
- fungsi bersifat _pure function_
- tidak mengubah state
- tidak memiliki efek samping (_side effects_)

Contoh bahasa:
- Haskell
- Lisp

Contoh sederhana:

```
f(x) = x + 2
```

Output hanya bergantung pada input.

---

### 4. Paradigma Deklaratif

Paradigma dengan  pendekatan di mana program direpresentasikan sebagai kumpulan fakta dan aturan logis, dan komputasi dijalankan dengan menggunakan inferensi logis untuk mencari solusi.

Dalam paradigma ini, programmer mendeskripsikan relasi antara fakta-fakta dan aturan-aturan yang berlaku dalam domain masalah, dan sistem pemrograman logika menggabungkan informasi ini untuk mencapai tujuan yang diinginkan.

Paradigma ini berfokus pada **apa yang ingin dicapai**, bukan **bagaimana mencapainya**.

Contoh:

Dalam database query:

```sql
SELECT nama FROM mahasiswa WHERE nilai > 80;
```

Programmer hanya mendeklarasikan **hasil yang diinginkan**.

Contoh bahasa:
- SQL
- Prolog

---

## 5. Perbandingan Paradigma

|Paradigma|Fokus|Cara Berpikir|Contoh Bahasa|
|---|---|---|---|
|Prosedural|Langkah-langkah|Urutan instruksi|C, Pascal|
|Berorientasi Objek|Objek|Interaksi objek|Java, C++, Python|
|Fungsional|Fungsi|Transformasi fungsi|Haskell, Lisp|
|Deklaratif|Hasil|Menyatakan tujuan|SQL, Prolog|

---

## 6. Paradigma vs Bahasa Pemrograman

Hal penting yang perlu dipahami mahasiswa:

> **Paradigma ≠ Bahasa Pemrograman**

Satu bahasa pemrograman dapat mendukung **lebih dari satu paradigma**.

Contoh:

- Python, mendukung:
    - OOP
    - Prosedural
    - Fungsional
- Java, mendukung:
    - OOP
    - sebagian paradigma fungsional

Ini disebut **multi-paradigm programming language**.

---

## 7. Mengapa Paradigma Pemrograman Penting?

Memahami paradigma pemrograman membantu programmer:
1. Menyelesaikan masalah dengan pendekatan yang tepat
2. Menghasilkan kode yang lebih terstruktur
3. Mengurangi kompleksitas sistem
4. Mempermudah pemeliharaan program
5. Memilih bahasa pemrograman yang sesuai
