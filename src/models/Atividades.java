package models;

import java.time.LocalDateTime;

public class Atividades {
    private String nome;
    private String descricao;
    private LocalDateTime dataEntrega;
    private double nota;

    public Atividades() {}

    public Atividades(String nome, String descricao, LocalDateTime dataEntrega, double nota) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nDescrição: " + getDescricao() + "\nData de Entrega: " + getDataEntrega() + "\nNota: " + getNota();
    }
}
