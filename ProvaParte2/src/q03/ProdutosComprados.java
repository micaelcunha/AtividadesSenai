/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q03;

/**
 *
 * @author Micael
 */
public class ProdutosComprados implements IProduto{
    
    private String nome;
    private float custo;

    public ProdutosComprados(String nome, float custo) {
        this.nome = nome;
        this.custo = custo;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getCusto() {
        return this.custo;
    }
    
}
