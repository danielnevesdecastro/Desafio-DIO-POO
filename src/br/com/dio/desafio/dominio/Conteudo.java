package br.com.dio.desafio.dominio;

public abstract class Conteudo {//nao pode ser implementada , só herdada
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;


    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descicao) {
        this.descricao = descicao;
    }
}
