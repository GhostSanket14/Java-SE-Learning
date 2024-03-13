package OOPs2_abstractAndInterfaces;

public interface testing {

	public void show();
	
	default void helo() {
		System.out.println("Hello from interface");
	}
	
}