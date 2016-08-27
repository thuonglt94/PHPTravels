package detail;

public class SignUpDetail {
	private String firstname;

	private String lastname;

	private String phone;

	private String email;

	private String password;

	private String confirmpassword;

	public SignUpDetail(String firstname, String lastname, String phone, String email, String password,
			String confirmpassword) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmpassword;
	}

}
