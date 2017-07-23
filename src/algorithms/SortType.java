package algorithms;

public enum SortType {
	BUBBLE(1, "BubbleSort"),
	INSERTION(2, "InsertionSort"),
	SELECTION(3, "SelectionSort"),
	QUICK(4, "QuickSort"),
	HEAP(5, "HeapSort");
	
	int n;
	private final String type;
	
	private SortType(int n, String str) { 
		this.n = n;
		this.type = str;
	}
	
	 @Override
	 public String toString() {
		 return type;
	 }
}
