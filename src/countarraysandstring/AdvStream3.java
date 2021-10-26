package countarraysandstring;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AdvStream3 {

	public static void main(String[] args) {
		// program to find out sum of n numbers
		// in here the return type for IntStream is Optioanl
		// import OptionalInt

		OptionalInt sum = IntStream.rangeClosed(1, 10).reduce((x, y) -> x + y);
		System.out.println(sum);// Optional[55]
		System.out.println(sum.getAsInt());// 55
	}

}
