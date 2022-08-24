package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L; 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "birthday")
	private String birthday;
	@Column(name = "hiring_date")
	private String hiring_date;
	@Column(name = "salary")
	private double salary;

	public Employee(String us, String ps, String bi, String hi, double sa) {
		this.username = us;
		this.password = ps;
		this.birthday = bi;
		this.hiring_date=hi;
		this.salary = sa;
	}
	
	public Employee() {
		
	}

	public Employee(int i, String us, String ps, String bi, String hi, double sa) {
		this.id=i;
		this.username = us;
		this.password = ps;
		this.birthday = bi;
		this.hiring_date=hi;
		this.salary = sa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHiring_date() {
		return hiring_date;
	}

	public void setHiring_date(String hiring_date) {
		this.hiring_date = hiring_date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", birthday=" + birthday
				+ ", hiring_date=" + hiring_date + ", salary=" + salary + "]";
	}


}
