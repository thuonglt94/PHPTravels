package builder;

import detail.SignUpDetail;

public class SignUpDetailBuilder {
	private String firstname;

	private String lastname;

	private String phone;

	private String email;

	private String password;

	private String confirmpassword;

	public SignUpDetailBuilder withFirstName(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public SignUpDetailBuilder withLastName(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public SignUpDetailBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public SignUpDetailBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public SignUpDetailBuilder withPassword(String password) {
		this.password = password;
		return this;
	}

	public SignUpDetailBuilder withConfirmPassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
		return this;
	}

	public  SignUpDetail build() {
		return new SignUpDetail(firstname, lastname, phone, email, password, confirmpassword);
	}
}
