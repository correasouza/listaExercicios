package Pedidos;

import java.time.LocalDate;

public class Pagamento {
    private Integer id;
    private EstadoPagamento estadoDoPagamento;
    private Integer numeroDeParcelas;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private EstadoPagamento estadoPagamento;

    public Pagamento(Integer id, EstadoPagamento estadoDoPagamento, Integer numeroDeParcelas) {
        this.id = id;
        this.estadoDoPagamento = estadoDoPagamento;
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Pagamento(Integer id, EstadoPagamento estadoDoPagamento, LocalDate dataVencimento, LocalDate dataPagamento) {
        this.id = id;
        this.estadoDoPagamento = estadoDoPagamento;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamento getEstadoDoPagamento() {
        return estadoDoPagamento;
    }

    public void setEstadoDoPagamento(EstadoPagamento estadoDoPagamento) {
        this.estadoDoPagamento = estadoDoPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", estadoDoPagamento=" + estadoDoPagamento +
                ", numeroDeParcelas=" + numeroDeParcelas +
                ", dataVencimento=" + dataVencimento +
                ", dataPagamento=" + dataPagamento +
                ", estadoPagamento=" + estadoPagamento +
                '}';
    }
}
