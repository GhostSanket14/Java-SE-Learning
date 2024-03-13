package OOPs2_generics;

public class boundAction implements genericExtend {

	public <T>void print(T data) {
		System.out.println("Hello"+data);
	}
}