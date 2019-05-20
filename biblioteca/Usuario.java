/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Hammsvietro
 */
public class Usuario {
    
    private long matricula;
    
    private String nome;
    
    

   

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    
    void Usuario(long matricula){
        this.setMatricula(matricula);
    }
    
    void Usuario(long matricula,String nome){
        this.setNome(nome);
        this.setMatricula(matricula);
    }
    
    void Usuario(){}
    
    
    
    
    
}
