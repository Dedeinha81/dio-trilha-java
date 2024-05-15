import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor Digite o numero da agencia");
        int numero = scanner.nextInt();

        System.out.println("Por favor Digite o numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor Digite seu nome");
        String nome = scanner.next();

    

        System.out.println("Ola"+nome);
        System.out.println("Obrigado por criar uma conta em nosso Banco,sua agencia e conta são:" +"agencia" +numero + "conta" +conta );
        System.out.println("Seu saldo ja esta disponivel para saque");






    


        




    }
}
