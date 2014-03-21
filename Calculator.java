/*
	Clase Calculator
*/
public class Calculator{
	
	//Se carga la librería operations.dll
	//Esta se genera compilando los archivos Calculator.c y Calculator.h
	static{
		System.loadLibrary("operations");
	}

	//Funciones nativas, que son programadas en C, pero se llaman
	//mediante esta función
	public native int ADDNUMBERS(int x, int y);
	public native int SUBNUMBERS(int x, int y);
	public native int MULNUMBERS(int x, int y);
	public native int DIVNUMBERS(int x, int y);

	//Constructor de la clase Calculator
	public Calculator(){};
}
