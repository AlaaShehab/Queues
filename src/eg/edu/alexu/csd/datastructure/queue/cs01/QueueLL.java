/**
 *
 */
package eg.edu.alexu.csd.datastructure.queue.cs01;

import eg.edu.alexu.csd.datastructure.linkedList.cs01_29.DoubleLinkedList;
import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author Personal
 *
 */
public class QueueLL implements ILinkedBased, IQueue {
	/**
	 * queue based linked list.
	 */
	DoubleLinkedList queue = new DoubleLinkedList();
	/**
	 * @param item to be added.
	 */
	@Override
	public void enqueue(final Object item) {
		queue.add(item);
	}
	/**
	 * remove items from queue.
	 */
	@Override
	public Object dequeue() {
		if (queue.size() == 0) {
			throw new RuntimeException();
		}
		Object data = queue.get(0);
		queue.remove(0);
		return data;
	}
	/**
	 * Check if queue is empty.
	 */
	@Override
	public boolean isEmpty() {
		if (queue.size() == 0) {
			return true;
		}
		return false;
	}
	/**
	 * check queue size.
	 */
	@Override
	public int size() {
		return queue.size();
	}

}
