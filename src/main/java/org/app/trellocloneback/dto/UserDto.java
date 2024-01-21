package org.app.trellocloneback.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class UserDto {

    @JsonProperty
    private String userName;

    @JsonProperty
    private String password;
}
