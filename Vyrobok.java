package Domaca_Uloha03;

/**
 * Trieda reprezentuje výrobok s daným názvom a cenou.
 */
public class Vyrobok
{
    private String nazov;
    private double cena;

    /**
     * Vytvára nový výrobok s daným názvom a cenou.
     * @param nazov názov výrobku
     * @param cena cena výrobku
     */
    public Vyrobok(String nazov, double cena)
    {
        // TODO: Doplň chýbajúcu implementáciu
        this.nazov = nazov;
        this.cena = cena;
    }

    /**
     * Vráti názov výrobku.
     *
     * @return názov výrobku
     */
    public String getNazov()
    {
        // TODO: Doplň chýbajúcu implementáciu
        return nazov;
    }

    /**
     * Vráti cenu výrobku.
     *
     * @return cena výrobku
     */
    public double getCena()
    {
        // TODO: Doplň chýbajúcu implementáciu
        return cena;
    }

    /**
     * Zníži cenu výrobku o danú sumu.
     *
     * @param suma suma o ktorú, bude znížená cena tovaru
     */
    public void znizCenu(double suma)
    {
        // TODO: Doplň chýbajúcu implementáciu
        this.cena -= suma;
    }
}
