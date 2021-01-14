package Ejercicio3_4;

public class Articulo {
	
	private String nombre;
	
	private double precio;
	
	private int iva;
	
	private int stock;
	
	public Articulo (String nombre, double precio, int iva, int stock) {
		
		this.nombre=nombre;
		
		this.precio=precio;
		
		this.iva=iva;
		
		this.stock=stock;
		
	}
	
	/*contruccion de getter*/
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public int getIva() {
		return iva;
	}
	
	public int getStock() {
		return stock;
	}
	
	/*construccion de los setter*/
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public void setPrecio (double precio) {
		this.precio=precio;
	}
	
	public void setIva(int iva){
		this.iva=iva;
	}
	
	public void setStock (int stock) {
		this.stock=stock;
	}

}

