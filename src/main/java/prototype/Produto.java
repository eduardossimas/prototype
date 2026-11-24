package prototype;

public class Produto implements Cloneable {
    private int codigo;
    private String nome;
    private Fornecedor fornecedor;
    private String categoria;

    public Produto(int codigo, String nome, Fornecedor fornecedor, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.fornecedor = (Fornecedor) produtoClone.fornecedor.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", fornecedor=" + fornecedor +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
