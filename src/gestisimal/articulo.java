/*para llevar el control de los artículos de un almacén. 
 De cada artículo se debe saber el código, la descripción, el precio de compra, 
 el precio de venta y el stock (número de unidades)
 */

package gestisimal;

public class articulo {
	
	/*Variables*/
	
	private int codigo;
	
	private String descripcion;
	
	private double pcompra;
	
	private double pventa;
	
	private int stock;
	
	
	/*Constructor*/
	
	public articulo (int codigo, String descripcion, double pcompra, double pventa, int stock) {
		
		this.codigo= codigo;
		
		this.descripcion = descripcion;
		
		this.pcompra = pcompra;
		
		this.pventa = pventa;
		
		this.stock=stock;
		
	}
	
	/*Getters*/
	
	public int getCodido() {
		return codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPcompra () {
		return pcompra;
	}
	
	public double getPventa() {
		return pventa;
	}
	
	public int getStock() {
		return stock;
	}
	
	/*Setters*/
	
	public int setCodigo (int codigo) {
		this.codigo=codigo;
		return codigo;
	}
	
	public String setDescripcion(String descripcion) {
		this.descripcion=descripcion;
		return descripcion;
	}
	
	public double setPcompra (double pcompra) {
		this.pcompra=pcompra;
		return pcompra;
	}
	
	public double setPventa(double pventa) {
		this.pventa=pventa;
		return pventa;
	}
	
	public int setStock (int stock) {
		this.stock=stock;
		return stock;	
	}
	
	
}
