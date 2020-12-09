import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Joguinho {

    public static void main (String [] args){

        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador =  new Random();

        int opcao;
        int escolhausuario;
        int escolhacomputador;

        show.println("Olá, qual é o seu nome?");
        String nome = scan.nextLine();
        show.println("Estou muito feliz em conhecer você");
        show.println(nome+",você gostaria de jogar comigo?");
        show.println("1 - Sim quero jogar :)");
        show.println("2 - Não quero jogar desta vez :(");
        opcao = scan.nextInt();

        if(opcao ==2) {
            show.println("Tudo bem, jogaremos em uma próxima vez.");
        }else if (opcao == 1){

            show.println("Legal, irei explicar como o jogo funciona:");
            show.println("Vou escolher um número de 0 a 10");
            show.println("Porém, não vou dizer qual foi minha escolha");
            show.println("Caso você adivinhe o número escolhido, você vencerá!");

            escolhacomputador = gerador.nextInt(11);
            show.println("Certo, "+nome+", acabei de escolher!");
            show.println("Agora tente adivinhar!");

            do {
                escolhausuario = scan.nextInt();
                if(escolhausuario != escolhacomputador) {
                    show.println("Resposta errada!");
                }else{
                    show.println("Parabéns! você acertou em cheio!");
                }

                }while (escolhacomputador != escolhausuario);
            }

        }

    }
