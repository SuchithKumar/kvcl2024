package org.vasaviyuvajanasangha.kvcl.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
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
public class Player {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String email;
	
	@NotNull
	private String name;
	
	@NotNull
	private String gothram;
	
	@NotNull
	private String mobile;
	
	private String photo;
	
	@NotNull
	private String shirtsize;
	
	@ManyToOne
	private Team team;

	public Player(String email, String name, String gothram, String mobile, String photo,String shirtsize, Team team) {
		super();
		this.email = email;
		this.name = name;
		this.gothram = gothram;
		this.mobile = mobile;
		this.photo = photo;
		this.shirtsize = shirtsize;
		this.team = team;
	}
	
	
	
}
