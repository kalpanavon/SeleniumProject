package sessionthree;

public class ExceptionDemo {
	public static void main(String s[]){
		int a= 20;
		int b= 0;
		try{
			int result = a/b;
			System.out.println(result);
		}catch(Exception e){
			System.out.println("Check input values......Possible that devisor may be zero");
		}
		System.out.println("continue with logic");
	}

}
