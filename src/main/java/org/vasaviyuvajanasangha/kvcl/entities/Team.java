package org.vasaviyuvajanasangha.kvcl.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Team {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String captain;
	
	@NotNull
	private String email;
	
	@NotNull
	private String mobile;
	
	@NotNull
	private String requireAccomodation;
	
	@NotNull
	private String requireFood;
	
	@OneToMany
	@JoinColumn(name = "team")
	private List<Player> players;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Team [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", captain=");
		builder.append(captain);
		builder.append(", email=");
		builder.append(email);
		builder.append(", mobile=");
		builder.append(mobile);
		builder.append(", requireAccomodation=");
		builder.append(requireAccomodation);
		builder.append(", requireFood=");
		builder.append(requireFood);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
