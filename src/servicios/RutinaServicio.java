package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Rutina;

public class RutinaServicio {

    Scanner leer = new Scanner(System.in);

    public void crearRutina(ArrayList<Rutina> lista) {

        System.out.println("5 | Crear rutina");
        System.out.println("");
        Rutina ruti = new Rutina();
        ruti.setId(lista.size() + 1);
        System.out.print("Ingrese el nombre: ");
        ruti.setNombre(leer.nextLine());
        System.out.print("Ingrese la duracion en minutos: ");
        ruti.setDuracion(leer.nextInt());
        leer.nextLine();
        System.out.print("Ingrese el nivel de dificultad: ");
        ruti.setNivelDificultad(leer.nextLine());
        System.out.print("Ingrese una descripcion: ");
        ruti.setDescripcion(leer.nextLine());
        System.out.println("");

        lista.add(ruti);
        System.out.println("* Rutina generada exitosamente *");
        System.out.println("");
    }

    public void obtenerRutinas(ArrayList<Rutina> lista) {

        System.out.println("6 | Mostrando rutinas: ");
        System.out.println("");
        for (Rutina rutina : lista) {
            System.out.println(rutina);
        }
        System.out.println("");

    }

    public void actualizarRutina(ArrayList<Rutina> lista) {

        System.out.println("7 | Actualizacion de rutinas");
        System.out.println("");
        System.out.print("Ingrese el id de la rutina a actualizar: ");
        int idIngresado = leer.nextInt();

        for (Rutina rutina : lista) {

            if (idIngresado == rutina.getId()) {

                System.out.println("Vamos a actualizar la rutina de id " + idIngresado + " :");

                System.out.print("Nombre: ");
                rutina.setNombre(leer.next());
                System.out.print("Duracion: ");
                rutina.setDuracion(leer.nextInt());
                leer.nextLine();
                System.out.print("Nivel de dificultad: ");
                rutina.setNivelDificultad(leer.nextLine());
                System.out.print("Descripcion: ");
                rutina.setDescripcion(leer.nextLine());
            }
        }
        System.out.println("* Rutina actualizada exitosamente *");
        System.out.println("");
    }

    public void eliminarRutina(ArrayList<Rutina> lista) {

        System.out.println("8 | Eliminar rutina");
        System.out.println("");
        System.out.print("Id: ");
        int idRutina = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < lista.size(); i++) {
            if (idRutina == lista.get(i).getId()) {
                lista.remove(i);
                lista.get(i).setId(i + 1);
            }
        }
        System.out.println("Eliminando rutina Id: " + idRutina + "...");
        System.out.println("");
        System.out.println("* Rutina eliminada exitosamente *");
        System.out.println("");

    }
}
