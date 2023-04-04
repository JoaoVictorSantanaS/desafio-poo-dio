package br.com.DesafioDio.dominio.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    private double xpMentoria = 40d;

    @Override
    public double calcularXp() {
        return XP_PADRAO + this.xpMentoria;
    }

    public Mentoria() {
    }
    public Mentoria(Double XP_PADRAO) {
        super();
    }

    public double getXpMentoria() {
        return xpMentoria;
    }

    public void setXpMentoria(double xpMentoria) {
        this.xpMentoria = xpMentoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
