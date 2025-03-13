package models;

public class Aluno extends Pessoa{
    private String cpf; 
    private String matricula;

    public Aluno() {}

    public Aluno( String nome, String email, String senha, String telefone, String rua, String bairro, String cpf, String matricula ) {
        super( nome, email, senha, telefone, rua, bairro );
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf( String cpf ) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula( String matricula ) {
        this.matricula = matricula;
    }

}
