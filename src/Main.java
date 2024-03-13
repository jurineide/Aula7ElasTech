import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* Implemente um jogo de adivinhação onde o jogador tem que adivinhar um número secreto entre 1 e 10.
        No entanto, o jogador só tem cinco tentativas para acertar o número. Após cada tentativa,
        o jogo deve informar se o número digitado pelo jogador está muito próximo, acima ou abaixo
        do número secreto. Se o jogador adivinhar corretamente o número dentro do limite de tentativas,
        ele vence. Caso contrário, ele perde.
        */
                Scanner leitura = new Scanner(System.in);
                Random random = new Random();
                int chances = 5, palpite = 0, numerodasorte = random.nextInt(10) + 1;;
                System.out.println(" ==== Vamos iniciar o jogo ====");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | Voce deve acertar o numero |");
                System.out.println(" | que o robo esta pensando |");
                System.out.println(" | |");
                System.out.println(" ==============================");
                for (int i = 5; i > 0; i--) {
                    System.out.println("O jogo começará em " + i + " segundos...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                while(chances > 0 && palpite != numerodasorte){
                    System.out.println("Digite um numero, vamos ver se voce acerta");
                    palpite = leitura.nextInt();

                    if(palpite == numerodasorte){
                        System.out.println("Parabenssssss voce acertou");
                    }else{
                        System.out.println("Tente novamente");
                        chances--;
                        if(chances > 0){
                            System.out.println("Voce ainda tem "+ chances + " chances para acertar" );
                            if (palpite < numerodasorte){
                                System.out.println(" tente um numero maior");
                            }else{
                                System.out.println(" tente um numero menor");
                            }
                        }else{

                            System.out.println("voce nao conseguiu suas chances acabaram!!");
                        }
                    }
                }

                System.out.println("saiu do while");

    }
}


