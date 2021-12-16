package java_examples.dataStructure.array;

public class ArrayExample {

	public static void main(String[] args) {

		String[] carBrands = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };

		// This is to store the size of the Array
		int iLength = carBrands.length;
		System.out.println("Length of the Array is ==> " + iLength);

		// This is to access the first element of an array directly with it's
		// position
		String sBMW = carBrands[0];
		System.out.println("First value of the Array is ==> " + sBMW);

		// This is to access the last element of an Array
		String sHonda = carBrands[iLength - 1];
		System.out.println("Last value of the Array is ==> " + sHonda);

		// This is to print all the element values of an Array
		for (int i = 0; i <= iLength - 1; i++) {
			System.out.println("The value stored at position " + i + " in carBrands array is ==> " + carBrands[i]);
		}
	}

}