package patterns.behavioral.chainOfResponsibility;
public enum EnumIl {

    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),

    BALIKESIR("Balikesir"),
    KARS("Kars")
    ;

    private String il;

    EnumIl(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

    @Override
    public String toString() {
        return il;
    }
}
