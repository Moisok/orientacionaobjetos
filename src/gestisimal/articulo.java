/*para llevar el control de los artículos de un almacén. 
 De cada artículo se debe saber el código, la descripción, el precio de compra, 
 el precio de venta y el stock (número de unidades)
 */

package gestisimal;

public class articulo {
	
	/*Variables*/
	
	private String codigo = "LIBRE";
	
	private String descripcion;
	
	private double precioDeCompra;
	
	private double precioDeVenta;
	
	private int stock;
	
	
	/*Getters*/
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getprecioDeCompra () {
		return precioDeCompra;
	}
	
	public double getprecioDeVenta() {
		return precioDeVenta;
	}
	
	public int getStock() {
		return stock;
	}
	
	/*Setters*/
	
	public String setCodigo (String codigo) {
		this.codigo=codigo;
		return codigo;
	}
	
	public String setDescripcion(String descripcion) {
		this.descripcion=descripcion;
		return descripcion;
	}
	
	public double setprecioDeCompra (double precioDeCompra) {
		this.precioDeCompra=precioDeCompra;
		return precioDeCompra;
	}
	
	public double setprecioDeVenta(double precioDeVenta) {
		this.precioDeVenta=precioDeVenta;
		return precioDeVenta;
	}
	
	public int setStock (int stock) {
		this.stock=stock;
		return stock;	
	}
	
	

	/*Cadena de string*/

	public String toString() {
	String cadena =
	"-------------------------------------------------";
	cadena += "\nCodigo: " + this.codigo;
	cadena += "\nDescripcion: " + this.descripcion;
	cadena += "\nPrecio de compra: " + this.precioDeCompra;
	cadena += "\nPrecio de venta: " + this.precioDeVenta;
	cadena += "\nStock: " + this.stock + " unidades";
	cadena += "\n-------------------------------------------------";
	return cadena;
	}

	
}
