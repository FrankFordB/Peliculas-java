import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Franco Burgoa";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99 ;
        int opcion = 0;


        System.out.println("\n*******************************************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println( "El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: $" + saldo);
        System.out.println("\n*******************************************************");

        String menu = """
                \n***Escriba el numero de la opcion deseada ***
                1- Consultar saldo.
                2- Hacer un retiro.
                3- Hacer un deposito.
                9- Salir.
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Su saldo disponible es: $" + saldo);
                break;
            case 2:
                System.out.println("Cual es el valor que desea retirar? ");
                double valorARetirar = teclado.nextDouble();
                if (valorARetirar <= saldo) {
                    saldo = saldo -valorARetirar;
                    System.out.println("Su saldo actual es de $" + saldo);
                } else {
                    System.out.println("Su saldo es insuficiente, tiene disponible $" + saldo);
                }
                break;
            case 3:
                System.out.println("Ingrese el valor a depositar");
                double valorADepositar = teclado.nextDouble();
                saldo= saldo + valorADepositar;
                System.out.println("Su saldo actual es de $"+ saldo);
                break;
            case 9:
                System.out.println("Gracias por utilizar nuestros servicios.");
                break;
            default:
                System.out.println("Opcion no valida");
        }

                }
    }

    }
