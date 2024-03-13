package OOPs1_polymorphism;

// If a class has multiple methods having same name 
// but parameters of the method should be different is known as Method Overloading.

public class mehtodOverloading { // Compile time polymorphism
	void add(int a, int b){
        System.out.println("sum a,b="+(a+b));
    } 
	 
    void  add(double x, double b){ // If i make these 'double' into 'int' it will give error. 
        System.out.println("sum x,b="+(x+b)); 
    } // different parameter name also dont make any difference. Its the number, order and type of parameter that matters.
    
    void  add(int y, double b){ 
        System.out.println("sum y,b="+(y+b)); 
    }
    // above and below only order has changed, rest is same.
    void  add(double b, int y){  //  as you can see changing order of parameter also allow to create new constructor.
        System.out.println("sum b,y="+(y+b)); 
    }
    
    // We can not define more than one method with the same name, Order, and type of the arguments. 
    // return type dont affect the overloading. As it is the response. Overloading works on request(parameters).
    
    public static void main(String[] args){ 
      mehtodOverloading ad=new mehtodOverloading();
      ad.add(5,6);
      ad.add(5.4,7.2);
      ad.add(5,7.2);
      ad.add(2.5,8);
}
}