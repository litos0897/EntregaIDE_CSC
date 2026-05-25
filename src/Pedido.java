import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Pedido {
private int id;

private Date fecha;
private EstadoPedido estado;
private Cliente cliente;
private Repartidor repartidor;
private List<Producto> productos;
public Pedido(int id, Cliente cliente) {
this.id = id;
this.fecha = new Date();
this.estado = EstadoPedido.PENDIENTE;
this.cliente = cliente;
this.productos = new ArrayList<>();
cliente.agregarPedido(this);
}
public void agregarProducto(Producto p) {
if (!productos.contains(p)) {
productos.add(p);
} else {
System.out.println("Error: El producto " + p.getNombre() + " ya está en el pedido.");
}
}
public double calcularTotal() {
return productos.stream().mapToDouble(Producto::getPrecio).sum();
}
public void asignarRepartidor(Repartidor r) {
if (productos.isEmpty()) {
System.out.println("Error: No se puede asignar repartidor a un pedido sin productos.");
return;
}
if (r.isDisponible()) {
this.repartidor = r;
this.estado = EstadoPedido.EN_REPARTO;
r.setEstado(EstadoRepartidor.OCUPADO);
System.out.println("Pedido " + id + " asignado a " + r.getNombre());
} else {
System.out.println("Error: El repartidor no está disponible.");
}
}
public void entregarPedido() {
if (this.estado != EstadoPedido.EN_REPARTO) {
System.out.println("Error: No se puede entregar un pedido que no está en reparto.");
return;
}
this.estado = EstadoPedido.ENTREGADO;
if (this.repartidor != null) {
this.repartidor.setEstado(EstadoRepartidor.DISPONIBLE);

}
System.out.println("Pedido " + id + " entregado correctamente.");
}

public Date getFecha() {
    return fecha;
}

public Cliente getCliente() {
    return cliente;

}
}