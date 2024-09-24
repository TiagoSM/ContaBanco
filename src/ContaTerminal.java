import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.PORTUGUESE);
        Random random = new Random();
        int accountNumber = random.nextInt(999);
        String agencyNumber, clientName;
        double clientBalance;
        int flag = 1;
        System.out.print("Por favor, digite o número da Agência: ");
        agencyNumber = scan.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        clientName = scan.nextLine();
        while (flag == 1){
            try {
                System.out.println("Por favor, digite o valor do seu saldo em reais: ");
                System.out.print("R$");
                clientBalance = scan.nextDouble();
                flag = 0;
            } catch (InputMismatchException e) {
                System.out.println("Use a vírgula (,) como separador decimal!");
                flag = 1;
            }
        }
        System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo é R$" + clientBalance + " já está disponível para saque.");
    }
}