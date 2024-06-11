import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ProductoServicio productoServicio;
    private ArchivoServicio archivoServicio;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.productoServicio = new ProductoServicio();
        this.archivoServicio = new ArchivoServicio();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("1. Listar Producto");
            System.out.println("2. Editar Datos");
            System.out.println("3. Importar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    listarProductos();
                    break;
                case 2:
                    editarProducto();
                    break;
                case 3:
                    importarDatos();
                    break;
                case 4:
                    System.out.println("Abandonando el sistema de clientes...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private void listarProductos() {
        productoServicio.listarProductos();
    }

    private void editarProducto() {
        System.out.print("Ingrese el código del producto a editar: ");
        String codigo = scanner.nextLine();
        Producto producto = productoServicio.buscarProductoPorCodigo(codigo);
        if (producto != null) {
            System.out.println("Producto encontrado: ");
            System.out.println(producto);
            System.out.print("Ingrese el campo a editar (articulo, precio, descripcion, talla, marca, color): ");
            String campo = scanner.nextLine();
            System.out.print("Ingrese el nuevo valor: ");
            String nuevoValor = scanner.nextLine();
            productoServicio.editarProducto(codigo, campo, nuevoValor);
            System.out.println("Producto actualizado: ");
            System.out.println(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void importarDatos() {
        System.out.print("Ingrese la ruta del archivo ProductosImportados.csv: ");
        String ruta = scanner.nextLine();
        archivoServicio.cargarDatos(ruta, productoServicio);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
