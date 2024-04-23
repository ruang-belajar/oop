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

## Pertemuan X
- Mengenali Object, Class, Method, Property pada program-program lain: _VBA Excel, Python, PHP, Java_
