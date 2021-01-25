package javaComposicao.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date birthDate;

	public Client() {
	}

	public Client(String name, String email, Date birthDate) {
		setName(name);
		setEmail(email);
		setBirthDate(birthDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data Client: \n");
		builder.append("---------------------------------\n");
		builder.append("Name: ");
		builder.append(this.getName() + "\n");
		builder.append("Email: ");
		builder.append(this.getEmail() + "\n");
		builder.append("Birth date: ");
		builder.append("(" + dateFormat.format(birthDate) + ")" + "\n");
		return builder.toString();
	}

}