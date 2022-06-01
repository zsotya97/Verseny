package Main;

import java.util.ArrayList;

public class Tarolo
{
    private ArrayList<Nevezok> Adat;
    private ArrayList<Eredmenyek> Eredmeny;


    public Tarolo()
    {
        Adat= new ArrayList<>();
        Eredmeny= new ArrayList<>();
    }

    public ArrayList<Nevezok> getAdat() {
        return Adat;
    }

    public ArrayList<Eredmenyek> getEredmeny() {
        return Eredmeny;
    }
}
