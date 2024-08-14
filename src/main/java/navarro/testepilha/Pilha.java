package navarro.testepilha;

import java.util.Scanner;

public class Pilha {

    public int capacidade;
    public int topo;  // Ao inicializar, o topo deve ser -1, indicando que a pilha está vazia.
    public int[] dados;
    public Scanner entrada = new Scanner(System.in);

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = -1; // Inicializar o topo como -1.
        this.dados = new int[capacidade];
    }

    public void Insere(){
        // Inserir novo dado na pilha
        if(this.topo < this.capacidade - 1){
            System.out.println("Digite o número a ser adicionado:");
            int dado = entrada.nextInt();
            entrada.nextLine();
            this.topo++;
            this.dados[topo] = dado;
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
        }
    }

    public void Cheia(){
        // Verificar se a pilha está cheia
        if(this.topo == this.capacidade - 1){
            System.out.println("A pilha está cheia");
        } else {
            System.out.println("A pilha ainda tem espaço");
        }
    }

    public void Vazia(){
        if(this.topo == -1){
            System.out.println("A pilha está vazia");
        } else {
            System.out.println("A pilha não está vazia");
        }
    }

    public int Remove(){
        // Método de retirada de dados
        if(this.topo != -1){
            int dadoRemovido = this.dados[topo];
            this.topo--;
            return dadoRemovido;
        } else {
            System.out.println("A pilha está vazia. Não há elementos para remover.");
            return -1; // Retorna um valor de erro, indicando que não há elementos a remover.
        }
    }

    public void Imprime(){
        // Imprimir os dados da pilha
        if(this.topo == -1){
            System.out.println("A pilha está vazia.");
        } else {
            for (int i = 0; i <= this.topo; i++) {
                System.out.println(i + ":" + this.dados[i]);
            }
        }
    }

    public void menuPilha(){
        int escolha = 0;

        while(escolha != 9){
            System.out.println("================== Menu ==================");
            System.out.println("Digite 1 para Inserir algo na pilha");
            System.out.println("Digite 2 para verificar se a pilha está cheia");
            System.out.println("Digite 3 para verificar se a pilha está vazia");
            System.out.println("Digite 4 para Remover um elemento da pilha");
            System.out.println("Digite 5 para Imprimir todo o conteúdo da pilha");
            System.out.println("Digite 9 para sair");
            System.out.println("==========================================");

            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    this.Insere();
                    break;
                case 2:
                    this.Cheia();
                    break;
                case 3:
                    this.Vazia();
                    break;
                case 4:
                    int removido = this.Remove();
                    if(removido != -1){
                        System.out.println("Elemento removido: " + removido);
                    }
                    break;
                case 5:
                    this.Imprime();
                    break;    
                case 9:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}