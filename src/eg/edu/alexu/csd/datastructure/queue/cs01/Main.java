/**
 *
 */
package eg.edu.alexu.csd.datastructure.queue.cs01;

/**
 * @author Personal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueArray queu = new QueueArray(10);
		queu.enqueue(1);
		queu.enqueue(2);
		queu.enqueue(3);
		queu.enqueue(4);
		queu.enqueue(5);
		queu.enqueue(6);
		queu.enqueue(7);
		queu.enqueue(8);
		queu.enqueue(9);
		queu.enqueue(10);
		System.out.println(queu.dequeue());
		queu.enqueue(3);
//		queu.enqueue(4);
		System.out.println(queu.size());
		System.out.println(queu.dequeue());
		System.out.println(queu.dequeue());
		System.out.println(queu.dequeue());

	}

}
