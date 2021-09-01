import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        float num1 = leTeclado.nextFloat();
        float num2 = leTeclado.nextFloat();
        float soma = (num1 + num2)/2;

        System.out.println("o resultado e: " + soma);

    }
}
