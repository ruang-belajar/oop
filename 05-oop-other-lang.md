# OOP Dalam Berbagai Bahasa Pemrograman

## Java

**Kendaraan.java**
```java
package latihan;

abstract class Kendaraan {
    // posisi
    public int x;
    public int y;
    
    private int panjang;
    private int lebar;
    private String nama;
    
    public Kendaraan(String nama) {
        this.x = 0;
        this.y = 0;
        this.panjang = panjang;
        this.lebar = lebar;
        this.nama = nama;
        
    }
    
    public int getLebar() {
        return this.lebar;
    }
    
    public int getPanjang() {
        return this.panjang;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    abstract public void bergerak(int moveX, int moveY);
    
    abstract public void tampilkanInfo();
    
}

```

**Motor.java**
```java
package latihan;

public class Motor extends Kendaraan{
    
    private int roda;
    
    public Motor(String nama, int x, int y) {
        super(nama);
        this.x = x;
        this.y = y;
        
        this.roda = 2;
        
        System.out.println("Motor "+nama+" dibuat");
    }

    @Override
    public void bergerak(int moveX, int moveY) {
        this.x = moveX;
        this.y = moveY;
        System.out.println("Bergerak");
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.print("Motor:");
        System.out.println(this.getNama());
        System.out.print("Lebar: ");
        System.out.println(this.getLebar());
        System.out.print("Panjang: ");
        System.out.println(this.getPanjang());
        System.out.print("Roda: ");
        System.out.println(this.roda);
    }
    
}

```

**MotorTest1.java (program utama)**
```java
package latihan;

public class MotorTest1 {
    public static void main(String[] args) {
        Motor m = new Motor("Yamaha", 1, 3);
        m.bergerak(3, 10);
        m.tampilkanInfo();
    }
}
```

## Soal:
1. Class declaration
2. Access Control?
3. Abstract?
4. Constructor?
5. this?
6. Inheritance

---

## Jawaban

### Pascal
1. Static
2. `private`/`public`
3. 
4.
5.
6.

### Typescript
1. class Kendaraan
2. private/public
3. abstract
4. constructor()
5. this
6. extends

### Javascript
1. class Kendaraan
2. tanda # untuk property private
3. abstract
4. constructor()
5. this
6. extends

### PHP
1. class Kendaraan
2. public/private
3.
4. constructor
5. $this
6. extends

### Python
1. class Kendaraan
2.
3. abstract
4. 
5. `this`
6. `extends`

### VB.Net
1. Public Class Kendaraan
2. 
3. 
4. Public Sub New()
5. Me
6. Inherits

### VBA
1. Module as class
2. `Public`/`Private`
3. MustInherit 
4. -
5. `Me`
6. `Implements`

### C#
1. class Kendaraan
2. `public`/`private`
3. `abstract`
4. `public class`
5. `this`
6. `:`

### Swift
1. class Kendaraan
2. `public`/`private`
3. `protocol`
4. `init`
5. `this`
6. `:`


