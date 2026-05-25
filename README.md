**Ejecución y Pruebas**
La clase Main.java incluye un flujo de prueba completo que demuestra el correcto funcionamiento del sistema y el control de excepciones lógicas por consola. Al ejecutar el proyecto, se validan los siguientes escenarios:

1. Creación de clientes, repartidores y productos.

2. Intento de asignación de un repartidor a un pedido vacío (genera error controlado).

3. Añadido de productos al pedido y control de duplicados.

4. Cálculo automático del total del pedido.

5. Asignación correcta de un repartidor disponible.

6. Intento de asignación de un repartidor que ya se encuentra ocupado (genera error controlado).

7. Entrega de pedido exitosa con liberación del repartidor a estado disponible.

**Pasos para ejecutar en Eclipse:**
1. Importar el proyecto en tu Workspace de Eclipse (File > Import > Existing Projects into Workspace).

2. Asegurarse de que el proyecto se llame EntregaIDE_XXX.

3. Hacer clic derecho sobre Main.java y seleccionar Run As > Java Application.

**Diagrama de Clases**
El diagrama de clases ha sido diseñado para reflejar con total precisión la estructura del código implementado. Muestra las relaciones de herencia entre Usuario y sus subclases, la agregación de Producto en Pedido, y las dependencias con los tipos enumerados. Puedes visualizarlo y editarlo abriendo el archivo .drawio en diagrams.net
