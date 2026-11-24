import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Pedido pedido = new Pedido(500, "cliente", new Endereco("itamar franco", 250), "pix");

        Pedido pedidoClone = pedido.clone();
        pedidoClone.setNumeroPedido(501);
        pedidoClone.setNomeCliente("cliente clone");
        pedidoClone.getEndereco().setNumero(300);

        assertEquals("Pedido{numeroPedido=500, nomeCliente='cliente', endereco=Endereco{rua='itamar franco', numero=250}, formaPagamento='pix'}", pedido.toString());
        assertEquals("Pedido{numeroPedido=501, nomeCliente='cliente clone', endereco=Endereco{rua='itamar franco', numero=300}, formaPagamento='pix'}", pedidoClone.toString());
    }
}
