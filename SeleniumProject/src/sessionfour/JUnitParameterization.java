package sessionfour;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//step:1-RunWith annotation
@RunWith(Parameterized.class)
public class JUnitParameterization {
	
	//Step 2-global variables or class variables
	//Declare global variables
	int x, y;
	static int count;
	//create the constructor
	public JUnitParameterization(int x, int y){
		this.x= x;
		this.y = y;
	}
	
	@Test
	public void testAddition(){
		count++;
		System.out.println(count);
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
	}
	
	//Step - 4 Declare Array of values @Parameters
	@Parameters
	public static Collection<Object[]> populateData(){
		Object [][] data = new Object[5][2];
		data[0][0] = 20;
		data[0][1] = 21;
		
		data[1][0] = 22;
		data[1][1] = 23;
		
		data[2][0] = 24;
		data[2][1] = 25;
		
		data[3][0] = 26;
		data[3][1] = 27;
		
		data[4][0] = 28;
		data[4][1] = 29;
		
		return Arrays.asList(data);
	}
	

}
