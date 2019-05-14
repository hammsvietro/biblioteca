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
public class historicoMovimentacao {
    
    private Date emprestimo;
    private Date devolucao;
    private Usuario user;
    
    
    void historicoMovimentacao(Usuario user,Date emprestimo, Date devolucao ){
        this.setDevolucao(devolucao);
        this.setEmprestimo(emprestimo);
        this.setUser(user);
    }

    public Date getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Date emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }
    
    public Usuario getUser(){
        return user;
    }
    
    public void setUser(Usuario user){
        this.user = user;
    }
    
}
