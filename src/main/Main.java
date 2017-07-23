package main;

import algorithms.SortType;

public class Main {

	public static void main(String[] args) {
		MainSort mainSort = new MainSort();
		Integer [] tabBubble = randomValues(30000, 100);
		Integer [] tabHeap = tabBubble.clone();
		Integer [] tabInsertion = tabBubble.clone();
		Integer [] tabQuick = tabBubble.clone();
		Integer [] tabSelection = tabBubble.clone();
		
		System.out.println("Bubble Czas sortowania: " + mainSort.sort(tabBubble) / 1000.0 + "s");
		mainSort.setSortType(SortType.HEAP);
		System.out.println("Heap Czas sortowania: " +  mainSort.sort(tabHeap) / 1000.0 + "s");
		mainSort.setSortType(SortType.INSERTION);
		System.out.println("Insertion Czas sortowania: " +  mainSort.sort(tabInsertion) / 1000.0 + "s");
		mainSort.setSortType(SortType.QUICK);
		System.out.println("Quick Czas sortowania: " +  mainSort.sort(tabQuick) / 1000.0 + "s");
		mainSort.setSortType(SortType.SELECTION);
		System.out.println("Selection Czas sortowania: " +  mainSort.sort(tabSelection) / 1000.0 + "s");
	}
	
	
	private static Integer [] randomValues(int length, int range) {
		Integer [] values = new Integer[length];
		for (int i = 0; i < length; i++) {
			values[i] = new Integer((int)(Math.random() * range));
		}
		return values;
	}
	
	private static void printValues(Integer[] values) {
		System.out.print("Values: ");
		for (Integer i : values) {
			System.out.print(i + " ");
		}
	}
}
