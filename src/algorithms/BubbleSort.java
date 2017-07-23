package algorithms;

import java.util.function.BiFunction;

public class BubbleSort extends SortOrder { 
	
	@Override
	public void sort(Integer [] values, BiFunction<Integer, Integer, Boolean> order) {

	    boolean finish;
		int j = 0;
		do {
			finish = true;
			j++;
			for (int i = 0; i < values.length - j; i++) {
				if (order.apply(values[i], values[i + 1])) {
					Integer temp  = values[i];
					values[i]	  = values[i + 1];
					values[i + 1] = temp;
					finish = false;
				}
			}
		} while (!finish);
	}
}
