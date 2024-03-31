package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private String name;
    private String email;
    private String cpfOrCnpj;
    private TipoCliente tipoCliente;
    private List <Telefone> telefones = new ArrayList<>();
    private List <Pedido> pedidos = new ArrayList<>();

    public Cliente(Integer id, String name, String email, String cpfOrCnpj, TipoCliente tipoCliente) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpfOrCnpj = cpfOrCnpj;
        this.tipoCliente = tipoCliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }
    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public void addTelefone(Telefone t) {
        telefones.add(t);
    }
    public void removeTelefone(Telefone t) {
        telefones.add(t);
    }

    public void addPedido(Pedido p) {
        pedidos.add(p);
    }
    public void removePedido(Pedido p) {
        pedidos.remove(p);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", email= '" + email + '\'' +
                ", cpfOrCnpj= '" + cpfOrCnpj + '\'' +
                ", tipoCliente= " + tipoCliente +
                ", telefones= " + telefones +
                ", pedidos= " + pedidos +
                '}';
    }
}