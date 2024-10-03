import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Dime un numero!");

        Scanner sc = new Scanner(System.in);

        int inumero = sc.nextInt();

        int i;
        System.out.println(inumero % 2 == 0 ? "Es par":"Es inpar");
    }
}

