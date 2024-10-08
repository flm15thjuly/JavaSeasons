package flowcontrolstatements;

public class BreakDemo2 {

	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			
			if(j==3)
			{
				break;
			
			}
			
			System.out.println(i+"  "+j);
			
			}
		}

	}

}
