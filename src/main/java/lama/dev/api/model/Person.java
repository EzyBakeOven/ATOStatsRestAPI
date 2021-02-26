package lama.dev.api.model;

import lombok.Data;
import org.bson.types.ObjectId;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Date;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@Data
public class Person {

    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private Date createdAt = new Date();
    private Boolean insurance;
    private List<Car> cars;
}
