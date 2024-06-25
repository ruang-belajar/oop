# Catatan Kuliah 2024

## Pertemuan 1
- [PPTX](pptx/pbo-pertemuan-1.pptx)
- [Pendahuluan](01-pendahuluan.md)
  - Paradigma pemrograman (umum):
    - Imperative, Object Oriented, Functional, Logical
  - Pengertian OOP
  - Terminologi: class, object, sttribute/property, method/function, parameter
  - Check [Latihan 1](latihan/latihan-01.md)

- Persiapan program:
  - MS Excel (VBA)
  - Python + Visual Studio Code
  - XAMPP (Apache + PHP)
  - Scratch (online/desktop)
  - StarUML
  - Netbeans
  - Godot

## Pertemuan 2
- Setup StarUML: https://staruml.io/download/
  - Setup _Extension Manager_, install extension _Java_
- Buat akun Github + Github Desktop
- Join classroom: https://classroom.github.com/classrooms/114467801-2024-oop-folder
- Review, contoh dari Scratch:
  - Apa itu _Class_? cetakan (kue)
  - Apa itu _Object_? hasil cetakan (kue)
  - Apa itu _Method_? perintahnya/kue nya bisa diapakan.
  - Apa itu _Property/Attribute_? berat/ukuran/bahan.
- Setup StarUML
  - Install extension Java (via Extension Manager)
  - Set: Tools - Java - Configure
    - JavaDoc: `off`
- Class Diagram
- UML: bahasa/diagram yang dipakai untuk mengkomunikasikan design OOP
- Konversi UML ke dalam program Java
- Aturan penamaan (Naming convention):
  - variable, object, parameter, method, property: camelCase
  - class: PascalCase
  - constant: UPPERCASE

## Pertemuan 3
- Simulasi membuat class dari Scratch:
  - Class: Sprite
    - Property:
      - x: Integer
      - y: Integer
      - direction: Integer
      - show: bool
      - size: Integer
      - name: String
    - Method:
      - move(steps: Integer)
      - turn(degress: Integer)
      - glide(secs: Integer, x:Integer, y:Integer)
      - say(text: String, duration: Integer)
      - think(text: String)
      - changeSizeBy(size: Integer)
      - setSizeTo(percent: Integer)
      - show()
      - hide()
    - Tambahkan 2 method dari:
      - _stop all sounds_
      - _change volume by ..._
      - _set y to ..._
      - _point in direction_
  - Export UML ke Java
  - Buat project baru di Netbeans
  - Tambahkan file class Java ke project
  - Lengkapi method dengan perintah sederhana (`System.out.println()`)
  - Buat program sederhana menggunakan class yang dibuat.
- Contoh kasus: class diagram untuk sistem informasi kampus.
  - Class: `Mahasiswa`
    - property:
      - `nim:` _String_
      - `nama:` _String_
      - `jurusan:` _String_
      - `angkatan:` _String_
      - `lahirTanggal:` _Date_
      - `lahirTempat:` _String_
      - `ipk:` _Double_
    - method:
      - _constructor_
      - `baca()`
      - `simpan()`
      - `tambah()`
      - `hapus()`
      - `rekalkulasiIpk()`

## Pertemuan 4
- Tambahkan code untuk menyimpan data ke class `Mahasiswa`
- Design class:
  - `jurusan`
    - property:
      - `kode`: _VARCHAR(10)_
      - `nama`: _VARCHAR(30)_
    - method:
      - `baca()`
      - `hapus()`
      - `simpan()`
      - `tambah()`
  - `dosen`
    - property:
      - `nid`: _VARCHAR(10)_
      - `nama`: _VARCHAR(30)_
      - `lahirTgl`: _Date_
    - method:
      - `baca()`
      - `hapus()`
      - `simpan()`
      - `tambah()`

## Pertemuan 5
- Contoh kasus:
  - Sebuah perguruan tinggi akan membuat Sistem Informasi Kampus yang akan menangani pencatatan nilai mahasiswa. Proses yang akan ditangani SI ini:
    - tambah, update data mahasiswa
    - tambah, update data mata kuliah
    - tambah, update data dosen/admin
    - tambah, update data kelas
    - tambah, update data peserta kelas
    - Mahasiswa bisa login untuk melihat nilai
    - Dosen bisa input nilai
    - Admin bisa input nilai, melakukan manajemen data mahasiswa, kelas dan mata kuliah.
    - Dalam satu kelas mata kuliah, dosen akan menginput nilai ujian, kehadiran dan tugas. System akan secara otomatis menghitung/menampilkan nilai akhir dan grade.
  - Buat rancangan database di MySQL untuk keperluan di atas, tentukan tabel dan _primary key_; kolom dan tipe datanya.
  - Buat rancangan database dibuat per tabel dalam bentuk text dengan format seperti berikut, contoh:
    - mahasiswa:
      - nim: VARCHAR(10) PRIMARY KEY
      - nama: VARCHAR(30) 
      - angkatan: VARCHAR(4)
      - lahirTempat: VARCHAR(20)
      - lahirTanggal: DATE
      - ipk: DOUBLE
      - _(lanjutkan...)_
  - Simpan hasil di Github Classroom: https://classroom.github.com/a/QwFpwJnB , dengan nama file: `sikampus-nama.md` (_nama_ diganti nama Anda, tanpa spasi)
  - Kirim di tugas Edlink: "Desain Database (1)"
