package Ejercicio5_4;

public class Articulo {
	
	private String nombre;
	
	private int precio;
	
	private double iva;
	
	private final double ivatotal = 0.21;
	
	private final double ivareducido = 0.10;
	
	private final double ivasuperreducido = 0.4;
	
	private int stock;
	
	private int opcion;
	
	public Articulo (String nombre, int precio, int iva, int stock, int opcion) {
	
		this.nombre=nombre;
		this.precio=precio;
		this.iva=iva;
		this.stock=stock;
		
		if (opcion == 1) {
			this.iva=ivatotal;
		}
		if (opcion == 2) {
			this.iva=ivareducido;
		}
		if (opcion == 3) {
			this.iva=ivasuperreducido;
		}
	
	}
	
	/*contruccion de getter*/
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public double getIva() {
		return iva;
	}
	
	public int getStock() {
		return stock;
	}
	
	/*construccion de los setter*/
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public void setPrecio (int precio) {
		this.precio=precio;
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
	
	public boolean ventas (int ventas1) {
		
		boolean hay = false;
		
		if (ventas1 <= this.stock) {
			hay = true;
		}
		
		else {
			hay = false;
		}
		
			return hay;
	}
	
	/*Restar stock*/
	public void restar (int ventas) {
		this.stock=this.stock-ventas;
	}
	
	/*Almacenar articulo (Setter cuadriple)*/
	public void actualizar (String nombre, int precio, int iva1, int stock) {
		this.nombre=nombre;
		this.precio=precio;
		iva1=iva1;
		this.stock=stock;
	}
}	


