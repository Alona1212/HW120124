package searchengine;

import java.util.function.Predicate;

public class PredicateCompoundExample {
    public static void main(String[] args) {

            Predicate<String> stringPredicate1 = s -> s.startsWith("S"); //Начинается ли слово с буквы S
            Predicate <String> stringPredicate2 = s -> s.contains("K"); //Содержит ли слово букву К
            //Найти строку начинающуюся с S и содержащую K
            boolean result1 = stringPredicate1.and(stringPredicate2).test("Hello ");
            System.out.println(result1);

            boolean result2 = stringPredicate1.and(stringPredicate2).test("SKate ");
            System.out.println(result2);

    }
}
