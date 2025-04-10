package unidad_6.Ejercicio04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    // Atributos
    private LocalDateTime dateTime;
    private long startStopwatch;
    private long endStopwatch;

    // Constructor: fecha y hora actuales
    public Clock() {
        this.dateTime = LocalDateTime.now();
    }

    // Establecer fecha y hora
    public void setDateTime(LocalDateTime newDateTime) {
        this.dateTime = newDateTime;
    }

    // Modificar fecha y hora (ejemplo: sumar días u horas)
    public void changeDateTime(int days, int hours, int minutes) {
        this.dateTime = this.dateTime.plusDays(days).plusHours(hours).plusMinutes(minutes);
    }

    // Obtener fecha formateada (formato configurable)
    public String getDateTime(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return this.dateTime.format(formatter);
    }

    // Cronómetro - iniciar
    public void startStopwatch() {
        this.startStopwatch = System.currentTimeMillis();
    }

    // Cronómetro - parar
    public void stopStopwatch() {
        this.endStopwatch = System.currentTimeMillis();
    }

    // Obtener duración del cronómetro
    public String getStopwatch() {
        long time = endStopwatch - startStopwatch;

        long seconds = time / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        seconds %= 60;
        minutes %= 60;

        return hours + "h: " + minutes + "m: " + seconds + "s";
    }
}
