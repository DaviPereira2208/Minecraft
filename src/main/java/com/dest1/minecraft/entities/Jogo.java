package com.dest1.minecraft.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jogo {

    @Id
    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private int anoLancamento;
    private String imagem;
    private String descricao;

    public Jogo(String nome, String genero, String plataforma, int anoLancamento, String imagem, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.anoLancamento = anoLancamento;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Jogo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
