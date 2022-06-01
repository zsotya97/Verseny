package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Beolvas
{
    public void adatBe(String gyak, String nevezesek, int gyakszam, Tarolo Adat)
    {

        ArrayList<String> elemek = new ArrayList<>();
        elemek.add(String.format("%s", nevezesek));
        for (int i = 1; i <=gyakszam; i++) {
            elemek.add(String.format("%s%d.csv", gyak, i));
        }
        try
        {
            for (String elem: elemek)
            {
                BufferedReader beolvas = new BufferedReader(new FileReader(elem));
                String sor;
                while ((sor=beolvas.readLine())!=null)
                {
                    if(elem.contains("GYAKORLAT"))
                    {
                        new Factory().FactoryHandler(sor, 0, Adat.getAdat(),gyakszam);
                    }
                    else if(elem.contains("NEVEZESEK"))
                    {
                        new Factory().FactoryHandler(sor, 1, Adat.getAdat(),gyakszam);
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
