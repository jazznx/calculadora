package att;
import java.util.Scanner;
public class a3 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         float numb1, numb2, resultado;
         char operador;

        System.out.println("Calculadora em Java :)");
        System.out.print("Digite o Primeiro número: ");
        numb1 = input.nextFloat();


        System.out.println("Digite o operador (+, -, *, /): ");
        operador = input.next().charAt(0);

        System.out.print("Digite o Segundo número: ");
        numb2 = input.nextFloat();

        switch (operador) {
            case '+':
                resultado = numb1 + numb2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '-':
                resultado = numb1 - numb2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '*':
                resultado = numb1 * numb2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '/':
                resultado = numb1 / numb2;
                System.out.println("O resultado é: " + resultado);

                if (operador != 0) {
                    System.out.println("ERROR 404");
                    break;
                }







        }

    }
}
