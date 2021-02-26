package lama.dev.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
    private String brand;
    private String model;
    private Float maxSpeedKmH;
}
