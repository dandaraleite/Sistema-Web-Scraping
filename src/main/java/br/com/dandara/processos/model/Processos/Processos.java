package br.com.dandara.processos.model.Processos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "processos")
public class Processos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "num_pub")
    private Integer numeroPub;

    @Column(name = "num_pedido_internacional")
    private Integer numeroPedidoInternacional;

    @Column(name = "data_publicacao")
    private Integer dataPublicacao;

    private String requerentes;
    private String titulo;

    public Processos(DadosProcessos dados) {
        this.numeroPub = dados.numeroPub();
        this.numeroPedidoInternacional = dados.numeroPedidoInternacional();
        this.dataPublicacao = dados.dataPublicacao();
        this.requerentes = dados.requerentes();
        this.titulo = dados.titulo();
    }
    public Processos(){}

    @Override
    public String toString() {
        return "Processo{" +
                "numeroPub=" + numeroPub +
                ", numeroPedidoInternacional=" + numeroPedidoInternacional +
                ", dataPublicacao=" + dataPublicacao +
                ", requerentes='" + requerentes + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public int getId() {

        return id;
    }

    public Integer getNumeroPub() {

        return numeroPub;
    }

    public Integer getNumeroPedidoInternacional() {

        return numeroPedidoInternacional;
    }

    public Integer getDataPublicacao() {

        return dataPublicacao;
    }

    public String getRequerentes() {

        return requerentes;
    }

    public String getTitulo() {

        return titulo;
    }
}
