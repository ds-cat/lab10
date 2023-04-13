package lab_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class sortTest {
	private sort temp1;
	@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public sortTest() {
test();
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
sort temp1 = new sort();

int[] sorted = temp1.basicSelectionSort(arr);
for(int i= 0; i < arr.length-1; ++i) {
assertEquals(sorted[i] ,Sortedarr[i]);
}
/** add tests to check for this unit test **/
}
public void testNegative(){
/** Test data contains negative values only **/
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = -9;
	arr[2] = -7;
	arr[3] = -10;
	arr[4] = -2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -10;
	Sortedarr[1] = -9;
	Sortedarr[2] = -8;
	Sortedarr[3] = -7;
	Sortedarr[4] = -2;

	sort temp1 = new sort();

	int[] sorted = temp1.basicSelectionSort(arr);
	for(int i= 0; i < arr.length-1; ++i) {
		assertEquals(sorted[i] ,Sortedarr[i]);
		}
}
public void testMixed(){
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = -9;
	arr[2] = 7;
	arr[3] = -10;
	arr[4] = 2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -10;
	Sortedarr[1] = -9;
	Sortedarr[2] = 2;
	Sortedarr[3] = 7;
	Sortedarr[4] = 8;
	sort temp1 = new sort();

	int[] sorted = temp1.basicSelectionSort(arr);
	for(int i= 0; i < arr.length-1; ++i) {
		assertEquals(sorted[i] ,Sortedarr[i]);
		}
/** Test data contains with both positive, negative and zeros **/
}
public void testDuplicates(){
/** Test data contains duplicates **/
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = 8;
	arr[2] = 2;
	arr[3] = 2;
	arr[4] = 2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = 2;
	Sortedarr[1] = 2;
	Sortedarr[2] = 2;
	Sortedarr[3] = 8;
	Sortedarr[4] = 8;
	sort temp1 = new sort();

	int[] sorted = temp1.basicSelectionSort(arr);
	for(int i= 0; i < arr.length-1; ++i) {
		assertEquals(sorted[i] ,Sortedarr[i]);
		}
}
}