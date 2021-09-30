import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestDequeue {

	private Dequeue deq;
	
	@Before
	public void setUp()
	{
		deq = new Dequeue(6);
	}
	
	@Test
	public void testAddLeft()
	{
		deq.addLeft(24); 
		deq.addLeft(15);
		deq.addLeft(11);
		int [] expectedArray = {24,15,11,0,0,0};
		assertArrayEquals(expectedArray,deq.array);
	}
	
	
	@Test
	public void testAddLeftFull()			// test when the array is full
	{
		deq.addLeft(24);
		deq.addLeft(15);
		deq.addLeft(11);
		deq.addLeft(14);
		deq.addLeft(5);
		deq.addLeft(19);
		deq.addLeft(20); 
		int [] expectedArray = {24,15,11,14,5,19};
		assertArrayEquals(expectedArray,deq.array);
	}
	
	@Test
	public void testAddRight()
	{
		deq.addLeft(24);
		deq.addLeft(15);
		deq.addRight(34);
		deq.addRight(12);
		int [] expectedArray = {24,15,0,0,12,34};
		assertArrayEquals(expectedArray,deq.array);
		
	}
	
	@Test
	public void testAddRightFull()		// test when the array is full
	{
		deq.addLeft(24);
		deq.addLeft(15);
		deq.addRight(34);
		deq.addRight(12);
		deq.addRight(50);
		deq.addRight(90);
		deq.addRight(100);
		int [] expectedArray = {24,15,90,50,12,34};
		assertArrayEquals(expectedArray,deq.array);
	}
	
	@Test
	public void testDisplay()
	{
		deq.addLeft(24);
		deq.addLeft(15);
		deq.addRight(34);
		deq.addRight(12);
		deq.addRight(50);
		deq.addRight(90);
		deq.addRight(100);
		deq.display();
		int [] expectedArray = {24,15,90,50,12,34};
		assertArrayEquals(expectedArray,deq.array);
	}
}
