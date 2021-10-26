package countarraysandstring;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AddStreams2 {

	public static void main(String[] args) {
		List<String> flatnum = Arrays.asList("A12", "A11", "A12", "A20", "A10", "A13", "A15", "A45", "A243", "A67",
				"A45", "B12", "B23", "B45", "B56", "C23", "C45", "D12", "D43");

		System.out.println(flatnum.stream().filter(f -> f.startsWith("A")).findFirst());
		// .findFirst returns the first number called A12 and its return type is
		// optional
		// optional is a final class
		// Optional is in java.util package
		// if we put other number or string in the f.startsWith(" ") other than flatnum
		// it will not print anything

		Optional<String> op = flatnum.stream().filter(f -> f.startsWith("A")).findFirst();
		op.ifPresent(System.out::println);
		if (op.isPresent()) {
			System.out.println("found");
		}

		System.out.println(op.orElse("90"));

		System.out.println("----------------------------------");

		// if we don't have any value in optional then it will print 90

		Optional<String> ok = flatnum.stream().filter(f -> f.startsWith("P")).findFirst();
		ok.ifPresent(System.out::println);
		if (ok.isPresent()) {
			System.out.println("found");
		}

		// in optional we have another method like orElseGet its a supplier that
		// supplies means return something
		System.out.println(ok.orElse("90"));

		System.out.println(op.orElseGet(() -> "hello"));

		Optional ofEx = Optional.of("keshav");
		Optional ofEx1 = Optional.ofNullable(null);
		System.out.println(ofEx);
		System.out.println(ofEx1);

	}

}
