package gary.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_person")
public class Person {
 
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
 
    @Column(name = "name", nullable = false)
    private String name;
 
    @Column(name = "email")
    private String email;
 
    @Column(name = "password")
    private String password;
 
    @Column(name = "mobile")
    private String mobile;
 
    private transient String confirmPassword;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Person() {
		super();
	}
 
    // Getters and Setters
    
    
}
