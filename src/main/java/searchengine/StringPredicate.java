package searchengine;

import java.util.function.Predicate;

public class StringPredicate implements Predicate <Product> {
    private String key;
    public String referenceValue;

    public StringPredicate(String key, String referenceValue) {
        this.key = key;
        this.referenceValue = referenceValue;
    }

    @Override
    public boolean test(Product product) {
        //Взять свойства передаваемого продукта и сравнить их с теми условиями, что вы передаёте
        if (product.properties.containsKey(key)) {
            String propertyValue = product.properties.get(key);

            return propertyValue.equalsIgnoreCase(referenceValue);
        }
        return false;    }
}
