package castanonLab10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
//import org.junit.Test;
public class testSelectionSort{
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
        testing(8,9,7,10,2);
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        /** Test data contains negative values only **/
    	testing(-8,-9,-5,-10,-2);
    }
    
    public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/
		testing(-8,9,0,-10,2);//2,7,8,9,10
    }
    
    public void testDuplicates(){
    	testing(0,0,1,1,1);
        /** Test data contains duplicates **/
    }
    public void testing(int A, int B, int C, int D, int E) {
    	//int[] Sortedarr = {2,7,8,9,10};
    	int[] arr = {A,B,C,D,E};
    	int[] sortedArr = arr;
    	Arrays.sort(sortedArr);
		SelectionSort SS = new SelectionSort();
		arr=SS.basicSelectionSort(arr);
		Assert.assertArrayEquals(arr,sortedArr);
		//int[] maxValue = SS.basicSelectionSort(arr);
		//assert(maxValue == arr);
    }
}