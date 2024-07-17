package org.vasaviyuvajanasangha.kvcl.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Login {

	@Id
	private String username;
	
	@NotNull
	@Size(min = 8)
	private String password;

	private String type;
	
	@OneToOne
	private Team team;
	
}
