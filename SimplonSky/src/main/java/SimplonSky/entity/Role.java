package simplonSky.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "role")

public class Role {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roles_id;
    
	@Enumerated(EnumType.STRING)
    private ERole name;

	public Role() {
		super();
	}

	public Integer getId() {
		return roles_id;
	}

	public void setId(Integer id) {
		this.roles_id = id;
	}

	
	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

}