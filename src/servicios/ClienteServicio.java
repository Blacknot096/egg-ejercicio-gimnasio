package servicios;

import entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {

    // ArrayList < Clase > objeto
    // ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void registrarCliente(ArrayList<Cliente> lista) {

        System.out.println("1 | Registrar cliente");
        System.out.println("");
        Cliente cli = new Cliente();
        cli.setId(lista.size() + 1);
        System.out.print("Ingrese el nombre: ");
        cli.setNombre(leer.nextLine());
        System.out.print("Ingrese la edad: ");
        cli.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.print("Ingrese la la altura: ");
        cli.setAltura(leer.nextDouble());
        System.out.print("Ingrese el peso: ");
        cli.setPeso(leer.nextInt());
        leer.nextLine();
        System.out.print("Ingrese el objetivo: ");
        cli.setObjetivo(leer.nextLine());
        System.out.println("");

        lista.add(cli);
        System.out.println("* Cliente generado exitosamente *");
        System.out.println("");
    }

    public void obtenerClientes(ArrayList<Cliente> lista) {

        System.out.println("2 | Mostrando clientes: ");
        System.out.println("");
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }
        System.out.println("");
    }

    public void actualizarCliente(ArrayList<Cliente> lista) {

        System.out.println("3 | Actualizacion de clientes");
        System.out.println("");
        System.out.print("Ingrese el id del cliente a actualizar: ");
        int idIngresado = leer.nextInt();

        for (Cliente cliente : lista) {

            if (idIngresado == cliente.getId()) {

                System.out.println("Vamos a actualizar el cliente de id " + idIngresado + " :");

                System.out.print("Nombre: ");
                cliente.setNombre(leer.next());
                System.out.print("Altura: ");
                cliente.setAltura(leer.nextDouble());
                System.out.print("Peso: ");
                cliente.setPeso(leer.nextInt());
                leer.nextLine();
                System.out.print("Objetivo: ");
                cliente.setObjetivo(leer.nextLine());
            }
        }
        System.out.println("* Cliente actualizado exitosamente *");
        System.out.println("");
    }

    public void eliminarCLiente(ArrayList<Cliente> lista) {

        System.out.println("4 | Eliminar cliente");
        System.out.println("");
        System.out.print("Id: ");
        int idCliente = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < lista.size(); i++) {
            if (idCliente == lista.get(i).getId()) {
                lista.remove(i);
                lista.get(i).setId(i + 1);
            }
        }

        System.out.println("Eliminando cliente Id: " + idCliente + "...");
        System.out.println("");
        System.out.println("* Cliente eliminado exitosamente *");
        System.out.println("");
    }
}
