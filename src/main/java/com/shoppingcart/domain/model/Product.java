package com.shoppingcart.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Rating {
        private Double rate;
        private Integer count;
    }
}
