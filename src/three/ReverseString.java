package three;



public class ReverseString {

	public static void main(String[] args) {

		StringBuilder strBuild = new StringBuilder("NoorTeck");

		System.out.println("Reverse String is = " + strBuild.reverse());

		// or we can apply this logic to reverse

		String str = "GitHub";
		// convert string to charArray using toCharArray() from string class

		char[] strArray = str.toCharArray();
		// will create new string to append
		String nStr = "";
		// now we loop from the last element of array and decrement by 1

		for (int i = strArray.length - 1; i >= 0; i--) {

			nStr = nStr + strArray[i];
		}

		System.out.println(nStr);
		System.out.println("im here ...");
		System.out.println("im here hi ...");


	}

}
