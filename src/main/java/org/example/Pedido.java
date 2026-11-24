package org.example;

public class Pedido implements Cloneable {
    private int numeroPedido;
    private String nomeCliente;
    private Endereco endereco;
    private String formaPagamento;

    public Pedido(int numeroPedido, String nomeCliente, Endereco endereco, String formaPagamento) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.formaPagamento = formaPagamento;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public Pedido clone() throws CloneNotSupportedException {
        Pedido pedidoClone = (Pedido) super.clone();
        pedidoClone.endereco = (Endereco) pedidoClone.endereco.clone();
        return pedidoClone;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", endereco=" + endereco +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}
