/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i) throws IdadeInvalidaException {
        this.setNome  (n);
        this.setIdade (i);
    }
    
    public String getNome (){
        return this.nome;
    }
      public int getIdade (){
        return this.idade;
    }
    
    public void setNome (String n){
        this.nome= n;
 
    }
    
    public void setIdade (int i) throws IdadeInvalidaException {
        if (idade<=0){
            throw new IdadeInvalidaException ("idade nao pode ser menor ou igual a 0");
        }
            this.idade=i;
     }
    public Pessoa (int idade) throws IdadeInvalidaException{
        setIdade(idade);
    }
    
    
}



