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
    private ArrayList<historicoMovimentacao> historico = new ArrayList();
    private int alugaCount;
    private boolean disponivel;
    
    public void Periodico(){
        
    }
    
    public Periodico(String titulo, String autor, int codigo){
        this.setAutor(autor);
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.disponivel = true;
    }
    
    public void alugar(){
        this.disponivel = false;
        this.alugaCount++;
        
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

    public ArrayList<historicoMovimentacao> getHistorico() {
        return historico;
    }

    public void addHistorico(historicoMovimentacao historico) {
        this.historico.add(historico);
    }
    
    
}
