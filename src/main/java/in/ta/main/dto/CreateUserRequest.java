package in.ta.main.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateUserRequest {

	@NotBlank(message = "firstName must not be blank")
    private String firstName;
	
	@NotBlank(message = "lastName must not be blank")
    private String lastName;

    public CreateUserRequest() {}

    public CreateUserRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
