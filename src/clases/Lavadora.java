package clases;

public class Lavadora extends Electrodomestico{

	private double precio;
	private boolean aguaCaliente;
	
	
	
	public Lavadora( String marca, double potencia) {
		super(marca, marca, potencia);
		aguaCaliente=false;
		 
	}
	
	public Lavadora( String marca,double precio, double potencia,boolean aguaCaliente) {
		super(marca, marca, potencia);
		this.precio=precio;
		this.aguaCaliente=aguaCaliente;
	}

	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
	public double getConsumo(int horas) {
		double consumo=horas*potencia;
		return consumo;
	}
	
	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean getAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}
	
	public double getCosteConsumo(int horas,double costeHora) {
		costeHora=0.132;
		double costetotal;
		costetotal=horas*costeHora;
		return costetotal;
	}
	
	
	public String toString() {
		return "Lavadora con marca "+getMarca()+",una potencia de "+getPotencia()+" kw con el agua "+getAguaCaliente()+" con un consumo de "+getConsumo(3)+" con precio de "+getPrecio()+" euros";
		}

}
