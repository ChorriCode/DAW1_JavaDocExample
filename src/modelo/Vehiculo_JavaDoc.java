package modelo;

import java.time.LocalDate;

/**
 * Clase Vehiculo_JavaDoc
 * esta clase nos permite crear objetos Vehiculo_JavaDoc que usaremos para
 * identificar los difetentes vehiculos que estarán relacionados con comentarios
 * que seran insertados en un foro sobre venta de coches a particulares
 * @author Javier
 * @version 1.0.0
 *
 */
public class Vehiculo_JavaDoc {
	
	// ******** ATRIBUTOS ********
	/**
	 * matricula String en formato 4 digitos numericos seguido de guión y tres letras mayúscylas
	 * para identificar la matrícula del coche
	 */
	private String matricula;
	/**
	 * marca String inferior a 15 caractéres alfanuméricos que identifica la marca del coche
	 */
	private String marca;
	/**
	 * modelo String inferior a 15 caractéres alfanuméricos que identifica el modelo relacionado con la marca del coche
	 */
	private String modelo;
	
	
	// ******** CONSTRUCTOR ********
	
	/**
	 * Constructor de la clase Vehiculo_JavaDoc que necesita tres parámetros
	 * @param matricula String matrícula del vehículo definida en la seccón de atributos
	 * @param marca String marca del vehículo definida en la seccón de atributos
	 * @param modelo String modelo del vehículo definida en la seccón de atributos
	 */
	public Vehiculo_JavaDoc(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	
	// ******** GETTERS Y SETTERS ********
	
	/**
	 * con este método accedemos al valor del atributo de matricula
	 * @return devuelve String matricula {@link #marca atributo matricula}
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * con este método accedemos al valor del atributo de marca
	 * @return devuelve String marca {@link #marca atributo marca}
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * con este método accedemos al valor del atributo de modelo
	 * @return devuelve String modelo {@link #marca atributo modelo}
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * asignamos un nuevo valor al atributo matricula
	 * @param matricula String nuevo calor para el atributo matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * asignamos un nuevo valor al atributo marca
	 * @param marca String nuevo calor para el atributo marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * asignamos un nuevo valor al atributo modelo
	 * @param modelo String nuevo calor para el modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// ******** OTROS MÉTODOS ********

	/**
	 *  Método toString() que nos permite mostrar los atributos de esta clase
	 */ 
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	/**
	 * Este método crearComentarioVehiculo(String comentario) nos devuelve una cadena identificando el coche y el comentario que deseamos adjuntar
	 * @param comentario String comentario que deseamos adjuntar a los datos de salida
	 * @return Este método nos devuelve una cadena identificando el coche y el comentario que deseamos adjuntar
	 * @see Vehiculo_JavaDoc#getMarca() getMarca() este método devuelve sólo el valor del atributo marca.
	 * 
	 */
	public String crearComentarioVehiculo(String comentario) {
		LocalDate fechaComentario = LocalDate.now();
		String nombreCompleto = "Fecha del comentario: " + fechaComentario + "\n" + this.marca + " " + this.modelo + " matrícula: " + this.matricula + "\n";
		String resultado = nombreCompleto + comentario;
		return resultado;
	}

}