- Tipe data di MySQL: VARCHAR(), INT, DOUBLE, DATE, TIMESTAMP, DATETIME, TEXT
- Tipe data di Java: String, int, Integer, char, Date, Boolean, boolean

## Pertemuan 6
- Copy paste (sumber: https://github.com/pujangga123/LatihanOOP/tree/main/src/kampus)
  - Mahasiswa.java
  - MahasiswaTest.java
  - Dosen.java
  - DosenTest.java
  - Karyawan.java
  - KaryawanTest.java
  - Users.java
  - UsersKaryawan.java
  - UsersKaryawanTest.java
- [4 Pilar OOP](02-4-pilar.md)
- Contoh _encapsulation_: `Mahasiswa.java`
- Contoh _inheritance_: `Karyawan.java`
- Contoh _abstraction_: `Users.java` `UsersKaryawan.java`
- Contoh _polymorphic_: `UsersKaryawan.java`
- Buat:
  - UsersDosen.java
  - UsersDosenTest.java

## Pertemuan 7: UTS

## Pertemuan 8
- Review konsep _encapsulation_
  - Contoh class `Dosen`:
    - property `errMsg` bersifat _private_ berarti tidak bisa diakses oleh class turunannya
    - rubah sifat _private_ `errMsg` menjadi _protected_, maka ia bisa diakses oleh class turunannya
- Review konsep _inheritance_
  - class turunan mewarisi seluruh property dan method _parent_
  - class turunan bisa memiliki method tambahan
  - class turunan bisa memiliki method dengan nama yang sama dengan yang dimiliki _parent_
  - Contoh class `Karyawan` ([check](https://github.com/pujangga123/LatihanOOP/blob/main/src/kampus/Karyawan.java))
    - Class `Karyawan` turunan dari `Mahasiswa`. Mewarisi semua properti dan methodnya, hanya saja class `Karyawan` method tambahan `rekalkulasiScore()` yang tidak dimiliki class `Mahasiswa`
- Review _abstraction_
  - Contoh class `Users`
    - class `Users` adalah class abstract, ia tidak bisa dibuat sebagai object, tapi ia bisa diturunkan menjadi class lain. Class turunannya lah yang akan dibuat menjadi objek.
    - class abstract memberikan kerangka bagi _programmer lain_ jikalau mau membuat class tertentu, ia harus mengikuti kerangka yang disediakan oleh class abstract ini.
- prep class `UsersDosen`
- prep database `kelas` & `peserta` (lihat [sikampus1.ms](latihan/sikampus1.md))
- Class `Kelas`
- Class `Peserta`
- Tugas:
  - check [sikampus1.ms](latihan/sikampus1.md)
  - Lengkapi `Peserta` dengan fungsi: `baca()`, `update`, `getErrMsg()`, `tambah()`
  - Buat class `Kelas` dengan fungsi: `tambah()`, `update()`, `getErrMsg()`, `baca()`
  - Siapkan database

## Pertemuan 9
- Repositori [SI Kampus 1](https://github.com/ruang-belajar/SIKampus1)
- Buat class `Kelas`
  - siapkan method `pesertaTambah()`
    - gunakan method `Peserta.tambah()` 
- [Static method](03-static-method.md)
- Diperhitungkan sebagai nilai tugas secara langsung:
  - `Peserta.java` & `PesertaTest.java`
    - uji: `tambah()`, `baca()`, `update()`, `getList()`
  - `Kelas.java` & `KelasTest.java`
    - uji: `tambah()`, `baca()`, `update()`, `pesertaTambah()`, `getList()`


## Pertemuan 10:
- Penjelasan prisip OOP: _Polymorphism_, _Abstraction_, _Inheritance_
- Penjelasan _Constructor_
- Class `MahlukHidup`, `Manusia`, `Atlet`

## Pertemuan 11:
- Periksa tugas `Peserta.java` dan `Kelas.java`
  - Download [PesertaTest.java](https://github.com/pujangga123/LatihanOOP/blob/percobaan6/src/kampus/PesertaTest.java)
  - Download [KelasText.java](https://github.com/pujangga123/LatihanOOP/blob/percobaan6/src/kampus/KelasTest.java)