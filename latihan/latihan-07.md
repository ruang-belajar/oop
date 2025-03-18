# Latihan 7

Perhatikan program berikut:

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

## Soal
1. Tambahkan fungsi `keliling()` untuk menghitung keliling persegi dan tampilkan pada bagian `main()`
2. Tambahkan fungsi `perbesar(n)` yang berfungsi memperbesar `panjang` dan `lebar` sebanyak `n` kali