import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product implements  Comparable<Product> {
    private int id;
    private String name;
    private int price;
    private double rating;


    @Override
    public int compareTo(Product o) {
        return this.price - o.price;
    }
}

