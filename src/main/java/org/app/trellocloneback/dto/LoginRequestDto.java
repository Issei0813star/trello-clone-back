import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequestDto {
    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public LoginRequestDto() {
    }

    public LoginRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
