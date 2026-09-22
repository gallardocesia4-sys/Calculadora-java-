import java.util.Scanner;

public class EjerciciosLunes {

    public int sumar(int valor1, int valor2){
        int sumar = valor1+ valor2;
        return sumar;
    }
    public int restar(int valor1, int valor2){
        int restar= valor1 - valor2;
        return restar; 
    }
    public double division(double valor1, double valor2){
        double division= valor1/valor2;
        return division;
    }
    public int multiplicacion(int valor1, int valor2){
        int multiplicacion= valor1 * valor2; 
        return multiplicacion;
    }
    public void ejecucion(int valor1, int valor2 ){
        System.out.print(" Que operación deseas hacer: ");
        System.out.println("1.SUMAR ");
        System.out.println("2.RESTAR ");
        System.out.println("3.DIVIDIR ");
        System.out.println("4.MULTIPLICAR ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: "+ sumar(valor1, valor2));
                sumar(valor1, valor2);
                break;
            case 2:
                restar(valor1, valor2);
                System.out.println("El resultado de la resta es: "+ restar(valor1, valor2));
                break;
            case 3:
                multiplicacion(valor1, valor2);
                System.out.println("El resultado de la muktiplicacion es: "+ multiplicacion(valor1, valor2));
            case 4:
                division(valor1, valor2);
                System.out.println("El resultado de la division es: "+ division(valor1, valor2));
        
            default:
                break;
        }
        scanner.close();   
    }
    public static void main(String[] args) {
        EjerciciosLunes ejerciciosLunes= new EjerciciosLunes();
        ejerciciosLunes.ejecucion(2, 1);   
    }
}
  