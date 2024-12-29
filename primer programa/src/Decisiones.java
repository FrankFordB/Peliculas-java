public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas Mas populares");
        } else {
            System.out.println("Peliculas retros");
        }


        if (incluidoEnElPlan && tipoPlan.equals("plus") ){
            System.out.println("Disfrute");
        } else {
            System.out.println("Lo sentimos, no esta permitido");
    }
}
}
