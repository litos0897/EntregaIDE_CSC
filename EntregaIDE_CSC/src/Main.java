public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Pizza Margarita", 12.50, "Comida");
        Producto p2 = new Producto("Agua Mineral", 2.00, "Bebida");
        Producto p3 = new Producto("Tarta de Queso", 5.00, "Postre");

        Cliente cliente1 = new Cliente("Ana García", "ana@email.com", "600123456");
        Repartidor repartidor1 = new Repartidor("Carlos López", "carlos@email.com", "600654321", "Zona Centro");
        Repartidor repartidor2 = new Repartidor("María Torres", "maria@email.com", "600987654", "Zona Sur");

        Pedido pedido1 = new Pedido(1, cliente1);
        System.out.println("-> Pedido 1 creado para el cliente: " + cliente1.getNombre());

        System.out.println("\n-- Prueba: Asignar repartidor a pedido vacío --");
        pedido1.asignarRepartidor(repartidor1); 
        
        System.out.println("\n-- Añadiendo productos al pedido 1 --");
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        
        pedido1.agregarProducto(p1); 

        System.out.println("Total a pagar del pedido 1: " + pedido1.calcularTotal() + "€");

        System.out.println("\n-- Asignando Repartidor --");
        pedido1.asignarRepartidor(repartidor1);

        System.out.println("\n-- Prueba: Crear pedido 2 y asignar repartidor ocupado --");
        Pedido pedido2 = new Pedido(2, cliente1);
        pedido2.agregarProducto(p3);
        
        pedido2.asignarRepartidor(repartidor1); 
        
        pedido2.asignarRepartidor(repartidor2);

        System.out.println("\n-- Entregando Pedido 1 --");
        pedido1.entregarPedido();


        System.out.println("\n-- Prueba: Reasignar repartidor tras finalizar entrega --");
        Pedido pedido3 = new Pedido(3, cliente1);
        pedido3.agregarProducto(p1);
        pedido3.asignarRepartidor(repartidor1); 
        
    }
}