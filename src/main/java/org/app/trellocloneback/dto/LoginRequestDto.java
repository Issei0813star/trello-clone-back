package org.app.trellocloneback.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequestDto {
    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    public LoginRequestDto() {
    }

    public LoginRequestDto(String username, String password) {
        this.userName = userName;
        this.password = password;
    }
}
