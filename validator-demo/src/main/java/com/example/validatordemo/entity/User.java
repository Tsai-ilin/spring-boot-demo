package com.example.validatordemo.entity;

import com.example.validatordemo.MyCustomConstraint;

import javax.validation.constraints.*;
import java.io.Serializable;

public class User implements Serializable {
    private long id;

    @NotBlank(message = "name can't be null")
    @Size(min = 5, max = 10)
    private String name;

    @NotNull(message = "age can't be null")
    @Min(value = 18, message = "age min is 18")
    @Max(value = 60, message = "age max is 60")
    private Integer age;

    @Email(message = "please input email address")
    @NotBlank(message = "emil can't be null")
    private String email;

    @MyCustomConstraint
    private String answer;
}
