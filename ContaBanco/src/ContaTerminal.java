import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
      
  public static void main(String [] args) throws Exception {
    
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  
      System.out.println("Por favor, digite o número da Agência !");
      int agencia = scanner.nextInt();  
      
      System.out.println("Por favor, digite o número da Conta !");
      int numeroConta = scanner.nextInt();  
      
      System.out.println("Agora, digite o seu Nome !");
      String nomeCliente = scanner.next();
  
      System.out.println("Digite o seu saldo");
      double saldo = scanner.nextDouble();
  
      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
      
    }
  }