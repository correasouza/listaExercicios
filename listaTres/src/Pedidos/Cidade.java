package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private Integer id;
    private String name;
    private Estado estado;
    private List <Estado> estados = new ArrayList<>();

    public Cidade(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getEstados() {
        return estados;
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

    public void addEstado(Estado e) {
        estados.add(e);
    }

    public void removeEstado(Estado e) {
        estados.remove(e);
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", estado=" + estado +
                ", estados=" + estados +
                '}';
    }
}