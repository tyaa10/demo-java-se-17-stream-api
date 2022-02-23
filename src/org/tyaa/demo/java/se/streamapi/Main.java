package org.tyaa.demo.java.se.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    // final List integers = List.of(1, 2, 3, -100, 0, 10, 20, 6, 5);
        // integers.stream()
            // .sorted(new CustomIntComparator())
            // .forEach(new CustomPrintConsumer());
            /* .sorted(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            }).forEach(new Consumer() {
                @Override
                public void accept(Object o) {
                    System.out.printf("Result: %s\n", o);
                }
            }); */
            /* .sorted(FuncInterfacesImpl::compareInt)
            .forEach(FuncInterfacesImpl::consumerPrint); */
            /* .sorted((o1, o2) -> (Integer) o1 - (Integer) o2)
            .forEach(o -> System.out.printf("Result: %s\n", o)); */
            // .sorted(Comparator.comparingInt(o -> (Integer) o))
            // .forEach(System.out::println);

        final List<Integer> integers = List.of(1, 2, 3, -100, 0, 10, 20, 6, 5);
        /* final List<String> processedIntegers =
            integers.stream()
                .filter(integer -> integer > 0)
                .sorted(Comparator.comparingInt(o -> o))
                .map(integer -> String.format("Result: %s", integer))
                .limit(4)
                .skip(1)
                .toList();
            // .forEach(System.out::println);
        System.out.println(processedIntegers); */
        final Optional<Integer> aggregatedIntegers =
            integers.stream()
                .filter(integer -> integer > 0)
                .reduce(Integer::sum);
        /* if (aggregatedIntegers.isPresent()) {
            System.out.printf("Sum: %s", aggregatedIntegers.get());
        } */
        aggregatedIntegers.ifPresent(integer -> System.out.printf("Sum: %s", integer));
    }
}
