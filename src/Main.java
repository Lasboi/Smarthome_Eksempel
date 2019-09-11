public class Main {

    public static void main(String[] args) {

        System.out.println("Smarthome Dummy 1");

        MikroOvn sunesOvn = new MikroOvn(); //Instansierer et objekt af klassen MikroOvn
        sunesOvn.drejeHastighed = -100;
        sunesOvn.temperatur = 700;
        sunesOvn.ydelse = 300;

        MikroOvn tommysOvn = new MikroOvn(); //Instansierer et objekt af klassen MikroOvn
        tommysOvn.drejeHastighed = 20;
        tommysOvn.temperatur = 150;
        tommysOvn.ydelse = 500;

        MikroOvn benjaminsOvn = new MikroOvn();

        System.out.println("Sunes ovn kører med " + sunesOvn.drejeHastighed);
        System.out.println("Tommys ovn kører med " + tommysOvn.drejeHastighed);

        sunesOvn.start();
        tommysOvn.start();
        sunesOvn.stop();
        tommysOvn.stop();



    }
}
