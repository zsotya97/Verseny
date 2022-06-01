package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kezeles
{
    public void Osszeg(Nevezok nevezo,  ArrayList<Eredmenyek> Eredmeny)
    {
        Double telj_osszeg=0.0;
        Eredmenyek er = new Eredmenyek(nevezo.getID());
        er.setTelj_nev(String.format("%s %s", nevezo.getKerNev(), nevezo.getVezNev()));
        for (ArrayList<Double> x : nevezo.getPontok().getPontok()) {
            Double min = Collections.min(x);
            Double max = Collections.max(x);
            Double ossz = 0.0;
            for (Double y : x) {
                if (y != min && y != max) {
                    ossz += y;
                }
            }
            er.setGyakorlatonkentiMIN(min);
            er.setGyakorlatonkentiMAX(max);
            telj_osszeg+=ossz;

        }
        er.setOsszesitett(telj_osszeg);
        Eredmeny.add(er);
    }
    public void Rendez(ArrayList<Eredmenyek> adat)
    {
        Collections.sort(adat, new SortOsszeg());
    }
    public void Helyez(ArrayList<Eredmenyek> adat)
    {
        for (int i = adat.size()-1; i >=0 ; i--) {
            adat.get((adat.size()-1)-i).setHelyezes(i+1);
        }
    }
    public void gyakMIN_MAX(ArrayList<Eredmenyek> adat, int gyakszam)
    {
        ArrayList<Double> min = new ArrayList<>();
        ArrayList<Double> max = new ArrayList<>();
        for (int i = 0; i < gyakszam; i++) {


            Double minN =11.0;
            Double maxN =-11.0;
            for (Eredmenyek x : adat) {

                if(x.getGyakorlatonkentiMIN().size()!=0 &&x.getGyakorlatonkentiMAX().size()!=0)
                {
                    if(maxN<x.getGyakorlatonkentiMAX().get(i)) maxN=x.getGyakorlatonkentiMAX().get(i);
                    if(minN>x.getGyakorlatonkentiMIN().get(i)) minN=x.getGyakorlatonkentiMIN().get(i);
                }
            }
            min.add(minN);
            max.add(maxN);
        }
        for (int i = 0; i < gyakszam; i++) {
            System.out.printf("\n%d. Gyakorlat:\n", i+1);

            for (Eredmenyek x : adat) {

                if(x.getGyakorlatonkentiMIN().size()!=0 &&x.getGyakorlatonkentiMAX().size()!=0)
                {
                    if(x.getGyakorlatonkentiMAX().get(i)==max.get(i))
                    {
                        System.out.printf("MAX: Az: %d.->%.2f\n", x.getID(),max.get(i));
                    }
                    if(x.getGyakorlatonkentiMIN().get(i)==min.get(i))
                    {
                        System.out.printf("MIN: Az: %d.->%.2f\n", x.getID(),min.get(i));
                    }
                }
            }
        }

    }
}
