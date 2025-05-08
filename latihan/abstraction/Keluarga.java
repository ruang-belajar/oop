
package latihan2;


// class Keluarga
// class ini berfungsi untuk mengelompokkan orang-orang dalam satu keluarga
public class Keluarga {

    // suami dan istri adalah objek dari class Orang
    // berarti suami dan istri adalah bisa OrangJawa atau OrangSunda
    // karena class Orang adalah class abstrak
    public Orang suami;
    public Orang istri;
    
    public Keluarga(Orang suami, Orang istri) {
        this.suami = suami;
        this.istri = istri;
    }
    
    public void salam() {
        System.out.println(this.suami.panggilan()+this.suami.nama+
                " dan "+this.istri.panggilan()+this.istri.nama);
    }
    
}
