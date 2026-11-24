package prototype;

public class Fornecedor implements Cloneable {
    private String nome;
    private Integer codigoFilial;

    public Fornecedor(String nome, Integer codigoFilial) {
        super();
        this.nome = nome;
        this.codigoFilial = codigoFilial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(Integer codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                ", codigoFilial=" + codigoFilial +
                '}';
    }
}
