import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 4;
        arr[4] = 1;


        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 2;
        Sortedarr[2] = 3;
        Sortedarr[3] = 4;
        Sortedarr[4] = 5;

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; ++i)
        {
            	assertEquals("Error in positive at position " + i, Sortedarr[i], arr[i]);
        }

    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -3;
        arr[1] = -2;
        arr[2] = -5;
        arr[3] = -4;
        arr[4] = -1;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -4;
        Sortedarr[2] = -3;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; ++i)
        {
            	assertEquals("Error in negative at position " + i, Sortedarr[i], arr[i]);
        }
    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -3;
        arr[1] = 9;
        arr[2] = -5;
        arr[3] = 4;
        arr[4] = -1;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -3;
        Sortedarr[2] = -1;
        Sortedarr[3] = 2;
        Sortedarr[4] = 4;
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; ++i)
        {
            	assertEquals("Error in mixes at position " + i, Sortedarr[i], arr[i]);
        }
    }
