package gb;

public class GarbageCollector {
protected void finalize() throws Throwable {
	System.out.println("collected");
}
	
	public static void main(String[] args) {
		
		for (int i = 0; i >=0; i++) {
			new GarbageCollector();
			
			System.out.println(i);
		}
	
	}

}
