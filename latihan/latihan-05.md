# Soal 5

Perhatikan program berikut

**Bicycle.java**
```java
public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}
```

**Main.java**
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Bicycle bike = new Bicycle(0,1,2);
      
      // tambahkan kode program
      
      /////////////////////////////////////////////////
      
      System.out.println(bike.speed);
  }
}
```

Program diatas jika dijalankan akan memberikan output:
```
1
```

**Tugas:**

Tambahkan kode program pada bagian yang sudah ditentukan (ditandai dengan tulisan `// tambahkan kode program`).