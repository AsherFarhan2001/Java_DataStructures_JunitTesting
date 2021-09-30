import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestArray {

	private Array obj;
	private Array obj1;
	
	@Before
	public void setUp()
	{
		obj = new Array();
		Array.array[0] = 2;
		Array.array[1] = 5;
		Array.array[2] = 7;
		Array.array[3] = 10;
		Array.array[4] = 1;				
		Array.array[5] = 4;
		Array.array[6] = 8;
		Array.array[7] = 14;
		for(int i=8;i<100;i++)
		{
			Array.array[i] = 0;
		}
		Array.size = 8;
		
	}
	public void setUp1()
	{
		obj1 = new Array();
	}
	
	@Test
	public void testInsert()
	{
		int value = 9;
		int pos = 5;
		
		int [] expectedArray = new int [100];			// initializing expected array after insertion
		expectedArray[0] = 2;
		expectedArray[1] = 5;
		expectedArray[2] = 7;
		expectedArray[3] = 10;
		expectedArray[4] = 1;
		expectedArray[5] = 9;
		expectedArray[6] = 4;
		expectedArray[7] = 8;
		expectedArray[8] = 14;
		
		for(int i=9;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		Array.insert(value, pos);
		assertArrayEquals(expectedArray,Array.array);
		
	}
	
	@Test
	public void delete()
	{
	
		int pos = 4;
		int [] expectedArray = new int [100];			
		expectedArray[0] = 2;
		expectedArray[1] = 5;
		expectedArray[2] = 7;
		expectedArray[3] = 10;
		expectedArray[4] = 4;
		expectedArray[5] = 8;
		expectedArray[6] = 14;			
		expectedArray[7] = 14;
		
		for(int i=8;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		Array.delete(pos);
		assertArrayEquals(expectedArray,Array.array);
	}
	
	public int [] getArray()
	{
		int [] expectedArray = new int [100];
		expectedArray[0] = 2;
		expectedArray[1] = 5;
		expectedArray[2] = 7;
		expectedArray[3] = 10;
		expectedArray[4] = 1;
		expectedArray[5] = 4;
		expectedArray[6] = 8;
		expectedArray[7] = 14;
		
		
		
		for(int i=8;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		return expectedArray;
	}
	
	@Test
	public void testDisplay()
	{
	
		obj1.display();
		assertArrayEquals(obj1.array,getArray());
	}
	
	@Test
	public void testLinearSearch()
	{
		int no = 10;
		boolean expectedResult = true;
		boolean result = Array.linearSearch(no);
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void NegativeTestLinearSearch()			// negative test for linear search
	{
		int no = 23;
		boolean expectedResult = false;
		boolean result = Array.linearSearch(no);
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testBubbleSort()
	{
		int [] expectedArray = new int [100];			
		expectedArray[0] = 1;						// sorting the array in ascending order
		expectedArray[1] = 2;
		expectedArray[2] = 4;
		expectedArray[3] = 5;
		expectedArray[4] = 7;
		expectedArray[5] = 8;
		expectedArray[6] = 10;			
		expectedArray[7] = 14;
		
		for(int i=8;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		Array.bubbleSort();
		assertArrayEquals(expectedArray,Array.array);
		
	}
	
	@Test
	public void testBinarySearch()
	{
		int [] expectedArray = new int [100];			
		Array.array[0] = 1;						
		Array.array[1] = 2;
		Array.array[2] = 4;
		Array.array[3] = 5;
		Array.array[4] = 7;
		Array.array[5] = 8;
		Array.array[6] = 10;			
		Array.array[7] = 14;
		
		for(int i=8;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		int low = 0;
		int high = 7;
		int num = 7;
		boolean expectedResult = true;
		boolean result = Array.binarySearch(num, low, high);
		assertEquals(expectedResult,result);
		
		
	}
	
	@Test
	public void NegativeTestBinarySearch()			// negative test for binary search
	{
		int [] expectedArray = new int [100];			
		Array.array[0] = 1;						
		Array.array[1] = 2;
		Array.array[2] = 4;
		Array.array[3] = 5;
		Array.array[4] = 7;
		Array.array[5] = 8;
		Array.array[6] = 10;			
		Array.array[7] = 14;
		
		for(int i=8;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		int low = 0;
		int high = 7;
		int num = 9;
		boolean expectedResult = false;
		boolean result = Array.binarySearch(num, low, high);
		assertEquals(expectedResult,result);
	}
	
	
}
