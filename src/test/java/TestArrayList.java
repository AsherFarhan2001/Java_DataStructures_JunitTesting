import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestArrayList {

	private ArrayList obj;
	
	@Before
	public void setUp()
	{
		obj = new ArrayList();
		int [] arr = {10,7,12,8}; 
		for(int i=0;i<4;i++)
		{
			obj.array[i] = arr[i]; 
		}
		obj.addPointer = 4;
		obj.numofElements = 4;
	}
	
	@Test
	public void testGetElement()
	{
		int index = 2;
		int expectedResult = 12;
		int result = obj.getElement(index);
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testSetValue()
	{
		int value = 24;
		int index = 1;
		int [] expectedArray = {10,24,12,8};
		obj.setValue(value, index);
		assertArrayEquals(expectedArray,obj.array);
	}
	
	@Test
	public void testAddElement()
	{
		int num = 27;
		int [] expectedArray = {10,7,12,8,27,0,0,0};
		obj.addElement(num);
		assertArrayEquals(expectedArray,obj.array);
	}
	@Test
	public void testAddElement1()					// if add pointer less than the size
	{
		int [] arr = {12,15,8};
		for(int i=0;i<3;i++)
		{
			obj.array[i] = arr[i];
		}
		obj.addPointer = 3;
		obj.numofElements = 3;
		int num = 27;
		int [] expectedArray = {12,15,8,27};
		obj.addElement(num);
		assertArrayEquals(expectedArray,obj.array);
	}
	
	@Test
	public void testRemoveElement()
	{
		int index = 2;
		int [] expectedArray = {10,7,8,8};
		obj.removeElement(index);
		assertArrayEquals(expectedArray,obj.array);
	}
	
	@Test
	public void testSize()
	{
		int expectedResult = 4;
		int result = obj.size();
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void NegativeTestSize()
	{
		int expectedResult = 5;
		int result = obj.size();
		assertNotEquals(expectedResult,result);
	}
}
