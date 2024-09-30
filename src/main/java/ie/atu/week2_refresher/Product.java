package ie.atu.week2_refresher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @NotNull(message = "Name cannot be null")
    private Long id;

    @NotNull(message = "Name cannot be null")
    private String name;

    @Positive(message = "Price must be positive")
    private Double price;
}
