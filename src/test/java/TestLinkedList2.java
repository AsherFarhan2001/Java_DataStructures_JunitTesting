import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestLinkedList2 {

	private LinkedList2 list2;
	
	@Before
	public void setUp()
	{
		list2 = new LinkedList2();
		list2.headPointer = null;  
		list2.numofElements = 0;
		list2.tailPointer=null;
	
	}
	
	@Test 
	public void testTopFrontNull()			// exception thrown when the head is NULL
	{
		try
		{
			list2.topFront();
		}
		catch (Exception e)
		{
			System.out.println(e);
			
		}
		
	}
	
	@Test
	public void testTopBackIsNull()				// exception thrown when the tail pointer is NULL
	{
		try
		{
			list2.topBack();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testAdd()
	{
		list2.add(15);				// List : 15 10 45 25 30    inserting at last
		list2.add(10);
		list2.add(45);
		list2.add(25);
		list2.add(30);
		int expectedResult = 30;
		int result = list2.tailPointer.data;
		assertEquals(expectedResult,result);
		
	}
	
	@Test
	public void testPushFront()
	{
		list2.add(15);				// List : 22 13 14 15 10 45 25 30   
		list2.add(10);
		list2.pushFront(14);
		list2.add(45);
		list2.add(25);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		int expectedResult = 22;
		assertEquals(expectedResult,list2.headPointer.data);
	}
	
	
	@Test
	public void testTopFront() throws Exception
	{
		
		list2.pushFront(24);				// List : 33 22 13 24 15 10 45 25 30
		list2.add(15);				
		list2.add(10);
		list2.add(45);
		list2.add(25);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		list2.pushFront(33);
		int expectedResult = 33;
		 int result = list2.topFront();
		 assertEquals(expectedResult,result);
		
	}
	
	@Test
	public void testPopFront() throws Exception
	{
		
		list2.add(15);				// Before Pop : 33 22 13 15 10 45 25 30
		list2.add(10);				// After Pop : 22 13 15 10 45 25 30
		list2.add(45);
		list2.add(25);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		list2.pushFront(33);
		list2.popFront();									
		int expectedResult = 22;								
		assertEquals(expectedResult,list2.headPointer.data);
	
		
	}
	
	@Test
	public void testPopFrontNull()
	{
		try
		{
			list2.popFront();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testPopFrontOneElement() throws Exception
	{
		list2.add(3);
		list2.popFront();
		boolean result = false;
		if(list2.headPointer == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPushBack()
	{
		list2.add(15);				// List : 33 22 13 15 10 45 30 44
		list2.add(10);				
		list2.add(45);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		list2.pushFront(33); 
		list2.pushBack(44);
		int expectedResult = 44;
		assertEquals(expectedResult,list2.tailPointer.data);
	}
	
	@Test
	public void testTopBack()  throws Exception
	{
		
		list2.add(15);				// List : 33 22 13 15 10 45 30 44 76
		list2.add(10);				
		list2.add(45);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		list2.pushFront(33);
		list2.pushBack(44);
		list2.add(76);
		int result = list2.topBack();
		int expectedResult = 76;
		assertEquals(expectedResult,result);
			
		
	}
	
	@Test
	public void testDisplayFull()			// Testing for Filled list
	{
		boolean temp = false;
		list2.add(15);				// List : 33 22 13 15 10 45 30 44 76
		list2.add(10);				
		list2.add(45);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		list2.pushFront(33);
		list2.pushBack(44);
		list2.add(76);
		list2.display();
		if(list2.headPointer==null)
		{
			temp = true;
		}
		boolean expectedResult = false;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testDisplayEmpty()			// Testing for Empty list
	{
		list2.display();
		boolean temp = false;
		if(list2.headPointer==null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testSize()
	{
		list2.add(15);				// List : 33 22 13 15 10 45 30 44 76
		list2.add(10);				
		list2.add(45);
		list2.add(30);
		list2.pushFront(13);				
		list2.pushFront(22);
		list2.pushFront(33);
		list2.pushBack(44);
		list2.add(76);
		int expectedResult = 9;
		int result = list2.size();
		assertEquals(expectedResult,result);
	}
	
	
	
	

}
