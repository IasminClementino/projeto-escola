package models;

public abstract class Pessoa {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String rua;
    private String bairro;

    public Pessoa() {}


    Pessoa( String nome, String email, String senha, String telefone, String rua, String bairro ) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha( String senha ) {
        this.senha = senha;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone( String telefone ) {
        this.telefone = telefone;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua( String rua ) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro( String bairro ) {
        this.bairro = bairro;
    }
}
