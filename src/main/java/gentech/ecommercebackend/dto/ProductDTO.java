package gentech.ecommercebackend.dto;

import gentech.ecommercebackend.model.Category;
import lombok.Data;


@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
