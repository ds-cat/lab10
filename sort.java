package lab_10;

public class sort {
private int temp;
/** Creates a new instance of SelectionSort */
public sort() {
}
/* A simple SelectionSort algorithm
* pre-condition:
* post-condition:
* inputs:
* outputs:
* special conditions:
*/


int min;
public int[] basicSelectionSort(int[] x) {
	for (int i = 0; i < x.length; ++i) {
		min = i;
		for (int j= i+1; j < x.length; ++j) {
				if (x[min] > x[j]) {
					min = j;
				}
		} // end of inner for loop
		int temp = x[min];
		x[min] = x[i];
		x[i] = temp;

	} // end of outer for loop
	return x;
	} // end of basicSelectionSort method
}
