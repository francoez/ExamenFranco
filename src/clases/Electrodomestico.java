package clases;

public class Electrodomestico {
	 String tipo;
	 String marca;
	double potencia;
	
	public Electrodomestico(String tipo, String marca, double potencia) {
	this.tipo=tipo;
	this.marca=marca;
	this.potencia=potencia;
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
		return horas*potencia;
	}
	
	
	public double getCosteConsumo(int horas,double costeHora) {
		costeHora=0.132;
		double costetotal;
		costetotal=horas*costeHora;
		return costetotal;
	}
	
	
	
	
	public String toString() {
		return "Electrodomestico de tipo "+getTipo()+" con marca "+getMarca()+" y una potencia de "+getPotencia()+" kw";
		}
	

}
