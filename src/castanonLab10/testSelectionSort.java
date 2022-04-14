package castanonLab10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import org.junit.Assert;
//import org.junit.Test;
public class testSelectionSort extends TestCase{
@Test
public void test() {

}
    public testSelectionSort() {
    }



    public void testing(int A, int B, int C, int D, int E) {
    	//int[] Sortedarr = {2,7,8,9,10};
    	int[] arr = {A,B,C,D,E};
    	int[] sortedArr = arr;
    	Arrays.sort(sortedArr);
		  SelectionSort SS = new SelectionSort();
		  arr=SS.basicSelectionSort(arr);
		  Assert.assertArrayEquals(arr,sortedArr);
    }
}
