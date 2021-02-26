package lama.dev.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private int number;
    private String street;
    private String postcode;
    private String city;
    private String country;
}
