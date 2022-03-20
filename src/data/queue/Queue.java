package data.queue;

import data.linkedlist.SinglyLinkedList;

/**
 * Queue.
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class Queue<T> extends SinglyLinkedList<T> {
	public static void main(String[] args) {
		final Queue<String> list = new Queue<>();
		list.queue("test1");
		list.queue("test2");
		list.queue("test3");
		System.out.println(list.size());
		System.out.println("получение");
		System.out.println(list.dequeue());
		System.out.println(list.dequeue());
		System.out.println(list.dequeue());
		System.out.println(list.dequeue());
		System.out.println(list.size());

	}

	public void queue(T value) {
		add(value);
	}

	public T dequeue() {
		return remove(size - 1);
	}
}
