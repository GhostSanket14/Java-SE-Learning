package OOPs2_generics;

public class two_usingGeneric {

	public static void main(String[] args) {
		three_printPassedData<Integer, Integer> a=new three_printPassedData<>(); // We are basically using single class for multiple data types.
		a.setData(14);
		System.out.println(a.getData());
		
		a.printt(11);

		int x=1;
		int y=2;
		int z=3;
		three_printPassedData<three_printPassedData<Integer, Integer>, Integer> ppd=new three_printPassedData<>();
			// Doing this kind of operation is also possible. below is idea on how to access this type.
		// to access data we have to do, ( ppd.getData().getData(), ppd.getData().getSecondData())
		// 								 ( ppd.getSecondData() )
	}
}