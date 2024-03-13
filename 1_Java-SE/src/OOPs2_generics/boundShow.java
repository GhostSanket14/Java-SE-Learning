package OOPs2_generics;

public class boundShow {

	public static <T extends genericExtend> void showData(T data){	
		data.print(14); // Above extend allow us to use this print.
	}
	
	public static void main(String[] args) {
		// EXPLOLRE in deep later. It is only fuzzy concept in my MIND.
		// Theory is good in book.
		boundShow b=new boundShow();
//		b.showData(1);
	}
}