public class ArrayOperations {
	
	public static int getTotal(int[] array) {
		int total = 0;
		
		for (int i  = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return total;
	}
	
	public static int getTotal(float[] array) {
		int total = 0;
		
		for (int i  = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return total;
	}
	
	public static int getTotal(double[] array) {
		int total = 0;
		
		for (int i  = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return total;
	}
	
	public static double getAverage(int[] array) {
		double average = 0;
		
		average = getTotal(array) / array.length;
		
		return average;
	}
	
	public static double getAverage(float[] array) {
		double average = 0;
		
		average = getTotal(array) / array.length;
		
		return average;
	}
	
	public static double getAverage(double[] array) {
		double average = 0;
		
		average = getTotal(array) / array.length;
		
		return average;
	}
	
	public static int getHighest(int[] array) {
		int highest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[highest]) {
				highest = i;
			}	
		}
		
		return highest;
	}
	
	public static int getHighest(float[] array) {
		int highest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[highest]) {
				highest = i;
			}	
		}
		
		return highest;
	}
	
	public static int getHighest(double[] array) {
		int highest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[highest]) {
				highest = i;
			}	
		}
		
		return highest;
	}
	
	public static int getLowest(int[] array) {
		int lowest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[lowest]) {
				lowest = i;
			}	
		}
		
		return lowest;
	}
	
	public static int getLowest(float[] array) {
		int lowest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[lowest]) {
				lowest = i;
			}	
		}
		
		return lowest;
	}
	
	public static int getLowest(double[] array) {
		int lowest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[lowest]) {
				lowest = i;
			}	
		}
		
		return lowest;
	}
	
	public static int sequentialSearch(int[] array, int searchNum) {
		int returnNum = -1;
		
		for (int i = 0; i < array.length; i++ ) {
			if(array[i] == searchNum) {
				returnNum = i; 
			}
		}
		return returnNum;
	}
	
	public static int sequentialSearch(double[] array, double searchNum) {
		int returnNum = -1;
		
		for (int i = 0; i < array.length; i++ ) {
			if(array[i] == searchNum) {
				returnNum = i; 
			}
		}
		return returnNum;
	}
	
	public static int sequentialSearch(float[] array, float searchNum) {
		int returnNum = -1;
		
		for (int i = 0; i < array.length; i++ ) {
			if(array[i] == searchNum) {
				returnNum = i; 
			}
		}
		return returnNum;
	}
	
	public static int sequentialSearch(String[] array, String searchString) {
		int returnNum = -1;
		
		for (int i = 0; i < array.length; i++ ) {
			if(array[i].compareTo(searchString) == 0) {
				returnNum = i; 
			}
		}
		return returnNum;
	}
	
	public static int findMax(int[] array, int size) {
		int max = 0;
		for(int i = 1; i < size; i++) {
			if(array[i] > array[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static void selectionSort(int[] array, int size) {
		for (int i = size; i > 1; i--) {
			int m = findMax(array, i);
			if(m != i - 1) {
				int temp = array[m];
				array[m] = array [i - 1];
				array[i - 1] = temp;
			}
		}
	}
}