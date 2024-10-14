package arrays;

public class VarArgsDemo1 {

	public static void main(String[] args) {
		
		Sum obj=new Sum();
		
		obj.add(10, 20);
		
		obj.add(10,20, 30);
		
		obj.add(10,20, 30,40,50,60,70);
		
		obj.add(10,20, 30,40,50,60,70,10,20, 30,40,50,60,70);

		obj.add();
		
		//double[] d={10.33,20.22,40.11};
		
		obj.add(10.33,20.22,40.11);
	}

}
