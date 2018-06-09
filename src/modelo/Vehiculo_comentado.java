package modelo;

import java.time.LocalDate;

public class Vehiculo_comentado {
	
	// ******** ATRIBUTOS ********
	
	private String matricula;
	private String marca;
	private String modelo;
	
	
	// ******** CONSTRUCTOR ********
	
	public Vehiculo_comentado(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	
	// ******** GETTERS Y SETTERS ********
	
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

	// ******** OTROS MÉTODOS ********
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	// Este método nos devuelve una cadena identificando el coche y el comentario que deseamos adjuntar
	public String crearComentarioVehiculo(String comentario) {
		LocalDate fechaComentario = LocalDate.now();
		String nombreCompleto = "Fecha del comentario: " + fechaComentario + "\n" + this.marca + " " + this.modelo + " matrícula: " + this.matricula + "\n";
		String resultado = nombreCompleto + comentario;
		return resultado;
	}

}
