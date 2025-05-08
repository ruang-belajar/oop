
package latihan2;

public class Keluarga {
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
