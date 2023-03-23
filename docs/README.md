# Ruang Belajar OOP

## Sekilas tentang Paradigma Pemrograman

![](images/martial-arts.webp)

Paradigma adalah sudut pandang tertentu yang digunakan terhadap suatu problem, realitas, keadaan dan sebagainya. Paradigma membatasi dan mengkondisikan jalan berpikir seseorang, mengarahkannya terhadap beberapa atribut dan mengabaikan atribut lain, sehingga paradigma hanya memberikan pandangan yang terbatas terhadap sebuah realitas.

Secara umum, ada 4 paradigma pemrograman, yaitu: Imperatif/Procedural, Object Oriented, Functional, dan Declarative/Predicative/Logic.

* **Imperatif/Prosedural**:
  
  Paradigma ini didasari oleh konsep mesin Von Newman (stored program concept) sekelompok tempat penyimpanan (memori), yang dibedakan menjadi memori instruksi dan memori data, masing-masing memori tersebut dapat diberi nama dan nilai, selanjutnya instruksi akan dieksekusi satu persatu secara sekuensial oleh sebuah proses tunggal.

  Program dalam paradigma ini berdasarkan pada struktur informasi di dalam memori dan manipulasi dari informasi yang disimpan tersebut. Kata kunci yang sering digunakan dalam paradigma ini adalah:

  > Algoritma + Struktur Data = Program

  Kelebihan dari paradigma ini adalah efisiensi eksekusi karena lebih dekat dengan konsep mesin, kekurangannya adalah batasan yang sangat mengikat sehingga terkadang menyulitkan programmer yang tidak terbiasa.

  Contoh bahasa pemrogaman yang menggunakan paradigma prosedural atau imperatif adalah: Algol, Pascal, Fortran, Basic, Cobol, C, ...
  
* **Object Oriented (OOP)** :
  
  Paradigma Pemrograman Berorientasi Objek (OOP) menggunakan konsep class dan object, object adalah instansiasi dari class, setiap object akan mempunyai attribute dan method, masing-masing object dapat berinteraksi dengan object lainnya meskipun berasal dari class yang berbeda.

  mempunyai hirarki artinya sebuah class dapat diturunkan menjadi sebuah class baru yang juga memiliki attribut dan method class diatasnya. Dengan begitu dalam paradigma ini dikenal konsep modularitas, penggunaan kembali (reuse) serta kemudahan modifikasi.

  Contoh bahasa pemrograman yang menggunakan paradigma ini adalah: _Smalltalk, Eifel, Delphi, Java, C#, VB.NET,..._

* **Functional**:
  
  Paradigma ini didasari oleh konsep pemetaan dan fungsi pada matematika, fungsi dapat berupa fungsi ”primitif”, atau komposisi dari fungsi-fungsi lain yang telah terdefinisi. Dalam paradigma ini, diasumsikan bahwa akan selalu ada fungsi-fungsi dasar yang dapat digunakan, sehingga penyelesaian masalah berdasarkan pada fungsi-fungsi yang telah tersedia tersebut. Jadi dasar pemecahan masalah adalah transformasional, semua kelakuan program adalah suatu rantai transformasi dari sebuah keadaan awal menuju ke suatu rantai keadaan akhir, yang mungkin melalui keadaan antara, melalui aplikasi fungsi.

  Paradigma fungsional tidak mempermasalahkan memorisasi dan struktur data, tidak ada pemilahan antara data dan program, tidak ada lagi pengertian tentang ”variabel”. Programmer tidak perlu tahu bagaimana mesin mengeksekusi atau bagaimana informasi disimpan dalam memori, setiap fungsi seperti ”kotak hitam”, yang perlu diperhatikan hanya keadaan awal dan akhir, sebuah program besar dihasilkan dengan menggabungkan fungsi-fungsi yang telah tersedia. Program yang dihasilkan dengan bahasa pemrograman yang menggunakan paradigma ini biasanya membutuhkan waktu pemrosesan yang lebih lama dibandingkan dengan yang menggunakan paradigma prosedural karena dibutuhkan waktu lebih untuk memproses fungsi-fungsi yang digunakan dalam membuat program.

  Contoh bahasa pemrograman yang menggunakan paradigma fungsional adalah _LOGO, APL, LISP, Scheme, Haskell, ..._

