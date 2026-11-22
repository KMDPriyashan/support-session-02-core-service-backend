package org.example.Model;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private String name;
    private String description;
    private int stockAmount;
    private String price;
}
