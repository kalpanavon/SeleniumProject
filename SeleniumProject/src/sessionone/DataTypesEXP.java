package sessionone;

public class DataTypesEXP {
	public static void main(String a[]){
		//byte
		byte b1 =127;//128
		byte b2=-128;//-129		
		System.out.println(b1);
		System.out.println(b2);
		
		//short
		 short s1 = -32768 ;//-32769
         short s2 = 32767;//32768
         
        System.out.println("Value of short variable b1 is :" + s1);
        System.out.println("Value of short variable b1 is :" + s2);
        
        //double
        double d1 = 5.35;
        double d2 = 5.34;
        int i1 = Double.compare(d1,d2);
       
        if(i1 > 0){
          System.out.println("First is grater");
        }else if(i1 < 0){
          System.out.println("Second is grater");
        }else{
          System.out.println("Both are equal");
        }
       
        
        //float
        float f1 = 5.35f;
        float f2 = 5.34f;
        int i2 = Float.compare(f1,f2);
       
        if(i2 > 0){
          System.out.println("First is grater");
        }else if(i2 < 0){
          System.out.println("Second is grater");
        }else{
          System.out.println("Both are equal");
        }
        System.out.println(f1==f2);
        
        //double vs float
        float f = 1.23456789012345678901234567890f;
		double d = 1.23456789012345678901234567890d;
		System.out.println(f);//7 decimal precisions
		System.out.println(d);//16 decimal precisions
       
        
		
		
	}
	

}
