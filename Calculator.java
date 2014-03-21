public class Calculator{
	static{
		System.loadLibrary("operations");
	}

	public native int ADDNUMBERS(int x, int y);
	public native int SUBNUMBERS(int x, int y);
	public native int MULNUMBERS(int x, int y);
	public native int DIVNUMBERS(int x, int y);

	public Calculator(){};
}
