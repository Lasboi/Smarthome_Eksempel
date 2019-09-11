public class MikroOvn {

    // Objektets egenskaber dvs. klassevariabler
    double temperatur; //celsius
    int timer; //ms
    String funktioner; //optøgning, varmning
    boolean drejerTaellerken; // true - den drejer, false, den drejer ikke
    byte drejeHastighed; //1..100
    short ydelse;

    // Gør-ting, dvs. metoder
    boolean start() {
        // @TODO Tænd en kontakt der starter mikroovnen
        System.out.println("Mikroovnen er startet.");
        return true;
    }

    void stop() {
        // @TODO Sluk kontakten der starter mikroovnen
        System.out.println("Mikrovnen er slukket");
    }
}
