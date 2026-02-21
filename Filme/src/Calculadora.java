import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculadora {

    Scanner scan = new Scanner(System.in);

    void a() {
        System.out.println("Escolha um número: ");
        int b = scan.nextInt();
        System.out.println("O dobro de " + b + " é " + b * 2 );
    }
}