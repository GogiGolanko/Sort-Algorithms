package main;

import algorithms.BubbleSort;
import algorithms.HeapSort;
import algorithms.InsertionSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import algorithms.SortType;
import algorithms.Sortable;

public class MainSort {
	
	private SortType sortType;
	private boolean order;
	
	public MainSort() {
		this(SortType.BUBBLE, true);
	}
	
	public MainSort(SortType sortType, boolean order) {
		this.sortType = sortType;
		this.order = order;
	}
	
	public long sort(Integer [] values) {
		Sortable sortable = newSortable();
		if (order)
			return sortable.sortAscending(values);
		return sortable.sortDescending(values);
		
	}
	
	public Sortable newSortable() {
		Sortable sortable = null;
		switch(sortType) {
			case BUBBLE : sortable = new BubbleSort(); break;
			case INSERTION : sortable = new InsertionSort(); break;
			case SELECTION : sortable = new SelectionSort(); break;
			case QUICK : sortable = new QuickSort(); break;
			case HEAP : sortable = new HeapSort(); break;
			default : sortable = new BubbleSort();
		}
		return sortable;
	}

	public SortType getSortType() {
		return sortType;
	}

	public void setSortType(SortType sortType) {
		this.sortType = sortType;
	}

	public boolean isOrder() {
		return order;
	}

	public void setOrder(boolean order) {
		this.order = order;
	}
}
