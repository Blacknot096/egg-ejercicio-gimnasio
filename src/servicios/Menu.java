package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Rutina;

public class Menu {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Rutina> rutinas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    ClienteServicio cliServi = new ClienteServicio();
    RutinaServicio rutiServi = new RutinaServicio();

    public void menuGym() {

        boolean volverAlMenu = true;
        System.out.println("");
        System.out.println("Bienvenido al GYM, qué haremos hoy?");
        System.out.println("");

        while (volverAlMenu) {
            System.out.println("MENU");
            System.out.println("1 | Registrar un cliente");
            System.out.println("2 | Mostrar los clientes");
            System.out.println("3 | Actualizar datos de un cliente");
            System.out.println("4 | Eliminar un cliente");
            System.out.println("5 | Crear una rutina");
            System.out.println("6 | Mostrar las rutinas");
            System.out.println("7 | Actualizar datos de una rutina");
            System.out.println("8 | Eliminar una rutina");
            System.out.println("0 | Salir");
            int opcion = leer.nextInt();
            leer.nextLine();
            System.out.println("");

            switch (opcion) {

                case 1:
                    cliServi.registrarCliente(clientes);
                    break;

                case 2:
                    cliServi.obtenerClientes(clientes);
                    break;
                case 3:
                    cliServi.actualizarCliente(clientes);
                    break;
                case 4:
                    cliServi.eliminarCLiente(clientes);
                    break;
                case 5:
                    rutiServi.crearRutina(rutinas);
                    break;
                case 6:
                    rutiServi.obtenerRutinas(rutinas);
                    break;
                case 7:
                    rutiServi.actualizarRutina(rutinas);
                    break;
                case 8:
                    rutiServi.eliminarRutina(rutinas);
                    break;
                case 0:
                    System.out.println("0 | Saliendo...");
                    volverAlMenu = false;
                    break;

            }
        }
    }
}
