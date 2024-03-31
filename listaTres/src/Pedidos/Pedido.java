package Pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private LocalDate instante;
    private ItemPedido itemPedido;
    private Pagamento pagamento;
    private Endereco endereco;
    private List <ItemPedido> itemPedidos = new ArrayList<>();

    public Pedido(Integer id, LocalDate instante, Pagamento pagamento, Endereco endereco) {
        this.id = id;
        this.instante = instante;
        this.pagamento = pagamento;
        this.endereco = endereco;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getInstante() {
        return instante;
    }

    public void setInstante(LocalDate instante) {
        this.instante = instante;
    }

    public void addItemPedido(ItemPedido i) {
        itemPedidos.add(i);
    }
    public void removeItemPedido(ItemPedido i) {
        itemPedidos.remove(i);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", instante=" + instante +
                ", itemPedido=" + itemPedido +
                ", pagamento=" + pagamento +
                ", endereco=" + endereco +
                ", itemPedidos=" + itemPedidos +
                '}';
    }
}

