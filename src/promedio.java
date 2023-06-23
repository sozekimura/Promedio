import java.util.Scanner;

class Promedio {
    private final float numero1; //Aqui el IDE me sugirio colocar "final" recordatorio para preguntar
    private float numero2;

    public Promedio(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float calcularPromedio() {
        return (numero1 + numero2) / 2;
    }
}

class CalculoPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        float numero2 = scanner.nextFloat();

        Promedio promedio = new Promedio(numero1, numero2);

        float promedioFinal = promedio.calcularPromedio();

        System.out.println("El promedio de los números es: " + promedioFinal);
    }
}

/*
============================================================================
Esta fue una prueba que hice con blackbox por una curiosidad que me surgio.
============================================================================


class Promedio
{
    private int cantidadNumeros;
    private float sumaTotal;

    public void agregarNumero(float numero) {
        sumaTotal += numero;
        cantidadNumeros++;
    }

    public float calcularPromedio() {
        if (cantidadNumeros > 0) {
            return sumaTotal / cantidadNumeros;
        } else {
            return 0;
        }
    }
}

class CalculoPromedio {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("¿Cuantos numeros desea promediar?");
            int cantidadNumeros = scanner.nextInt();

            Promedio promedio = new Promedio();

            for (int i = 1; i <= cantidadNumeros; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                float numero = scanner.nextFloat();
                promedio.agregarNumero(numero);
            }

            float promedioFinal = promedio.calcularPromedio();

            System.out.println("El promedio de los números ingresados es: " + promedioFinal);
        }
    }

    */