package ar.edu.unlam.pb2;

public class Venta {
	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Integer nroDeVenta;
	
	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
				
	}
	
	public Venta(Integer nroDeVenta, Integer dniDelComprador, String nombreDelComprador) {
		this.nroDeVenta = nroDeVenta;
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
				
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public Integer getNroDeVenta() {
		return nroDeVenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDeVenta == null) ? 0 : nroDeVenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (nroDeVenta == null) {
			if (other.nroDeVenta != null)
				return false;
		} else if (!nroDeVenta.equals(other.nroDeVenta))
			return false;
		return true;
	}

}
