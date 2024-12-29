import com.sun.nio.sctp.SctpSocketOption;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Pelixmax");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (10.0 + 7.0 + 8.0) / 3;
        System.out.println(media);
        int a = 10;
        int b = 11;
        int c = 10;
        boolean igual = (a == b);
        System.out.println(igual);

        int resultado = ++a;
        System.out.println(resultado);

        String Sinopsis = """
                Matrix es una paradoja
                """ + fechaDeLanzamiento;
        System.out.println(Sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

    }





    }
