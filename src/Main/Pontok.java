package Main;

import java.util.ArrayList;

public class Pontok
{
    private ArrayList<ArrayList<Double>> Pontok;
    public Pontok(int gyakszam)
    {
        Pontok= new ArrayList<>();

    }

    public ArrayList<ArrayList<Double>> getPontok() {
        return Pontok;
    }

    public void setPontok(ArrayList<Double> lista) {
        Pontok.add(lista);
    }
}
