package Ventanas.pruebas;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Fechas {
    public static void main(String[] args){
        Date date = new Date();
        //Caso 1: obtener la hora y salida por pantalla con formato:
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: "+hourFormat.format(date));
        //Caso 2: obtener la fecha y salida por pantalla con formato:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Fecha: "+dateFormat.format(date));
        //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date));
        String hora = hourFormat.format(date);
        String fecha = dateFormat.format(date);
        System.out.println("En strings:");
        System.out.println(hora);
        System.out.println(fecha);
    }
}
