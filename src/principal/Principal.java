package principal;

import modelo.Vehiculo;


public class Principal {

	public static void main(String[] args) {

		Vehiculo miVehiculo = new Vehiculo("5455-GFC", "SEAT", "IBIZA");
		String comentario = "En buenas condiones, para más información llama al 606 077 999";
		String comentarioConVehiculo =miVehiculo.crearComentarioVehiculo(comentario);
		System.out.println(comentarioConVehiculo);
	

	}

}
