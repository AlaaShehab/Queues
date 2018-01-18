/**
 *
 */
package eg.edu.alexu.csd.datastructure.queue.cs01;

import org.junit.Assert;
import org.junit.Test;

import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author Personal
 *
 */
public class QueueArrayTest {

	/**
	 * test enqueue function in Queue.
	 */
	@Test
	public void testEnqueue() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op6 = 6;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		Assert.assertEquals(op6, queue.size());
	}

	/**
	 * test dequeue function.
	 */
	@Test
	public void testDequeue() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op6 = 6;
		final int op0 = 0;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		Assert.assertEquals(op1, queue.dequeue());
		Assert.assertEquals(op2, queue.dequeue());
		Assert.assertEquals(op3, queue.dequeue());
		Assert.assertEquals(op4, queue.dequeue());
		Assert.assertEquals(op5, queue.dequeue());
		Assert.assertEquals(op6, queue.dequeue());
		Assert.assertEquals(op0, queue.size());
	}

	/**
	 * test size after enqueue and dequeue.
	 */
	@Test
	public void testSize() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op6 = 6;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.dequeue();
		Assert.assertEquals(op2, queue.size());
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		queue.dequeue();
		queue.dequeue();
		Assert.assertEquals(op3, queue.size());
	}

	/**
	 * test when removing from empty queue.
	 */
	@Test
	public void testDequeueEmptyQueue() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.dequeue();
		queue.enqueue(op4);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		boolean remove = false;
		try {
			queue.dequeue();
			remove = true;
		} catch (Exception e) {
			remove = false;
		}
		Assert.assertFalse(remove);
	}

	/**
	 * test empty queue.
	 */
	@Test
	public void testEmpty() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.dequeue();
		queue.enqueue(op4);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		final String message = "Should be empty";
		Assert.assertTrue(message, queue.isEmpty());
	}

	/**
	 * test queue not empty.
	 */
	@Test
	public void testNotEmpty() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.dequeue();
		queue.enqueue(op4);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(op1);
		final String message = "Shouldn't be empty";
		Assert.assertTrue(message, !queue.isEmpty());
	}

	/**
	 * test full queue.
	 */
	@Test
	public void testFullQueue() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op9 = 9;
		final int op6 = 6, op10 = 10;
		final int op7 = 7, op8 = 8;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		queue.enqueue(op7);
		queue.enqueue(op8);
		queue.enqueue(op9);
		queue.enqueue(op10);
		Assert.assertEquals(op10, queue.size());
	}

	/**
	 * test adding in full queue.
	 */
	@Test
	public void testAddinFullQueue() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op9 = 9;
		final int op6 = 6, op10 = 10;
		final int op7 = 7, op8 = 8;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		queue.enqueue(op7);
		queue.enqueue(op8);
		queue.enqueue(op9);
		queue.enqueue(op10);
		boolean add = false;
		try {
			queue.enqueue(op1);
			add = true;
		} catch (Exception e) {
			add = false;
		}
		Assert.assertFalse(add);
	}

	/**
	 * test circular array in queues.
	 */
	@Test
	public void testCicular() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op9 = 9;
		final int op6 = 6, op10 = 10;
		final int op7 = 7, op8 = 8;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		queue.enqueue(op7);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(op8);
		queue.enqueue(op9);
		queue.enqueue(op10);
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(op4);
		queue.enqueue(op3);
	}

	/**
	 * test when front = rear and not empty.
	 */
	@Test
	public void testFrontRear() {
		final int size = 10;
		IQueue queue = new QueueArray(size);
		final int op1 = 1, op2 = 2;
		final int op3 = 3, op4 = 4;
		final int op5 = 5, op9 = 9;
		final int op6 = 6, op10 = 10;
		final int op7 = 7, op8 = 8;
		queue.enqueue(op1);
		queue.enqueue(op2);
		queue.enqueue(op3);
		queue.enqueue(op4);
		queue.enqueue(op5);
		queue.enqueue(op6);
		queue.enqueue(op7);
		queue.enqueue(op8);
		queue.enqueue(op9);
		queue.enqueue(op10);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(op1);
		queue.enqueue(op2);
		Assert.assertFalse(queue.isEmpty());
	}
}
