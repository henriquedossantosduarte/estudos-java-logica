import java.util.Scanner;

void main() {

    Scanner teclado = new Scanner(System.in);

    String email;
    String primeiroNome = "";
    String tipoEmail = "";

    do{

        System.out.println("Digite um Email por favor");
        email = teclado.nextLine().trim();


        if (email.indexOf("@") == -1){
            System.out.println("E-mail inválido esta faltando o caractere (@) tente novamente! ");
        }else {

            String[] vect = email.split("@");
            primeiroNome = vect[0];


            if (primeiroNome.length() < 5) {
                System.out.println("O Nome antes do caractere (@) deve ter pelo menos 5 letras");
            } else {

                // ternario ira testar apenas se o email for valido!
                tipoEmail = (vect[1].equals("gmail.com")) ? "E-mail pessoal" : "E-mail corporativo";
                System.out.println("Email validado! ");
            }

        }

    } while (primeiroNome.length()< 5 || email.indexOf("@") == -1);
      System.out.println("Nome: " + primeiroNome);
      System.out.println("Tipo de email: " + tipoEmail);


}