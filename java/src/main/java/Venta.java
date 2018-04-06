public class Venta {
    private Integer precioVenta;
    private Producto producto;

//esto es un comentario    
    public Venta(Producto producto, int precioVenta) {
        this.precioVenta = precioVenta;
        this.producto = producto;
    }
    public int rentabilidad() {
        return this.producto.diferenciaEntreParamCosto(this.precioVenta);
    }
}
