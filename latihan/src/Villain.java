public class Villain extends SuperHero {

    public Villain(String depan, String belakang, String alias) {
        super(depan, belakang, alias);
    }

    @Override
    public String namaPanggilan() {
        return "The "+getAlias();
    }

}
