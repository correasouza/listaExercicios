package Pedidos;

import Pedidos.Cidade;

public class Estado {
    private Integer id;
    private String name;

    public Estado(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}