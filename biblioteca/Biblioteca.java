/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hammsvietro
 */
public class Biblioteca {

    
    public static void main(String[] args) throws ParseException {
        
        int op = 0;
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Periodico> publicacoes = new ArrayList();
        ArrayList<HistoricoMovimentacao>movimentacoes = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("XYZ COMERCIO DE PRODUTOS LTA.");
            System.out.println("SISTEMA DE CONTROLE DE BIBLIOTECA\n");
            System.out.println("MENU PRINCIPAL:\n");
            
            System.out.println("1 - CADASTRO DE USUÁRIOS");
            System.out.println("2 - CADASTRO DE PUBLICAÇÕES");
            System.out.println("3 - MOVIMENTAÇÃO");
            System.out.println("4 - RELATÓRIOS");
            System.out.println("0 - FINALIZAR\n");
            System.out.print("OPÇÃO: ");
            op = scan.nextInt();
            
            if( op == 0 )
                break;                
            
            if( op == 1 ){ //CONTROLE DE USUARIOS
                while(true){
                    int op1 = 0;
                    
                    System.out.println("\nXYZ COMERCIO DE PRODUTOS LTA.");
                    System.out.println("SISTEMA DE CONTROLE DE BIBLIOTECA\n");
                    System.out.println("CONTROLE DE:\n");
                    
                    System.out.println("1 - INCLUSÃO");
                    System.out.println("2 - ALTERAÇÃO");
                    System.out.println("3 - CONSULTA");
                    System.out.println("4 - EXCLUSÃO");
                    System.out.println("0 - RETORNAR\n");
                    System.out.print("OPÇÃO: ");
                    op1 = scan.nextInt();
                    if(op1 == 0)//VOLTAR PRA MENU PRINCIPAL
                        break;
                    if(op1 == 1){//INCLUSAO DE USUARIOS
                        
                        
                        Usuario temp = new Usuario();
                        boolean found = false;
                        
                        System.out.print("Nome do usuário: ");
                        String x;
                        x = scanner.nextLine();
                        temp.setNome(x);
                        
                        System.out.print("Número de matrícula: ");
                        Long matricula = scan.nextLong();
                        temp.setMatricula(matricula);
                        
                        for(Usuario q:usuarios){
                            if(q.getMatricula() == matricula){
                                System.out.println("Já existe um usuario com essa matricula, usuario: " +q.getNome());
                                found = true;
                            }
                        }
                        if(!found){
                            if(usuarios.add(temp)){
                                System.out.println(temp.getNome()+" cadastrado(a) com sucesso!");
                            }
                        }
                            
                    }
                    else if(op1 == 2){//ALTERACAO DE USUARIO
                        
                        boolean found = false;
                        System.out.print("Digite o numero de matricula atual do usuário: ");
                        Long matricula = scan.nextLong();
                        for(Usuario temp : usuarios){
                            if(temp.getMatricula() == matricula){
                                
                                System.out.print("Nome do usuário: ");
                                String x = scanner.nextLine();
                                
                                System.out.print("Número de matrícula: ");
                                Long matricula1 = scan.nextLong();
                                
                                boolean newValue = true;
                                for(Usuario j : usuarios){
                                    if(matricula1 == j.getMatricula() && matricula1 != matricula){
                                        newValue = false;
                                    }
                                }
                                if(newValue){
                                    found = true;
                                    temp.setNome(x);
                                    temp.setMatricula(matricula1);
                                }
                            }
                        }
                        if(!found){
                            System.out.println("Ocorreu um erro, nenhuma alteracao foi feita!");
                        }else{
                            System.out.println("Dados alterados com sucesso");
                        }
                            
                        
                    }
                    else if(op1 == 3){//CONSULTA DE USUARIOS
                        System.out.println("");
                        for(Usuario temp:usuarios){
                            System.out.println("Nome: " + temp.getNome());
                            System.out.println("Matricula: "+ temp.getMatricula());
                            System.out.println("");
                        }
                        
                    }
                    else if(op1 == 4){//EXCLUSAO DE USUARIO
                        
                        System.out.print("Digite a matricula do usuário a ser deletado: ");
                        long matricula = scan.nextLong();
                        
                        boolean found = false;
                        String nome;
                        
                        for(Usuario x: usuarios){
                            if(x.getMatricula() == matricula){
                                nome = x.getNome();
                                usuarios.remove(x);
                                found = true;
                                System.out.println("\n"+nome+" deletado(a) com sucesso");
                                break;
                            }               
                            
                        }
                        if(!found){
                            System.out.println("Usuário não encontrado!");
                        }
                    }
                    
                }
            }
            if(op == 2){ //CONTROLE DE PUBLICACOES
                while(true){    
                    int op1 = 0;

                    System.out.println("\nXYZ COMERCIO DE PRODUTOS LTA.");
                    System.out.println("SISTEMA DE CONTROLE DE BIBLIOTECA\n");
                    System.out.println("CONTROLE DE PUBLICACOES:\n");

                    System.out.println("1 - INCLUSÃO");
                    System.out.println("2 - ALTERAÇÃO");
                    System.out.println("3 - CONSULTA");
                    System.out.println("4 - EXCLUSÃO");
                    System.out.println("0 - RETORNAR");
                    System.out.print("OPÇÃO: ");
                    op1 = scan.nextInt();

                    if(op1 == 0)//RETORNAR PARA O MENU
                        break;

                    if(op1 == 1){//INCLUSAO DE PUBLICACOES
                        System.out.println("\nInclusão de publicações");

                        System.out.print("Digite o título da publicação: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Digite o nome do autor: ");
                        String autor = scanner.nextLine();

                        System.out.print("Código da publicação: ");
                        int codigo = scan.nextInt();

                        boolean found = false;

                        for(Periodico temp : publicacoes){
                            if(codigo == temp.getCodigo()){
                                found = true;
                                System.out.println("Já existe uma publicação com esse código\nCadastre novamente");
                            }
                        }
                        if(!found){

                            if(publicacoes.add(new Periodico(titulo,autor,codigo)))
                                System.out.println("Periodico adicionado com sucesso!");
                        }   
                    }
                    if(op1 == 2){//ALTERACAO DE PUBLICACOES
                        int codigo;
                        boolean found = false;
                        
                        
                        System.out.print("Digite o código da publicação a ser alterada: ");
                        codigo = scan.nextInt();
                        boolean newValue = true;
                        for(Periodico temp : publicacoes){
                            if(temp.getCodigo() == codigo){
                                
                                
                                
                                
                                System.out.print("Digite o título da publicação: ");
                                String titulo = scanner.nextLine();

                                System.out.print("Digite o nome do autor: ");
                                String autor = scanner.nextLine();

                                System.out.print("Código da publicação: ");
                                int newCodigo = scan.nextInt();
                                
                                for(Periodico i : publicacoes){
                                    if(newCodigo == i.getCodigo() && newCodigo != codigo){
                                        newValue = false;
                                    }
                                }
                                if(newValue){
                                    found = true;
                                    temp.setAutor(autor);
                                    temp.setTitulo(titulo);
                                    temp.setCodigo(newCodigo);
                                    System.out.println("Dados atualizados com sucesso!");
                                    break;
                                }
                            }
                        }
                        if(!newValue){
                            System.out.println("Codigo ja existente em outra publicação");
                        }
                        else if(!found){
                            System.out.println("Nao existe nenhuma publicação com o codigo "+codigo);
                            
                        }
                        
                        
                    }
                    if(op1 == 3){//CONSULTA DE PUBLICACOES
                        System.out.println("Consulta de publicações:\n");
                        for(Periodico temp : publicacoes){
                            System.out.println("Título: "+temp.getTitulo());
                            System.out.println("Autor: "+temp.getAutor());
                            System.out.println("Código: "+temp.getCodigo());
                            if(temp.isDisponivel())
                                System.out.println("Disponível para empréstimo!");
                            else
                                System.out.println("Indisponível para empréstimo!");
                        }
                        System.out.println("\n");
                    }
                    if(op1 == 4){//EXCLUSAO DE PUBLICACOES

                        boolean found = false;
                        
                        System.out.print("Digite o código da publicação a ser excluída: ");
                        int codigo = scan.nextInt();
                        
                        for(Periodico temp : publicacoes){
                            if(temp.getCodigo() == codigo){
                                found = true;
                                String titulo = temp.getTitulo();
                                if(publicacoes.remove(temp))
                                    System.out.println(titulo+" excluído(a) com sucesso!");
                                else
                                    System.out.println("Ocorreu um erro na hora da exclusão");
                                break;
                            }
                        }
                        if(!found)
                            System.out.println("Não foi achadada nenhuma publicação com o codigo "+codigo);
                    }
                }
            }
            if(op == 3){//MOVIMENTACAO
                int op1 = 0;

                System.out.println("\nXYZ COMERCIO DE PRODUTOS LTA.");
                System.out.println("SISTEMA DE CONTROLE DE BIBLIOTECA\n");
                System.out.println("CONTROLE DE MOVIMENTACAO:\n");

                System.out.println("1 - EMPRÉSTIMO");
                System.out.println("2 - DEVOLUÇÃO");
                System.out.println("0 - RETORNAR");
                System.out.print("OPÇÃO: ");
                op1 = scan.nextInt();
                
                if(op1 == 0) //RETORNAR
                    break;
                
                if(op1 == 1){ //EMPRESTIMO
                    
                    System.out.print("\nInsira o código da publicação: ");
                    
                    int codigo = scan.nextInt();
                    boolean found = false;
                    boolean disponivel = false;
                    int j = 0;
                    
                    for(Periodico temp : publicacoes){
                        if(codigo == temp.getCodigo()){
                            found = true;
                            disponivel = temp.isDisponivel();
                            break;
                        }
                        j++;
                    }
                    if(!found){ 
                        System.out.println("Não existe publicacao com esse codigo");
                    }
                    
                    if(disponivel){//SE PUBLICACAO ESTA DISPONIVEL PARA ALUGAR
                        
                        System.out.print("Insira a matrícula do aluno: ");
                        long matricula = scan.nextLong();
                        boolean foundUser = false;
                        int i = 0;
                        
                        
                        for(Usuario temp: usuarios){
                            if(temp.getMatricula() == matricula){
                                foundUser = true;
                                break;
                            }
                            i++;
                        }
                        if(!foundUser){
                            System.out.println("Não existe aluno com esta matrícula!");
                        }else{
                            System.out.print("Insira a data de empréstimo no formato (dd/mm/yyyy): ");
                            String emprestimo = scanner.nextLine();
                            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(emprestimo);
                            
                            HistoricoMovimentacao temp = new HistoricoMovimentacao(usuarios.get(i),date1);
                            
                            if(publicacoes.get(j).alugar(temp))
                                System.out.println("Empréstimo do livro "+publicacoes.get(j).getTitulo() +" feito para "+usuarios.get(i).getNome()+" com sucesso!");
                            else{
                                System.out.println("Algo ocorreu de errado, tente novamente");
                            }
                            
                        }
                        
                    }else{
                        System.out.println("Livro não está disponivel!");
                    }
                }
                
                if(op1 == 2 ){ //DEVOLUCAO
                    
                    boolean found = false;
                    boolean alugado = false;
                    
                    System.out.print("Insira o codigo da publicação a ser devolvida: ");
                    int codigo = scan.nextInt();
                    int i = 0;
                    
                    
                    for(Periodico temp : publicacoes){
                        if(codigo == temp.getCodigo()){
                            found = true;
                            if(temp.isDisponivel()){
                                System.out.println("Livro não pode ser devolvido pois não está emprestado");
                            }else{
                                alugado = true;
                            }
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Nao existe nehnuma publicação com esse código");
                    }else{ //LIVRO ACHADO
                        if(alugado){
                            
                            System.out.print("Insira a data de devolução no formato (dd/mm/yyyy): ");
                            String emprestimo = scanner.nextLine();
                            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(emprestimo);
                            
                            publicacoes.get(i).devolver(date1);
                            
                            System.out.println("Devolução do livro "+publicacoes.get(i).getTitulo()+" realizada com sucesso!");
                            
                        }
                    }
                    
                    
                }
                if(op1 == 3){
                    for(Periodico temp : publicacoes){
                        temp.printHistorico();
                    }
                }
            }
            if(op == 4){//RELATORIOS
                
            }
        }
    }
}
