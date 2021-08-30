package edu.eci.arsw.math;

public class PiThread extends Thread{
	private int numeroInicial, cantidad;
	private byte[] respuesta;
	
	/**
	 * Constructor
	 * @param numA
	 * @param numB
	 */
	public PiThread(int numA, int numB){
		numeroInicial = numA;
		cantidad = numB;
	}
	
	public void run(){
		respuesta = PiDigits.getDigits(numeroInicial, cantidad);
	}
	
	/**
	 * Metodo encargado de retornar el numero generado por PoDigits
	 * @return byte[]
	 */
	public byte[] traerResultado(){
		return respuesta;
	}

}
