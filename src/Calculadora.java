import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Proyecto Calculadora
        System.out.println("****PROYECTO CALCULADORA****");
        // Mostramos el menu
        // System.out.println("1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Salir");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Operacion a realizar: ");
        var operacion = Integer.parseInt(consola.nextLine());
        //Revisar que este dentro de las opciones
        if (operacion >= 1 && operacion <=4){
            System.out.print("introducir primer valor: ");
            var num1 = Double.parseDouble(consola.nextLine());
            System.out.print("introducir segundo valor: ");
            var num2 = Double.parseDouble(consola.nextLine());
            double resultado;
            switch (operacion){
                case 1 -> { // Suma
                    resultado = num1 + num2;
                    System.out.println("Resultado Suma: " + resultado);
                }
                case 2 -> { // Resta
                    resultado = num1 - num2;
                    System.out.println("Resultado Resta: " + resultado);
                }
                case 3 -> { // Multiplicacion
                    resultado = num1 * num2;
                    System.out.println("Resultado Multiplicacion: " + resultado);
                }
                case 4 -> { // Division
                    resultado = num1 / num2;
                    System.out.println("Resultado Division: " + resultado);
                }
                default ->
                    System.out.println("Opinion erronea: " + operacion);
                
            }
        }
        else if (operacion==5){ // Salir
            System.out.println("Salimos de la calculadora");
        }
        else{
            System.out.println("Opcion erronea: " + operacion);
        }
    }
}
