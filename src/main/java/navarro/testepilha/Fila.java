package navarro.testepilha;

import java.util.Scanner;

public class Fila {

    public int capacidade;
    public int primeiro;
    public int ultimo;  
    public int[] dados;
    public Scanner entrada = new Scanner(System.in);

    public Fila(int capacidade){

        this.capacidade = capacidade; 
        this.primeiro = -1;
        this.ultimo = -1;
        this.dados = new int[capacidade];
    }

    public void Insere(){
        // Inserir novo dado na fila
        if(this.Cheia() != true){
            System.out.println("Digite o número a ser adicionado:");
            int dado = entrada.nextInt();
            entrada.nextLine();
            
            if(primeiro != -1){
            
                this.ultimo++;
                this.dados[ultimo] = dado;
            
            }else{
                
                this.ultimo ++;
                this.primeiro ++;
                this.dados[ultimo] = dado;
                
            }



            
        } else if(this.Cheia() != false) {
            System.out.println("A fila está cheia. Não é possível adicionar mais elementos.");
        }else{

        }
    }

    public boolean Cheia(){
        // Verificar se a fila está cheia
        if(this.ultimo == this.capacidade - 1){
            System.out.println("A fila está cheia");
            return true;
        } else {
            System.out.println("A fila ainda tem espaço");
            return false;
        }
    }

    public void Vazia(){
        if(this.ultimo == -1){
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia");
        }
    }

    public int Remove(){
        // Método de retirada de dados
        if(this.ultimo != -1){
            int dadoRemovido = this.dados[primeiro];

            for (int i = 0; i < this.ultimo; i++) {
                this.dados[i] = this.dados[i + 1];
            }

            this.ultimo--;
            
            if(this.ultimo == -1) {
                this.primeiro = -1;
            }

            return dadoRemovido;
        } else {
            System.out.println("A fila está vazia. Não há elementos para remover.");
            return -1; 
        }
    }

    public void Imprime(){
        // Imprimir os dados da fila
        if(this.ultimo == -1){
            System.out.println("A fila está vazia.");
        } else {
            for (int i = 0; i <= this.ultimo; i++) {
                System.out.println(i + ":" + this.dados[i]);
            }
        }
    }

    public void menufila(){
        int escolha = 0;

        while(escolha != 9){
            System.out.println("================== Menu ==================");
            System.out.println("Digite 1 para Inserir algo na fila");
            System.out.println("Digite 2 para verificar se a fila está cheia");
            System.out.println("Digite 3 para verificar se a fila está vazia");
            System.out.println("Digite 4 para Remover um elemento da fila");
            System.out.println("Digite 5 para Imprimir todo o conteúdo da fila");
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

