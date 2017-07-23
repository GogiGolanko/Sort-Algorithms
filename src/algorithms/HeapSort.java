package algorithms;

import java.util.function.BiFunction;

public class HeapSort extends SortOrder {

	private Integer [] values; 

	public void heapSort(boolean descending) {
		for (int i = values.length / 2 - 1; i >= 0; i--) {
			repairTop(values.length - 1, i, descending ? 1 : -1);
		}
		for (int i = values.length - 1; i > 0; i--) {
			swap(0, i);
			repairTop(i - 1, 0, descending ? 1 : -1);
		}
	}

	private void repairTop(int bottom, int topIndex, int order) {
		Integer tmp = values[topIndex];
		int succ = topIndex * 2 + 1;
		if (succ < bottom && values[succ].compareTo(this.values[succ + 1]) == order) {
			succ++;
		}

		while (succ <= bottom && tmp.compareTo(values[succ]) == order) {
			values[topIndex] = values[succ];
			topIndex = succ;
			succ = succ * 2 + 1;
			if (succ < bottom && this.values[succ].compareTo(this.values[succ + 1]) == order) {
				succ++;
			}
		}
		values[topIndex] = tmp;
	}

	private void swap(int left, int right) {
		Integer tmp 	= values[right];
		values[right] 	= values[left];
		values[left] 	= tmp;
	}

	@Override
	public void sort(Integer [] values, BiFunction<Integer, Integer, Boolean> order) {
		this.values = values;
		heapSort(order.apply(0, 1));
	}
}
