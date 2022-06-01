package Main;

public class Controller
{
    public void Start()
    {
        Tarolo Adat  = new Tarolo();
        new Beolvas().adatBe("GYAKORLAT_", "NEVEZESEK.csv", 10, Adat);
        new Handler().Task(Adat,10);
    }
}
