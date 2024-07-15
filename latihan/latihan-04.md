# Soal 4

Perhatikan program berikut:
```java
public class Burung {
    private int ketinggian;
    private int berat;
    
    public Burung() {
        this.ketinggian = 4;
        this.berat = 2;
    }
    
    public void terbang() {
        this.ketinggian += 1;
    }
    
    public void menukik() {
        this.ketinggian -= 1;
    }
    
    public void tampilkanData() {
        System.out.println("Posisi: "+this.ketinggian);
    }
}
```

## Pertanyaan A
Apa output dari program berikut:
```java
Burung b = new Burung();
b.terbang();
b.terbang();
b.tampilkanData();
```

## Pertanyaan B
Apa output dari program berikut:
```java
Burung b = new Burung();
b.terbang();
b.menukik();
b.menukik();
b.tampilkanData();
```