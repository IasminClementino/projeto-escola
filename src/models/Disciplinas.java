package models;

public class Disciplinas {
    private int id;
    private String nome;
    private String professor;
    private String descricao;
    private int cargaHoraria;

    public Disciplinas() {}

    public Disciplinas( int id, String nome, String professor, String descricao, int cargaHoraria ) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getId() {
        return this.id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor( String professor ) {
        this.professor = professor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao( String descricao ) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria( int cargaHoraria ) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "ID: " + getId() + "\nNome: " + getNome() + "\nProfessor: " + getProfessor() + "\nDescrição: " + getDescricao() + "\nCarga Horária: " + getCargaHoraria();
    }

}
