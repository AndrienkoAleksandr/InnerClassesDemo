package org.eclipse.che.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LyambdaOuterClass {
    public static class LyambdaContainer {
        public List<Integer> lyambdaSort() {
            Stream<Integer> intStream = Stream.of(1, 10, 100, 1000);
            List<Integer> result = intStream.sorted((elem1, elem2) -> {
                String v = "compare";
                return Integer.compare(elem1, elem2);
            })
            .collect(Collectors.toList());
            return null;
        }
    }
}
