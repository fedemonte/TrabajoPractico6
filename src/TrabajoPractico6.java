import entities.CarritoCompras;
import entities.Producto;

public class TrabajoPractico6 {

	public TrabajoPractico6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		CarritoCompras carrito = new CarritoCompras();
		Producto p1 = new Producto("IPhone","IPhone 12 Pro",true,1469.00);
		Producto p3 = new Producto("Xiaomi","Redmi Note 8",false,629.00);
		Producto p2 = new Producto("IPhone", "IPhone SE",true, 589.00);
		Producto p4 = new Producto("Samsung","Samsung Galaxy M12s",true, 679.00);
		
		carrito.agregarProducto(p1);
		System.out.println(carrito.verCantidadDeProductos());
		System.out.println(carrito.obtenerDescripcionProductos(p1));
	}

}
