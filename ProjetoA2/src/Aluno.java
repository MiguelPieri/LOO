import java.util.ArrayList;
import java.util.Scanner;



public class Aluno {

    private Scanner scan;
    private int res;
    private int res2;
    private int res3;
    private int res4;
    private int alunoSelect;
    private double media;
    private int tamanho;

    private ArrayList<Double> listaA1;
    private ArrayList<Double> listaA2;
    private ArrayList<Double> listaP1;
    private ArrayList<Double> listaP2;
    private ArrayList<String> listaNome;
    private ArrayList<Integer> listaNum;
    private ArrayList<Double> listaMedia;
    
    


    public Aluno(){
        this.listaMedia = new ArrayList<Double>();
        this.listaA1 = new ArrayList<Double>();
        this.listaA2 = new ArrayList<Double>();
        this.listaP1 = new ArrayList<Double>();
        this.listaP2 = new ArrayList<Double>();
        this.listaNome = new ArrayList<String>();
        this.listaNum = new ArrayList<Integer>();
        this.scan = new Scanner(System.in);
        
    }


    
    

    void Menu(){

        do{   
            do{
            
                System.out.println("\n---------------------------------------\n");
                System.out.println("1 - Gerenciar Alunos.");
                System.out.println("2 - Rendimento Escolar.");
                System.out.println("0 - Sair.");
                System.out.println("\n---------------------------------------\n");
                int res = this.scan.nextInt();

            
                switch (res) {
                    case 1:

                        do{
                            System.out.println("\n---------------------------------------\n");
                            System.out.println("1 - Adicionar Aluno.");
                            System.out.println("2 - Alterar nome do Aluno.");
                            System.out.println("3 - Excluir Aluno.");
                            System.out.println("4 - Listar todos.");
                            System.out.println("5 - Selecionar um aluno da lista, para adicionar notas ou calcular a média.");
                            System.out.println("9 - para voltar");
                            System.out.println("0 - para sair.");
                            System.out.println("\n---------------------------------------\n");
                            int res2 = this.scan.nextInt();
                            
                            switch(res2){
                                case 1:
                                    this.AdicionarLista();
                                    break;
                                case 2:
                                    this.AlterarLista();
                                    break;
                                case 3:
                                    this.Excluir();
                                    break;
                                case 4:  
                                    this.ImprimirLista();
                                    break;
                                case 5:  
                                    this.ImprimirLista();
                                    System.out.println("Digite o numero da posição do aluno para ser alterado.");
                                    alunoSelect = this.scan.nextInt();

                                    do{

                                        System.out.println("\n---------------------------------------\n");
                                        System.out.println("1 - Adicionar a nota A1 do aluno selecionado.");
                                        System.out.println("2 - Adicionar a nota P1 do aluno selecionado.");
                                        System.out.println("3 - Adicionar a nota A2 do aluno selecionado.");
                                        System.out.println("4 - Adicionar a nota P2 do aluno selecionado.");
                                        System.out.println("5 - Calcular a Média do Aluno.");
                                        System.out.println("9 - para voltar");
                                        System.out.println("0 - para sair");
                                        System.out.println("\n---------------------------------------\n");
                                        res3 = this.scan.nextInt();

                                        switch (res3) {
                                            case 1:
                                                A1();
                                                break;
                                            case 2:
                                                P1();
                                                break;
                                            case 3:
                                                A2();
                                                break;
                                            case 4:
                                                P2();
                                                break;
                                            case 5:
                                                this.Media();
                                                System.out.println("Média: " + this.media);
                                                if( media >= 6){
                                                    System.out.print("O aluno foi aprovado!");
                                                }

                                                else{
                                                    System.out.print("O aluno foi reprovado!");
                                                }
                                                break;

                                            case 9:
                                                res3 = 99;
                                                break;

                                            case 0:
                                                System.out.println("Finalizando...");
                                                System.exit(0);

                                            default:
                                                System.out.println("Opção invalida!");
                                                break;
                                        }

                                            
                                    }while(res3 != 99);
                                    break;
                                  
                                case 0:
                                    System.out.println("Finalizando...");
                                    System.exit(0);
                                    break;   

                                case 9:
                                    res = 0;
                                    break;
                                default:
                                    System.out.println("Opção invalida!");

                                }
                            
                        }while(res2 != 0);
                        break;
                    
                    case 2:
                        do {
                            System.out.println("\n---------------------------------------\n");
                            System.out.println("1 - Selecionar um aluno da lista, para exibir notas de prova de atividade e média.");
                            System.out.println("2 - Exibir rendimento da turma.");
                            System.out.println("9 - para voltar");
                            System.out.println("0 - para sair.");
                            System.out.println("\n---------------------------------------\n");
                            int res4 = this.scan.nextInt();


                            switch(res4){

                                case 1:
                                    this.Opcao10();
                                    break;

                                case 2:
                                    this.Opcao11();
                                    break;
                                case 9:
                                    res4 = 0;
                                    break;

                                case 0:
                                    System.out.println("Finalizando...");
                                    break;    
                                default:
                                    System.out.println("Opção inválida.");
                                    break;



                            }

                        }while(res4 != 0);
                        break;  

                    case 0:
                        System.out.println("Encerrando...");
                        System.exit(0);
                        break; 
                      
                    default:
                        System.out.println("Opção Invalida!");
                        break;   
                }  
            }while(res != 9);
        }while(res != 0);
    }
    






