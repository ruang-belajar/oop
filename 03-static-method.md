# Static Methods

_Static_ method adalah method yang bisa dipanggil tanpa membuat objek. Contoh, ketika kita memanggil method untuk mencari nilai akar kuadrat, kita menggunakan `Math.sqrt()`. Kita tidak perlu membuat objek dari class Math (seperti dengan perintah `Math math = new Math()`), tapi kita bisa langsung memanggil method dengan perintah `Math.sqrt()`.

Perhatikan contoh program berikut yang dibuat tanpa method _static_.

```java
public class OrangTua {
    public void cetakDefinisi() {
        System.out.println("Bertanggung jawab atas anak.");
    }
}

public class OrangTuaTest {
    public static void main(String[] args) {
        // membuat objek dari class OrangTua
        OrangTua warga = new OrangTua(); 
        warga.cetakDefinisi();
    }
}

```

Untuk menggunakan method `cetakDefinisi()`, kita harus membuat objek dari class `OrangTua`.

```java
public class OrangTua {
    static void cetakDefinisi() {
        System.out.println("Bertanggung jawab atas anak.");
    }
}

public class OrangTuaTest {
    public static void main(String[] args) {
        // method static dapat dibuat tanpa membuat objek
        OrangTua.cetakDefinisi();
    }
}

```