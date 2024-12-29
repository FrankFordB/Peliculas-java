import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe el nombre");
        String pelicula = teclado.nextLine();
        System.out.println("ahora escribe la fecha");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("que nota le das a tu pelicula");
        double nota = teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
