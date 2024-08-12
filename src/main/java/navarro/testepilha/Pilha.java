package navarro.testepilha;

import java.util.Scanner;

public class Pilha {
    
    public int capacidade;
    public int topo;  // Ao inicializar o topo deve sempre ser -1 e ao adicionar informação esse numero muda
    public int[] dados;
    public Scanner entrada = new Scanner(System.in);
    
    
    public Pilha(int capacidade, int topo){
        this.capacidade = capacidade;
        this.topo = topo;
        this.dados = new int[capacidade];
    }
    
    public void Insere(){
        //Inserir novo dado na pilha 
        System.out.println("Digite o numero a ser adicionado:");
        int dado = entrada.nextInt();
        entrada.nextLine();
        if(this.topo != this.capacidade){
            this.dados[capacidade] = dado;
            this.topo++;
        }
        
    }
    
    public void Cheia(){
        //Verificar se a pilha esta cheia   
        
        if(this.topo == this.capacidade){
            System.out.println("A pilha esta cheia");
        }else{
            System.out.println("A pilha ainda tem espaço");
        }
    }
    
    public void Vazia(){
        if(this.topo == -1){
            System.out.println("A pilha está vazia");
        }else{
            System.out.println("A pilha não está vazia");
        }
    }
    
    public int Remove(){
      //fazer metodo de retirada de dados
      if(this.topo != -1){
          this.topo--;
          return this.dados[topo + 1]; 
      }else{
          System.out.println("A pilha está vazia");
          return 0;
      }
    }
    
    public int[] Imprime(){
        //Imprimir os dados da pilha 
        return this.dados;
    }
    
    public void menuPilha(){
        
        int escolha = 0;
                    
        while(escolha != 9){
            System.out.println("==================Menu==================");
            System.out.println("Digite 1 para Inserir algo na pilha");
            System.out.println("Digite 2 para verificar se a pilha está cheia");
            System.out.println("Digite 3 para verificar se a pilha está vazia");
            System.out.println("Digite 4 para Remover um elemento da pilha");
            System.out.println("Digite 5 para Imprimir todo o conteúdo da pilha");
            System.out.println("Digite 9 para sair");
            System.out.println("========================================");

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
                    this.Remove();
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