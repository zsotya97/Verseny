package Main;

import java.util.ArrayList;

public class Eredmenyek
{
    private int Helyezes;
    private int ID;
    private Double Osszesitett;
    private ArrayList<Double> GyakorlatonkentiMIN;
    private ArrayList<Double> GyakorlatonkentiMAX;

    public Eredmenyek(int ID) {
        this.ID = ID;
        GyakorlatonkentiMAX= new ArrayList<>();
        GyakorlatonkentiMIN= new ArrayList<>();
    }

    public void setOsszesitett(Double osszesitett) {
        Osszesitett = osszesitett;
    }


    public void setGyakorlatonkentiMIN(Double szam) {
        GyakorlatonkentiMIN.add(szam);
    }
    public void setGyakorlatonkentiMAX(Double szam) {
        GyakorlatonkentiMAX.add(szam);
    }

    @Override
    public String toString() {
        return "Eredmenyek{" +
                "Helyezes=" + Helyezes +
                '}';
    }

    public void setTelj_nev(String telj_nev) {
    }

    public Double getOsszesitett() {
        return Osszesitett;
    }

    public void setHelyezes(int helyezes) {
        Helyezes = helyezes;
    }

    public ArrayList<Double> getGyakorlatonkentiMIN() {
        return GyakorlatonkentiMIN;
    }

    public ArrayList<Double> getGyakorlatonkentiMAX() {
        return GyakorlatonkentiMAX;
    }

    public int getID() {
        return ID;
    }
}
