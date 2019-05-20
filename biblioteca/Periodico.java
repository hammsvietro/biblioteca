/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.*;

/**
 *
 * @author Hammsvietro
 */
public class Periodico {
    
    private int codigo;
    private String titulo;
    private String autor;
    private ArrayList<HistoricoMovimentacao> historico = new ArrayList();
    private int alugaCount;
    private boolean disponivel;

   
    
    public void Periodico(){
        
    }
    
    public Periodico(String titulo, String autor, int codigo){
        this.setAutor(autor);
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.disponivel = true;
        this.alugaCount = 0;
    }
    
    public boolean alugar(HistoricoMovimentacao temp){
        this.disponivel = false;
        this.alugaCount++;
        return this.historico.add(temp);
    }
    
    public void devolver(Date data){
        this.disponivel = true;
        if(!this.historico.isEmpty())
            if(this.historico.size() == 1)
                this.historico.get(0).setDevolucao(data);
            else
                this.historico.get(this.historico.size()-1).setDevolucao(data);
        
    }
    
    public void printHistorico(){
        if(!historico.isEmpty()){
            for(HistoricoMovimentacao temp : historico){
                System.out.println("Usuario: "+temp.getUser().getNome());
                System.out.println("Data emprestimo: "+temp.getEmprestimo());
                System.out.println("Data devolucao: "+temp.getDevolucao());
            }
        }
    }
    
    public int getAlugaCount(){
        return alugaCount;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList<HistoricoMovimentacao> getHistorico() {
        return historico;
    }

    public void addHistorico(HistoricoMovimentacao historico) {
        this.historico.add(historico);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
    
}
