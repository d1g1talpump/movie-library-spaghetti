package fr.eni.movielibraryspaghetti.bo;

import java.util.Objects;

public class Genre {
	
	//Class Attributes
	private long id;
	private String label;
	
	public Genre() {
	}
	
	public Genre(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", label=" + label + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		return id == other.id && Objects.equals(label, other.label);
	}
}
