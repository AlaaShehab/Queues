/**
 *
 */
package eg.edu.alexu.csd.datastructure.queue.cs01;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author Personal
 *
 */
public class QueueArray implements IArrayBased, IQueue {
	/**
	 * size of array.
	 */
	private int maxSize = 0;
	/**
	 * array.
	 */
	private Object[] queue;
	/**
	 * @param n number of elements.
	 * constructor to define size.
	 */
	public QueueArray(final int n) {
		maxSize = n;
		queue = new Object[maxSize];
	}
	/**
	 * pointer to front of queue.
	 */
	private int front = -1;
	/**
	 * pointer to end of queue.
	 */
	private int rear = -1;
	/**
	 * size of queue.
	 */
	private int size = 0;

	/**
	 * add to front of queue.
	 */
	@Override
	public void enqueue(final Object item) {
		if ((front == -1 && rear == maxSize - 1)
				|| (front == rear && front != -1)) {
			throw new RuntimeException();
		}
		size++;
		rear++;
		int place = rear % maxSize;
		queue[place] = item;
	}
	/**
	 * remove element from queue.
	 */
	@Override
	public Object dequeue() {
		if (front == -1 && rear == -1) {
			throw new RuntimeException();
		}
		front++;
		size--;
		Object data = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		}

		return data;
	}

	/**
	 * Check if queue is empty.
	 */
	@Override
	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	/**
	 * Check if queue is empty.
	 */
	@Override
	public int size() {
		return size;
	}

}
