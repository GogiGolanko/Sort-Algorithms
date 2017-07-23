package main;

import java.util.Arrays;

import algorithms.SortType;

public class Main {

	public static void main(String[] args) {
		Arrays.asList(SortType.values()).forEach(type -> {
			startSort(type);
		});
	}
	
	
	private static Integer [] randomValues(int length, int range) {
		Integer [] values = new Integer[length];
		for (int i = 0; i < length; i++) {
			values[i] = new Integer((int)(Math.random() * range));
		}
		return values;
	}
	
	private static void startSort(SortType type) {
		MainSort mainSort = new MainSort();
		Integer [] values = randomValues(30000, 100);
		mainSort.setSortType(type);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(type.name() + " czas sortowania: " + mainSort.sort(values) / 1000.0 + "s");		
			}
		}).start();
	}
}
