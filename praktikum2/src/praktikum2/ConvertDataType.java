package praktikum2;

public class ConvertDataType {
	static short methodOne(long l) {
		int i = (int) l;
		System.out.println("nilai i " + i);
		return (short)i;
	}
	
	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		System.out.println(f);
		long fn = (long)f;
		System.out.println(fn);
		//byte b = (byte) methodOne((long)f);
		byte b = (byte) methodOne(fn);
		System.out.println(b);
	}
}
