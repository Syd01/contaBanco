import java.util.Locale;
import java.util.Scanner;

public class contaTerminal{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite seu Numero:");
        int numero = scanner.nextInt();
        System.out.println("Usuario : "+ numero);

        System.out.println("Por favor, digite sua Agencia:");
        String agencia = scanner.next();
        System.out.println("Agecia numero : "+agencia);

        System.out.println("Por favor, digite seu Nome:");
        String nome = scanner.next();
        System.out.println("Nome : "+nome);

        System.out.println("Por favor, digite seu Saldo:");
        double saldo = scanner.nextDouble();
        System.out.println("Saldo : "+saldo);


        System.out.println("Olá " + nome.toUpperCase() +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+  numero +" e seu saldo é de "+ saldo +" já está disponível para saque.");
    }

}