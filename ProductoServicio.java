import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void editarProducto(String codigo, String campo, String nuevoValor) {
        Producto producto = buscarProductoPorCodigo(codigo);
        if (producto != null) {
            switch (campo.toLowerCase()) {
                case "articulo":
                    producto.setArticulo(nuevoValor);
                    break;
                case "precio":
                    producto.setPrecio(nuevoValor);
                    break;
                case "descripcion":
                    producto.setDescripcion(nuevoValor);
                    break;
                case "talla":
                    producto.setTalla(nuevoValor);
                    break;
                case "marca":
                    producto.setMarca(nuevoValor);
                    break;
                case "color":
                    producto.setColor(nuevoValor);
                    break;
            }
        }
    }

    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
}
