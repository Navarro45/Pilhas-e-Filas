
package navarro.testepilha;

import java.util.Scanner;


public class TestePilha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da pilha:");
        int capacidade = entrada.nextInt();
        entrada.nextLine();
        
        
        
        
        int topo = -1;
        
        
        Pilha p = new Pilha(capacidade, topo);
        
        p.menuPilha();
                
    }
}
