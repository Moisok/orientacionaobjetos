package Ejercicio4_4;

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
	
	/*Nuevos metodos*/
	
	/*Informacion*/
	public void Info() {
		System.out.println(" ");
		System.out.println("Nombre: " + this.nombre);
		System.out.println(" ");
		System.out.println("Precio sin iva: " + this.precio);
		System.out.println(" ");
		System.out.println("Cantidad en almacen:" + this.stock);
		System.out.println(" ");
	}
	
	
	/*precio final*/
	public double precio() {
		double iva = this.precio * 21 / 100;
		double pfinal= this.precio + iva;
		return pfinal;
	}
	
	/*Descuento*/
	public double descuento() {
		double precio1 = precio;
		double descuento = precio1 * 15 / 100;
		return descuento;
	}
	
	/*Ventas*/
	
	public int ventas (int ventas1) {
		
		int hay = 0;
		
		int x = this.stock;
		
		if (ventas1 <= x) {
			hay = 1;
			this.stock = x - ventas1;
		}
		
		else {
			hay = 0;
		}
		
			return hay;
	}
	
	/*Almacenar*/
	public void almacenar(int almacenar) {
		this.stock=almacenar;
	}
}


