# Catatan Kuliah 2026

## Pertemuan 1
- [Pendahuluan](01-pendahuluan.md)
- [Terminologi OOP](terminologi-penting.md)
- Latihan
  - Check [Latihan 1](latihan/latihan-01.md)
- Tugas:
  - Download & install [JDK 21](https://www.oracle.com/id/java/technologies/downloads/#jdk21-windows)
  - Download & install [Visual Studio Code](https://code.visualstudio.com/download)
		- [Extension Pack for Java](marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - Buat akun [Github](https://github.com)
  - Download & Install [Github Desktop](https://desktop.github.com)

## Pertemuan 2
- Review Scratch:
	- Contoh Scratch: [Spaceship 1](https://scratch.mit.edu/projects/1299234602)
- [Review Java](https://github.com/ruang-belajar/java/)
  - Materi umum:
    - Variabel
    - Operasi
    - IF
    - Loop
    - Membuat fungsi
    - Menggunakan fungsi standard  
  - [Syntax dasar](https://github.com/ruang-belajar/java/blob/main/docs/03-syntax.md)
  - Hal yang perlu diperhatikan
    - Java adalah bahasa pemrograman yang _case sensitive_
    - Perhatikan aturan penulisan nama variabel (_naming convension_)
    - Nama _class_ selalu sama dengan nama file
- [Membuat Class](02-membuat-class.md)
	- Method & Property
- Latihan: GameTebakAngka
	- GameTebakAngka dengan paradigma imperatif
	- GameTebakAngka dengan implementasi OOP

## Pertemuan 3
- Review membuat class
- [4 Pilar OOP](03-4-pilar.md): [Encapsulation](03-encapsulation.md)
- GameTebakAngka dengan implementasi prinsip *Encapsulation*.
- Intro: Constructor
- Latihan:
	- Buat class `Lingkaran`
	- Tentukan dan buat properti dan method

## Pertemuan 4
* Review Encapsulation
* Review: Constructor
	* `super()`
* 4 Pilar OOP: [Inheritance](03-inheritance.md)
* Latihan:
	* Buat class `Orang`
		* constructor `Orang(namaDepan, namaBelakang)`
			* konversi `namaDepan` dan `namaBelakang` menjadi huruf kapital
		* property private: `namaDepan`, `namaBelakang`
		* method public: `getNamaDepan()`, `getNamaBelakang()`
	* Buat class `LatihanOrang` untuk menguji class `Orang`
	* Buat class `OrangSunda` turunan dari `Orang`
		* method `namaPanggilan()`, contoh output:
			* `Aa Budi`
			* `Aa Asep`
	* Buat class `OrangJawa` turunan dari `Orang`
		* constructor `OrangJawa(namaDepan, namaBelakang, jenisKelamin)`		* 
		* method `namaPanggilan()`, contoh output:
			* `Mba Yanti`
			* `Mas Mono`
* **Tugas:**
	* Buat class `SuperHero` yang merupakan turunan dari `Orang`
		* Tambahkan property `alias`
		* `SuperHero` memiliki konstruktor `SuperHero(namaDepan, namaBelakang, alias)`
		* Buat method `namaPanggilan()` dengan contoh output sebagai berikut:
			* `Bruce "Batman" Wayne`
			* `Clark "Superman" Kent`
			* `Diana "Wonder Woman" Prince`
		* Buat class `LatihanSuperHero` untuk menguji class `SuperHero()`
	* Buat class `Celsius`
		* method `fahrenheit()`, `kelvin()`, `reamur()`
		* Buat class `LatihanCelsius` untuk menguji class `Celsius()`

