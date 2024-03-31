package Pedidos;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {
        Estado est1 = new Estado(1, "Minas Gerais");

        Cidade c1 = new Cidade(1, "Uberlândia");
            c1.addEstado(est1);

        Endereco e1 = new Endereco(1, "Rua Flores", "300", "Apto 303", "Jardim", "38220834");
            e1.addCidade(c1);
        Endereco e2 = new Endereco(2, "Lovradouro Matos", "105", "Sala 800", "Centro", "38777012");
            e2.addCidade(c1);

        Telefone t1 = new Telefone("27363323");
        Telefone t2 = new Telefone("96838393");

        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        Produto p1 = new Produto(1, "Computador", 2000.00, cat1);
        Produto p2 = new Produto(2, "Impressora", 800.00, cat1);
            p2.addCategoria(cat2);
        Produto p3 = new Produto(3, "Mouse", 80.00, cat1);

        ItemPedido ip1 = new ItemPedido(200.00, 1, 2000.00, p1);
        ItemPedido ip2 = new ItemPedido(0.00, 2, 80.00, p3);
        ItemPedido ip3 = new ItemPedido(100.00, 1, 800.00, p2);

        Pagamento pagto1 = new Pagamento(1, EstadoPagamento.QUITADO, 6);
        Pagamento pagto2 = new Pagamento(2, EstadoPagamento.PENDENTE, LocalDate.of(2017,10, 17), LocalDate.of(2017, 11, 18));

        Pedido ped1 = new Pedido(1, LocalDate.now(), pagto1, e1);
            ped1.addItemPedido(ip1);
            ped1.addItemPedido(ip2);
        Pedido ped2 = new Pedido(2, LocalDate.now(), pagto2, e2);
            ped2.addItemPedido(ip3);

        Cliente cli1 = new Cliente(1, "Maria Silva", "maria@gmail.com", "37362187381", TipoCliente.PESSOAFISICA);
            cli1.addTelefone(t1);
            cli1.addTelefone(t2);
            cli1.addPedido(ped1);
            cli1.addPedido(ped2);

        System.out.println(cli1);
    }
}