    void AdicionarLista (){    
        int continuar = 99;

        System.out.println("Insira o nome do aluno:");
        String nomeAluno = this.scan.next();
        this.listaNome.add(nomeAluno);

        System.out.println("Informe o Código do aluno:");
        int codAluno = this.scan.nextInt();
        this.listaNum.add(codAluno);

        do{
            
        
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1 - para continuar");
            System.out.println("0 - para sair");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int res5 = this.scan.nextInt();

            switch(res5){
                case 1:
                    System.out.println("Insira o nome do aluno:");
                    nomeAluno = this.scan.next();
                    this.listaNome.add(nomeAluno);

                    System.out.println("Informe o Código do aluno:");
                    codAluno = this.scan.nextInt();
                    this.listaNum.add(codAluno);
                    break;

                case 0:
                    continuar = 0;
                    break;

                default:
                    System.out.println("Opção invalida.");
            }


            
        }while(continuar != 0);
    }


    void ImprimirLista(){
        tamanho = this.listaNome.size();

        for(int i = 0; i < tamanho; i++){
            System.out.println("[ " + i + " ]  " + "Nome: "+ this.listaNome.get(i) + "  Código: " + this.listaNum.get(i));
        }
        
    }


    void AlterarLista(){
        this.ImprimirLista();

        System.out.println("Informe o numero da posição que deseja alterar.");
        int posicao = this.scan.nextInt();

        System.out.println("Informe o nome alterado.");
        String nomeAlterado = this.scan.next();

        listaNome.set(posicao, nomeAlterado);

    }

    void Excluir(){
        this.ImprimirLista();
        System.out.println("Informe o numero da posição que deseja remover.");
        int posicao = this.scan.nextInt();

        listaNome.remove(posicao);
        listaNum.remove(posicao);
        
    }

    void A1(){
        System.out.println("Informe o valor de A1:");
        double a1 = scan.nextDouble();
        this.listaA1.add(a1);

    }
    
    void A2(){
        System.out.println("Informe o valor de A2:");
        double a2 = scan.nextDouble();
        this.listaA2.add(a2);

    }

    void P1(){
        System.out.println("Informe o valor de P1:");
        double p1 = scan.nextDouble();
        this.listaP1.add(p1);
    }

    void P2(){
        System.out.println("Informe o valor de P2:");
        double p2 = scan.nextDouble();
        this.listaP2.add(p2);
    }

   

    void Media(){
        int i = alunoSelect;
        media = (((this.listaP1.get(alunoSelect) + this.listaA1.get(alunoSelect))/2) +((this.listaP2.get(alunoSelect) + this.listaA2.get(alunoSelect))/2))/2;
        this.listaMedia.add(alunoSelect, media);
        
    }

    void Opcao10(){
        this.ImprimirLista();
        System.out.println("Escolha o numero da posição de um aluno.");
        alunoSelect = this.scan.nextInt();

        this.Media();
         System.out.println("P1:" + this.listaP1.get(alunoSelect) + "\nP2:"+ this.listaP2.get(alunoSelect) + "\nA1:" + this.listaA1.get(alunoSelect) + "\nA2:" + this.listaA2.get(alunoSelect) + "\nMédia:" + this.listaMedia.get(alunoSelect));
        
    }       

    void Opcao11(){
        this.Media();
        tamanho = this.listaNome.size();
        for(alunoSelect = 0; alunoSelect < tamanho; alunoSelect++){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Nome:" + this.listaNome.get(alunoSelect));
            System.out.println("Codigo:" + this.listaNum.get(alunoSelect));
            System.out.println("Nota da P1:"+ this.listaP1.get(alunoSelect));
            System.out.println("Nota da P2:"+ this.listaP2.get(alunoSelect));
            System.out.println("Nota da A1:"+ this.listaA1.get(alunoSelect));
            System.out.println("Nota da A2:"+ this.listaA2.get(alunoSelect));
            System.out.println("Média:" + this.listaMedia.get(alunoSelect));
            System.out.println("\n------------------------------------------------------------------\n");
        }

    }

    

    
}


