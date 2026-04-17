Berikut adalah **materi pelajaran tentang fungsi (method) dan atribut `static` di Java** yang terstruktur dan siap digunakan sebagai bahan ajar kuliah atau modul pembelajaran.

---

## 1. Konsep Dasar `static` dalam Java

Kata kunci **`static`** digunakan untuk menyatakan bahwa suatu **atribut (variabel)** atau **fungsi (method)** dimiliki oleh **kelas**, bukan oleh objek (instance) dari kelas tersebut.

Artinya:
- Anggota `static` **dibuat satu kali** di memori
- Dibagikan (**shared**) oleh seluruh objek dari kelas yang sama
- Dapat diakses **tanpa membuat objek**

---

## 2. Atribut `static` (Static Variable)

### 2.1 Pengertian

Atribut `static` adalah variabel yang:
- Terikat pada **kelas**
- Memiliki satu nilai yang sama untuk semua objek
- Diinisialisasi satu kali saat kelas dimuat oleh JVM

### 2.2 Sintaks

```java
class Contoh {
    static int jumlah;
}
```

### 2.3 Contoh Penggunaan

```java
class Mahasiswa {
    String nama;
    static int jumlahMahasiswa = 0;

    Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
    }
}
```

```java
public class Demo {
    public static void main(String[] args) {
        new Mahasiswa("Andi");
        new Mahasiswa("Budi");

        System.out.println(Mahasiswa.jumlahMahasiswa); // Output: 2
    }
}
```

### 2.4 Karakteristik Atribut `static`

- Diakses melalui **nama kelas**
- Tidak bergantung pada objek
- Cocok untuk:
    - Konstanta global
    - Counter
    - Konfigurasi bersama

### 2.5 `static final` (Konstanta)

`static final` digunakan untuk membuat konstanta, suatu *variabel* yang nilainya tidak berubah.

```java
class Konstanta {
    static final double PHI = 3.14159;
}
```

---

## 3. Fungsi `static` (Static Method)

### 3.1 Pengertian

Fungsi `static` adalah method yang:
- Terikat pada kelas
- Dapat dipanggil tanpa objek
- Tidak dapat mengakses anggota non-static secara langsung

### 3.2 Sintaks

```java
class Contoh {
    static void tampil() {
        System.out.println("Halo");
    }
}
```

### 3.3 Contoh Penggunaan

Berikut contoh program, tanpa menggunakan fungsi static

```java
class Utilitas {
    public int tambah(int a, int b) {
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {
	    Utilitas utilitas = new Utilitas();
        int hasil = utilitas.tambah(3, 4);
        System.out.println(hasil); // Output: 7
    }
}
```

Pada contoh di atas, kita membuat objek `utilitas` hanya untuk kita memanggil fungsi `tambah()`. Fungsi `tambah()` itu sendiri tidak memiliki ketergantungan dengan properti di class. Dengan demikian kita bisa membuat fungsi `tambah()` sebagai fungsi *static*, pelajari contoh berikut:

```java
class Utilitas {
    static int tambah(int a, int b) {
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {
        int hasil = Utilitas.tambah(3, 4);
        System.out.println(hasil); // Output: 7
    }
}
```

---

## 4. Method `main()` dan `static`

```java
public static void main(String[] args)
```

Alasan `main()` harus `static`:
- JVM menjalankan `main()` **tanpa membuat objek**
- JVM membutuhkan entry point yang dapat dipanggil langsung oleh kelas

---

## 5. Aturan Penting `static`

### 5.1 Akses Anggota

|Dari|Ke non-static|Ke static|
|---|---|---|
|Static method|❌ Tidak bisa langsung|✅ Bisa|
|Non-static method|✅ Bisa|✅ Bisa|

### Contoh Kesalahan

```java
class Contoh {
    int x = 10;

    static void tampil() {
        System.out.println(x); // ERROR
    }
}
```

### Solusi

```java
static void tampil() {
    Contoh c = new Contoh();
    System.out.println(c.x);
}
```

---

## 6. Static Block

### 6.1 Pengertian

`static block` digunakan untuk:
- Inisialisasi kompleks
- Dieksekusi **satu kali** saat kelas pertama kali dimuat
    
### 6.2 Contoh

```java
class DatabaseConfig {
    static String url;

    static {
        url = "jdbc:mysql://localhost/db";
        System.out.println("Static block dijalankan");
    }
}
```

---

## 7. Perbandingan Static vs Non-Static

|Aspek|Static|Non-Static|
|---|---|---|
|Kepemilikan|Kelas|Objek|
|Jumlah di memori|Satu|Sebanyak objek|
|Akses|Nama kelas|Objek|
|Ketergantungan objek|Tidak|Ya|

---

## 8. Studi Kasus Sederhana

### Kasus: Penghitung Login Aplikasi

```java
class AuthService {
    static int totalLogin = 0;

    static void login() {
        totalLogin++;
    }
}
```

```java
public class App {
    public static void main(String[] args) {
        AuthService.login();
        AuthService.login();
        System.out.println(AuthService.totalLogin); // 2
    }
}
```

---

## 9. Kesalahan Umum yang Perlu Dihindari

- Menggunakan `static` berlebihan (mengurangi OOP)
    
- Mengakses variabel instance langsung dari static method
    
- Menyimpan state objek dalam atribut static tanpa alasan kuat
    
