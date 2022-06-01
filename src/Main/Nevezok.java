package Main;

public class Nevezok
{
    private String vezNev;
    private String kerNev;
    private Integer ID;
    private Pontok pontok;

    public Nevezok(String vezNev, String kerNev, Integer ID, Integer gyakszam) {
        this.vezNev = vezNev;
        this.kerNev = kerNev;
        this.ID = ID;
        pontok = new Pontok(gyakszam);
    }

    public Pontok getPontok() {
        return pontok;
    }

    public Integer getID() {
        return ID;
    }

    public String getVezNev() {
        return vezNev;
    }

    public void setVezNev(String vezNev) {
        this.vezNev = vezNev;
    }

    public String getKerNev() {
        return kerNev;
    }

    public void setKerNev(String kerNev) {
        this.kerNev = kerNev;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Nevezok{" +
                "vezNev='" + vezNev + '\'' +
                ", kerNev='" + kerNev + '\'' +
                ", ID=" + ID +
                ", Meret=" + pontok.getPontok().size()+
                '}';
    }
}
