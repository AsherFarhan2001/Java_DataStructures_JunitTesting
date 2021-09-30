import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;


public class TestArrayInsertion {
	
	
	@Test
	public void testInsert()
	{
		int [] arr = {1,56,0,5,12,0,7,0,0,0};
		int insert = 6;
		int start = 8;
		int [] expectedArray = {1,56,0,5,12,0,7,0,6,0};					// expected Array
		int [] result = ArrayInsertion.insert(arr, insert, start);
		assertArrayEquals(expectedArray,result);
	}
	
	public int [] getArray()
	{
		int [] expectedArray = {1,56,0,5,12,0,7,0,6,0};
		return expectedArray;
	}
								// for testing private method
	@Test
	public void testDisplay() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		int [] Array = {1,56,0,5,12,0,7,0,6,0};
		Method method = ArrayInsertion.class.getDeclaredMethod("display", int [].class);
		method.setAccessible(true);
		ArrayInsertion A = new ArrayInsertion();
		method.invoke(A, Array);
		assertArrayEquals(getArray(),Array);
		
	}
	

}
