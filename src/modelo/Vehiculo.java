package modelo;

import java.time.LocalDate;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public String crearComentarioVehiculo(String comentario) {
		LocalDate fechaComentario = LocalDate.now();
		String nombreCompleto = "Fecha del comentario: " + fechaComentario + "\n" + this.marca + " " + this.modelo + " matrícula: " + this.matricula + "\n";
		String resultado = nombreCompleto + comentario;
		return resultado;
	}


}
