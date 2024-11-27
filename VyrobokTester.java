package Domaca_Uloha03;

public class VyrobokTester
{


    public static void main(String[] args)
    {
        Vyrobok vyrobok1 = new Vyrobok("Susic na vlasy", 19.99);

        System.out.println("Nazov vyrobku: " + vyrobok1.getNazov() + ", cena: " + vyrobok1.getCena());
        System.out.println("po zlave 5 Eur");
        vyrobok1.znizCenu(5);
        System.out.println("Nazov vyrobku: " + vyrobok1.getNazov() + ", cena: " + vyrobok1.getCena());

        Vyrobok vyrobok2 = new Vyrobok("Holiaci strojcek", 29.99);

        System.out.println("Nazov vyrobku: " + vyrobok2.getNazov() + ", cena: " + vyrobok2.getCena());
        System.out.println("po zlave 5 Eur");
        vyrobok2.znizCenu(5);
        System.out.println("Nazov vyrobku: " + vyrobok2.getNazov() + ", cena: " + vyrobok2.getCena());
    }
}
