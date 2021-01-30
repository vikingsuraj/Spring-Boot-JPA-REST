package spring.boot.payroll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Employee {

	@Id
	@Column
	private Long id;

	@Column
	private String name;

	@Column
	private String role;

	public Employee(Long id, String name, String role) {

		this.id = id;
		this.name = name;
		this.role = role;
	}

}
