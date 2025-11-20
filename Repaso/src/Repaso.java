public class Repaso
    public static void main (String[] args) {
    //int puedes ingresar numeros enteros mas no decimales
        //float puedes ingresar número decimales mas no enteros
        float numero_uno = 15f;
        float numero_dos = 10f;
        Scanner scanner=new Scanner(System.in);
        System.out.print("INGRESA NÚMERO #1:");
        float numero_uno = Scanner(System.in);
        System.out.print("INGRESA NÚMERO #2:");
        float numero_dos = Scanner(System.in);



        //SUMA
        float suma = numero_dos + numero_uno;

        //RESTA
        float resta = numero_uno - numero_dos;

        //MULTIPLICACIÓN
        float multiplicacion = numero_dos * numero_uno;

        //DIVSIÓN
        float division = numero_uno / numero_uno/numero_dos;

        System.out.println("division = " + division);
        System.out.println("resta = " + resta);
        System.out.println("suma = " + suma);
        System.out.println("multiplicacion = " + multiplicacion);
    }