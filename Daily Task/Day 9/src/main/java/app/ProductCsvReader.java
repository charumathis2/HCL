
package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductCsvReader {

    public List<Product> readProducts(String filePath)
            throws IOException {

        List<Product> products = new ArrayList<>();

        try (BufferedReader reader =
                     Files.newBufferedReader(Path.of(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Skip empty lines and the CSV header.
                if (line.isBlank()
                        || line.trim().toLowerCase().startsWith("id,")) {
                    continue;
                }

                String[] parts = line.split(",");

                if (parts.length != 3) {
                    throw new IOException("Invalid CSV row: " + line);
                }

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim());

                products.add(new Product(id, name, price));
            }
        }

        return products;
    }
}
