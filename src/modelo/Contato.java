package modelo;

public class Contato {
    private String nome;
    private String telefone;
    private String detalhes;

    public Contato(String nome, String telefone, String detalhes) {
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return nome;
    }
}