package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="musics")
public class Music {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String genero;
	
	public Music (String name, String genero) {
		super();
		this.name = name;
		this.genero = genero;
	}
	
	public Music() {
		this("","");
	}

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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Genero [id=" + id + ", name=" + name + ", genero=" + genero + "]";
	}	
	
}
