# Membuat Class

Class dan object adalah elemen penting dalam OOP. Contoh pendefinisian class adalah seperti berikut:

```java
// definisi class Persegi
class Persegi {
    // deklarasi atribut
    public Integer panjang;
    public Integer lebar;
        
    // definisi method
    public Integer luas() {
        return this.panjang * this.lebar;
    }
}

public class MembuatClass1 {
    public static void main(String[] args) {
        // membuat objek
        Persegi kotak = new Persegi();

        // merubah nilai atribut secara langsung
        kotak.panjang = 2;
        kotak.lebar = 3;
        
        // memanggil method luas()
        System.out.println("Luas persegi:"+kotak.luas());
    }
}
```

## Constructor

Constructor adalah fungsi yang dipanggil pada saat objek dibuat. Pada constructor bisa mempersiapkan atribut yang akan dikenakan pada objek, contructor ini juga bisa memiliki parameter.

```java
class Persegi {
    public Integer panjang;
    public Integer lebar;
    
    // constructor
    public Persegi(Integer p, Integer l) {
        this.panjang = p;
        this.lebar = l;
    }
    
    public Integer luas() {
        return this.panjang * this.lebar;
    }
}

public class MembuatClass2 {
    public static void main(String[] args) {
        Persegi kotak = new Persegi(2,3);
        System.out.println("Luas persegi:"+kotak.luas());
    }
}
```
Pada contoh program di atas kita menggunakan contructor yang meminta 2 parameter. Cara ini berarti class `Persegi` mewajibkan user untuk langsung mengisi `panjang` dan `lebar`.