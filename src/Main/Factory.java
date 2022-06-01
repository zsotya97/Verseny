package Main;

import java.util.ArrayList;

public class Factory<T extends Nevezok>
{
    public void FactoryHandler(String sor, int temp, ArrayList<T> Adat, int gyakszam)
    {
        String[] split = sor.split(";");
        if(temp==1)
        {

            Adat.add((T)new Nevezok(split[0], split[1], Integer.parseInt(split[2]), gyakszam));
        }
        else
        {
            ArrayList<Double> pontok = new ArrayList<>();
            int azon = Integer.parseInt(split[0]);
            for (int i = 0; i <split.length-1; i++) {
                pontok.add(Double.parseDouble(split[i+1].replace(",",".")));
            }
            Adat.forEach(x->
            {
                if(x.getID()==azon)
                {
                    x.getPontok().setPontok(pontok);
                }
            });
        }

    }
}
