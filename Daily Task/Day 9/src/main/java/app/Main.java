
package app;

import java.io.IOException;
import java.util.List;
import model.Product;
import repository.InMemoryRepository;

public class Main {

    public static void main(String[] args) {
        InMemoryRepository<Product, Integer> repository =
                new InMemoryRepository<>(Product::getId);

        ProductCsvReader reader = new ProductCsvReader();

        try {
            List<Product> products =
                    reader.readProducts("data/products.csv");

            for (Product product : products) {
                repository.save(product);
            }

            System.out.println("--- Products Loaded from CSV ---");

            for (Product product : repository.findAll()) {
                System.out.println(product);
            }

            System.out.println("\nSearch product ID 103:");

            repository.findById(103).ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Product not found.")
            );

        } catch (IOException e) {
            System.out.println("Could not read products.csv: "
                    + e.getMessage());
        }
    }
}
