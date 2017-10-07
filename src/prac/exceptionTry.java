package prac;

public class exceptionTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		int ans=0;
		
		try{
			exceptionTry etry=new exceptionTry();
			etry.sum(a, b);		
			System.out.println("Inside try "+ans);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("outside try "+ans);

	}
	
	public int sum(int a,int b){
		
		try{
			int ans=a/b;
			return ans;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		finally{
			return 0;
		}
		//return 0;
	}

}
