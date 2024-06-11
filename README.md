Descripción del Diseño y Desarrollo
Clase Producto
La clase Producto representa un producto en la tienda con los siguientes atributos:

String articulo
String precio
String descripcion
String codigo
String talla
String marca
String color
Implementaciones:

Constructor para inicializar los atributos.
Getters y setters para acceder y modificar los valores.
Método toString() para mostrar la información del producto como texto.
Clase ProductoServicio
La clase ProductoServicio maneja una lista de productos usando un ArrayList:

ArrayList<Producto> listaProductos
Métodos:

agregarProducto: Agrega un producto a la lista.
buscarProductoPorCodigo: Busca un producto por su código.
editarProducto: Modifica cualquier atributo de un producto identificado por su código.
listarProductos: Imprime la información de todos los productos.
Clase ArchivoServicio
La clase ArchivoServicio importa datos desde un archivo CSV:

cargarDatos: Lee el archivo CSV, crea objetos Producto y los agrega a la lista en ProductoServicio.
Clase Menu
La clase Menu gestiona la interfaz de usuario:

Usa Scanner para recibir entradas del usuario.
Presenta opciones para listar productos, editar productos, importar datos desde un archivo CSV, y salir.
Métodos para manejar cada opción del menú:
listarProductos
editarProducto
importarDatos
mostrarMenu: Bucle principal que muestra el menú y maneja las selecciones.
Clase Utilidad
La clase Utilidad proporciona métodos auxiliares:

limpiarPantalla: Limpia la pantalla, compatible con Windows y Unix.
tiempoEspera: Pausa la ejecución por un tiempo especificado.
Ejemplo de Uso
En el método main de la clase Menu, se instancia un objeto Menu y se llama a su método mostrarMenu para iniciar la interacción con el usuario. Este diseño modular facilita la gestión y ampliación del sistema.
