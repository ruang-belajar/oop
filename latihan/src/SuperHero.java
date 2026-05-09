public class SuperHero extends Orang2 {
    private String alias;

    public SuperHero(String depan, String belakang, String alias){
        super(depan, belakang);
        this.alias = alias;
    }

    public String getAlias() {
        return this.alias;
    }

    public String namaPanggilan() {
        return getNamaDepan() + " \"" + alias + "\" " + getNamaBelakang();
    }
}