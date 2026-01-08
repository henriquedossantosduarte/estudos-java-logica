
import java.util.Scanner;

void main() {


    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite seu nome por favor. ");

    String nomeCompleto = teclado.nextLine().trim();

    String[] vect = nomeCompleto.split(" ");

    String primeiroNome = vect[0];

    String mensagem = (primeiroNome.equalsIgnoreCase("ADMIN"))? "Acesso Restrito": "Acesso Convidado";

    System.out.println(mensagem);
    System.out.println(primeiroNome);


}