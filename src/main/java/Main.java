import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int elementos []= new int[]{64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int a;
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite: ");
        a = leitor.nextInt();
        Elementos e = new Elementos(a,elementos,0);
        e.linearSearch();
    }
}