* Declarative/Logic/Predicative:
  Paradigma ini didasari atas pendefinisian relasi antar individu yang dinyatakan sebagai predikat. Sebuah program lojik adalah kumpulan aksioma (Fakta dan aturan deduksi.

  Dalam paradigma ini, programmer menguraikan sekumpulan fakta dan aturan-aturan (_inference rules_). Ketika program dieksekusi, pemakai akan mengajukan pertanyaan, selanjutnya program akan menggunakan aturan deduksi dan mencocokkan pertanyaan dengan fakta-fakta yang ada untuk menjawab pertanyaan.

  Contoh bahasa pemrograman yang menggunakan paradigma ini adalah: _Prolog_.

* **Concurent**
  
  Paradigma ini didasari oleah kenyataan bahwa dalam keadaan nyata, sebuah sistem komputer harus menangani beberapa program (task) yang harus dieksekusi secara bersamaan dalam sebuah lingkungan baik mono ataupun multi processor. Dalam paradigma ini programmer tidak lagi berpikir sekuensial, melainkan harus menangani komunikasi dan sikronisasi antar task.

  Masing-masing paradigma tersebut mempunyai strategi analisa yang khusus untuk memecahkan persoalan. Setiap paradigma mempunyai kekurangan dan kelebihan sehingga tidak semua persoalan dapat dipecahkan dengan satu jenis paradigma, sehingga diperlukan analisis secara menyeluruh terhadap persoalan yang akan diselesaikan sebelum menentukan paradigma pemrograman seperti apa yang akan digunakan untuk menyelesaikan persoalan tersebut.


## Pengantar Object Oriented Programming (OOP)
* PBO atau dalam bahasa inggris OOP (Object Oriented Programming) adalah suatu metode pemrograman yang berorientasi kepada objek.
* Tujuan dari OOP diciptakan adalah untuk mempermudah pengembangan program dengan cara mengikuti model yang telah ada di kehidupan sehari-hari.
* Jadi setiap bagian dari suatu permasalahan adalah objek, nah objek itu sendiri merupakan gabungan dari beberapa objek yang lebih kecil lagi.
* Contohnya: Pesawat, Pesawat adalah sebuah objek. Pesawat itu sendiri terbentuk dari beberapa objek yang lebih kecil lagi seperti mesin, roda, baling-baling, kursi, dll. Pesawat sebagai objek yang terbentuk dari objekobjek yang lebih kecil saling berhubungan, berinteraksi, berkomunikasi dan saling mengirim pesan kepada objek-objek yang lainnya.
* Begitu juga dengan program, sebuah objek yang besar dibentuk dari beberapa objek yang lebih kecil, objek-objek itu saling berkomunikasi, dan saling berkirim pesan kepada objek yang lain.

**Alasan menggunakan paradigma OOP**
* Real world programming
* Reusability of code
* Resilience to change
* Information hiding
* Modularity of code

**Batasan OOP**
* Kode program relatif lebih banyak
* Performance berkurang

## Termininologi
* Class
* Attribute/Property
* Method/Function/Procedure
* Object
* Encapsulation
* Inheritance
* Polymorphism


## Referensi

*PPTX*
- [PBO - Pertemuan 1.pptx](../pptx/pbo-pertemuan-1.pptx)
- [PBO - Pertemuan 2.pptx](../pptx/pbo-pertemuan-2.pptx)
- [PBO - Pertemuan 3.pptx](../pptx/pbo-pertemuan-3.pptx)
- [PBO - Pertemuan 4.pptx](../pptx/pbo-pertemuan-4.pptx)
- https://ndoware.com/paradigma-pemrograman.html