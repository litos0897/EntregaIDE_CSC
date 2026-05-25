import java.util.ArrayList;
import java.util.List;
public class Cliente extends Usuario {
private List <Pedido>pedidos;
public Cliente(String nombre, String email, String telefono) {
super(nombre, email, telefono);
this.pedidos = new ArrayList<>();
}
public void agregarPedido(Pedido p) {
this.pedidos.add(p);
}
}