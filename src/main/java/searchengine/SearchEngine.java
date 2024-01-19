package searchengine;

import java.util.function.Predicate;

public class SearchEngine {
    public static void main(String[] args) {
        Product jeans = new Product("Jeans");
        jeans.setType("Model");
        jeans.setColor("White");
        jeans.setFlavour("Strawberry");
        jeans.setSize("M");
        //5 products -> to ArrayList
        StringPredicate colorFilter = new StringPredicate("color", "white");
        StringPredicate sizeFilter = new StringPredicate("size", "M");
        StringPredicate flavourFilter = new StringPredicate("flavour", "Strawberry");
        StringPredicate typeFilter = new StringPredicate("type", "Model");
        //and
        boolean test = colorFilter.and(sizeFilter).and(flavourFilter).and(typeFilter).test(jeans);
        System.out.println("Product matches criteria: " + test);
    }
    }

