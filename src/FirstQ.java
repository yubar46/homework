import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

import static java.util.stream.Collectors.groupingBy;

public class FirstQ {

    public static void main(String[] args) {

        //first question a.
        String[] strings = {"hossein", "hassan", "ali", "mahdi", "reza", "mohammad", "ali", "hossein", "jack"};

        Map<Integer, List<String>> collect = Arrays.stream(strings)
                .collect(groupingBy(String::length));

        collect.values().forEach(System.out::print);
//first question b.
        System.out.println();

        collect.values()
                .forEach(strings1 -> strings1.add(String.valueOf(strings1.size())));
        collect.values().forEach(System.out::print);

        System.out.println();
//second question.

        BinaryOperator<Integer> averageCalculator = (a, b) -> (a + b) / 2;
        Integer average = averageCalculator.apply(10, 12);
        System.out.println(average);
//third question.
        Predicate<String> equalFirstWithEnd = s -> s.charAt(0)==s.charAt(s.length()-1);
        System.out.println(equalFirstWithEnd.test("mom"));

//fourth question.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.stream().filter(val -> val > 1).forEach(val -> System.out.println(val));
///////////
        BiPredicate<String, String> biPredicate = (s1, s2)
                -> s1.charAt(0) == s2.charAt(0) && s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1);
        System.out.println(biPredicate.test("reza", "reza"));




    }


}
