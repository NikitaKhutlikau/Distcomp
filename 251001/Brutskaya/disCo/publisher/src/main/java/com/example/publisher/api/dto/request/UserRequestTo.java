package com.example.publisher.api.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequestTo {

    private Long id;

    @Size(min = 2, max = 64)
    private String login;

    @Size(min = 8, max = 128)
    private String password;

    @Size(min = 2, max = 64)
    private String firstname;

    @Size(min = 2, max = 64)
    private String lastname;
}
