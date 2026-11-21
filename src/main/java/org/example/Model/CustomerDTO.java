package org.example.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private String name;
    private String address;
    private int age;
    private String email;
    private Integer phoneNumber;

}
