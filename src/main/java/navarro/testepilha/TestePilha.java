
package navarro.testepilha;

import java.util.Scanner;

public class TestePilha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Digite 1 para acessar a pilha");
        System.out.println("Digite 2 para acessar a fila");
        int escolha = entrada.nextInt();
        entrada.nextLine();
        switch(escolha){
          case 1:
            System.out.println("Digite o tamanho da pilha:");
            int capacidadePilha = entrada.nextInt();
            entrada.nextLine();
            Pilha p = new Pilha(capacidadePilha);
            p.menuPilha();
            break;
            
          case 2:
            System.out.println("Digite o tamanho desejado da fila");
            int capacidadeFila = entrada.nextInt();
            entrada.nextLine();
            Fila f = new Fila(capacidadeFila);
            f.menufila();
            break;
            
          default:
            System.out.println("Opção invalida, digite uma opcao valida");
        }
    }
}
