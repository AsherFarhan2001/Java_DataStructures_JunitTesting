import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDoublyLinkedList {

	private DoublyLinkedList Dlist; 
	private DoublyLinkedList.Node node;
	
	@Before
	public void setUp()
	{
		Dlist = new DoublyLinkedList();
		node = new DoublyLinkedList.Node(0);

	}  
	
	@Test
	public void testPushFront()
	{
		Dlist.pushFront(12);			// list : 30 21 15 24 12
		Dlist.pushFront(24);
		Dlist.pushFront(15);
		Dlist.pushFront(21);
		Dlist.pushFront(30);
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.head;
		int [] expectarr = {30,21,15,24,12};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.next; 
			i++;
		}
		
	}
	 
	@Test
	public void testPushBack()
	{
		Dlist.pushFront(12);			// list : 30 21 15 24 12 17 34
		Dlist.pushFront(24);
		Dlist.pushFront(15);
		Dlist.pushBack(17);  
		Dlist.pushFront(21);
		Dlist.pushFront(30);
		Dlist.pushBack(34);
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.head;
		int [] expectarr = {30,21,15,24,12,17,34};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.next; 
			i++;
		}
	}
	
	@Test
	public void testPushBackEmpty()
	{
		Dlist.pushBack(12);
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.head;
		int [] expectarr = {12,0,0,0,0,0,0};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.next; 
			i++;
		}
	}
	
	@Test
	public void testPopFront()
	{
		Dlist.pushFront(12);			// list : 22 30 21 15 24 12 17 34
		Dlist.pushFront(24);			// After Pop : 30 21 15 24 12 17 34
		Dlist.pushFront(15);
		Dlist.pushBack(17);
		Dlist.pushFront(21);
		Dlist.pushFront(30);
		Dlist.pushBack(34);
		Dlist.pushFront(22);
		Dlist.popFront();
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.head;
		int [] expectarr = {30,21,15,24,12,17,34};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.next; 
			i++;
		}
	}
	
	@Test
	public void testPopFrontEmpty()
	{
		Dlist.popFront();
		boolean result = false;
		if(Dlist.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPopFrontOneElement()
	{
		Dlist.pushBack(33);
		Dlist.popFront();
		boolean result = false;
		if(Dlist.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPopBack()
	{
		Dlist.pushFront(12);			// list : 22 30 21 15 24 12 17 34 11
		Dlist.pushFront(24);			// After Pop : 22 30 21 15 24 12 17 34
		Dlist.pushFront(15);
		Dlist.pushBack(17);
		Dlist.pushFront(21);
		Dlist.pushFront(30);
		Dlist.pushBack(34);
		Dlist.pushFront(22);
		Dlist.pushBack(11);
		Dlist.popBack();
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.head;
		int [] expectarr = {22,30,21,15,24,12,17,34};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.next; 
			i++;
		}
	}
	
	@Test
	public void testPopBackEmpty()
	{
		Dlist.popBack();
		boolean result = false;
		if(Dlist.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPopBackOneElement()
	{
		Dlist.pushBack(33);
		Dlist.popBack();
		boolean result = false;
		if(Dlist.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	
	@Test
	public void testDisplayFull()			// Testing for Filled list
	{
		Dlist.pushFront(12);			// list : 22 30 21 15 24 12 17 34 11
		Dlist.pushFront(24);
		Dlist.pushFront(15);
		Dlist.pushBack(17);
		Dlist.pushFront(21);
		Dlist.pushFront(30);
		Dlist.pushBack(34);
		Dlist.pushFront(22);
		Dlist.pushBack(11);
		Dlist.displayF();
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.head;
		int [] expectarr = {22,30,21,15,24,12,17,34,11};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.next; 
			i++;
		}
	}
	
	@Test
	public void testDisplayEmpty()			// Testing for Empty list
	{
		boolean temp = false;
		Dlist.displayF();
		if(Dlist.head==null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testDisplayReverse()
	{
		Dlist.pushFront(12);			// list : 22 30 21 15 24 12 17 34 11
		Dlist.pushFront(24);			// After Reverse : 11 34 17 12 24 15 21 30 22
		Dlist.pushFront(15);
		Dlist.pushBack(17);
		Dlist.pushFront(21);
		Dlist.pushFront(30);
		Dlist.pushBack(34);
		Dlist.pushFront(22); 
		Dlist.pushBack(11); 
		Dlist.displayB();
		int i = 0;
		DoublyLinkedList.Node temp = Dlist.tail;
		int [] expectarr = {11,34,17,12,24,15,21,30,22};
		while(temp != null)
		{
			assertEquals(expectarr[i],temp.key);
			temp = temp.prev; 
			i++;
		}
	}
	
	@Test
	public void testDisplayReverseEmpty()
	{
		boolean temp = false;
		if(Dlist.head == null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}
}
