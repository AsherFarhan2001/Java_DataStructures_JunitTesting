import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestArrayDeletion {

	@Test			// for testing private method
	public void testDelete() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		int [] array = {1,2,3,4,5,6};
		int index = 4;
		int [] expectedArray = {1,2,3,4,6,-1};
		Method method = ArrayDeletion.class.getDeclaredMethod("delete", int [].class , int.class);
		method.setAccessible(true);
		ArrayDeletion A = new ArrayDeletion();
		int [] result = (int [])method.invoke(A,array, index);
		assertArrayEquals(expectedArray,result);
		 
	}
	public int [] getArray()
	{
		int [] expectedArray = {4,5,6,7,8,9};
		return expectedArray;
	}
	
	@Test
	public void testDisplay()
	{
		int [] array = {4,5,6,7,8,9};
		ArrayDeletion.display(array);
		assertArrayEquals(array,getArray());
	}

}
