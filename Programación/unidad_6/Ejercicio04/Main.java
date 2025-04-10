package unidad_6.Ejercicio04;

public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        System.out.println("Now: " + myClock.getDateTime("dd/MM/yyyy HH:mm:ss"));

        myClock.changeDateTime(1, 2, 30); // Sumar 1 día, 2 horas y 30 minutos
        System.out.println("Modified: " + myClock.getDateTime("dd/MM/yyyy HH:mm"));


        System.out.println("Iniciamos el cronómetro");
        myClock.startStopwatch();

        //Esperamos 15 segundo para ver que funciona el cronómetro
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Paramos el cronómetro");
        myClock.stopStopwatch();

        System.out.println("El tiempo cronómetrado ha sido: " + myClock.getStopwatch());
    }
}
