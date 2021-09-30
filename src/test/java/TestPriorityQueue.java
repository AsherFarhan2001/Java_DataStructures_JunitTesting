import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestPriorityQueue {

	private PriorityQueue Prque;
	
	@Before
	public void setUp()
	{
		Prque = new PriorityQueue(6);
	}
	
	@Test
	public void testInsert() throws Exception
	{
		Prque.insert(11);				// Queue is : 55 33 22 11 28 0
		Prque.insert(22);
		Prque.insert(33);
		Prque.insert(28);
		Prque.insert(55);
		int [] expectedResult = {55,33,22,11,28,0};
		assertArrayEquals(expectedResult,Prque.array);
	}
	
	@Test
	public void testInsertFull()
	{
		try
		{
			Prque.insert(11);
			Prque.insert(22);
			Prque.insert(33);
			Prque.insert(28);
			Prque.insert(55);
			Prque.insert(11);
			Prque.insert(22);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testExtratcMax() throws Exception
	{
		Prque.insert(11);				// Queue is : 55 33 22 11 28 0
		Prque.insert(22);				// after extracting max : 33 28 22 11 0
		Prque.insert(33);
		Prque.insert(28);
		Prque.insert(55);
		int expectedResult = 55;
		int [] expectedArray = {33,28,22,11,55,0};
		int result = Prque.extractMax();
		assertArrayEquals(expectedArray,Prque.array);			// verifying array after extracting max
		assertEquals(result,expectedResult);
	}
	
	@Test
	public void testExtractMaxEmpty() 
	{
		try
		{
			int result = Prque.extractMax();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testGetMax() throws Exception
	{
		Prque.insert(15);
		Prque.insert(19);
		Prque.insert(4);
		Prque.insert(49);
		Prque.insert(32);
		int expectedResult = 49;
		int result = Prque.getMax();
		assertEquals(expectedResult,result);
		
	}
	
	@Test
	public void testGetMaxEmpty()
	{
		try
		{
			int result = Prque.getMax();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testChangePriority() throws Exception
	{
		Prque.insert(15);			// before : 49 19 15 4 32 24
		Prque.insert(19);			// after : 83 49 24 32 19 4
		Prque.insert(4);
		Prque.insert(49);
		Prque.insert(32);
		Prque.insert(24);
		int value = 83;
		int index = 3;
		Prque.changePriority(index, value);
		int [] expectedResult = {83,49,24,32,19,4};
		assertArrayEquals(expectedResult,Prque.array);
	}
	
	@Test
	public void testRemove() throws Exception
	{
		Prque.insert(11);				// Queue is : 55 33 22 11 28 0
		Prque.insert(22);				
		Prque.insert(33);
		Prque.insert(28);
		Prque.insert(55);
		int index = 3;
		Prque.remove(index);
		int [] expectedResult = {55,33,22,28,2147483647,0};			// Element is removed but the array will give garbage value on 4th index
		assertArrayEquals(expectedResult,Prque.array);
	}
	
	@Test
	public void testDisplay() throws Exception
	{
		Prque.insert(11);				// Queue is : 55 33 22 11 28 0
		Prque.insert(22);				
		Prque.insert(33);
		Prque.insert(28);
		Prque.insert(55);
		Prque.display();
		int [] expectedArray = {55,33,22,11,28,0};
		assertArrayEquals(expectedArray,Prque.array);
	}
	
	@Test
	public void testDisplayEmpty()
	{
		Prque.display();
		boolean temp = false;
		if(Prque.addPointer == 0)
		{
			temp = true;
		}
		boolean result = true;
		assertTrue(result == temp);
	}

}
