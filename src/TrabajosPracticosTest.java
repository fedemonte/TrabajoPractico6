import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.CarritoCompras;
import entities.Producto;

class TrabajosPracticosTest {

	CarritoCompras carrito = new CarritoCompras();
	Producto p1 = new Producto("IPhone","IPhone 12 Pro",true,1469.00);
	Producto p3 = new Producto("Xiaomi","Redmi Note 8",false,629.00);
	Producto p2 = new Producto("IPhone", "IPhone SE",true, 589.00);
	Producto p4 = new Producto("Samsung","Samsung Galaxy M12s",true, 679.00);
	
	@Test
	public void test_minimo_un_producto_asociado_al_carrito(){
	   carrito.agregarProducto(p1);
	   int res_obtenido = carrito.verCantidadDeProductos();
	   int res_esperado = 1;
	   assertEquals(res_esperado,res_obtenido);
	}

	@Test
	public void test_obtener_descripcion_producto_agregado_al_carrito(){
	   String res_obtenido = carrito.obtenerDescripcionProductos(p1);
	   String res_esperado = "IPhone 12 Pro";
	   assertEquals(res_esperado,res_obtenido);
	}


}
