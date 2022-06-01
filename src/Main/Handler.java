package Main;

import java.util.Collections;

public class Handler
{
    public void Task(Tarolo Adat, int gyakszam)
    {
        Kezeles task = new Kezeles();
        Adat.getAdat().forEach(x->
        {
            task.Osszeg(x, Adat.getEredmeny());

        });
        task.Rendez(Adat.getEredmeny());
        task.Helyez(Adat.getEredmeny());
        task.gyakMIN_MAX(Adat.getEredmeny(), gyakszam);

    }
}
