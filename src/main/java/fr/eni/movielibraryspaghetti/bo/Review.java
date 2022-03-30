package fr.eni.movielibraryspaghetti.bo;

import java.util.Objects;

public class Review {

	// Class Attributes
	private long id;
	private int score;
	private String comments;
	// Associations
	private Member reviewer;

	public Review() {
	}

	public Review(long id, int score, String comments, Member reviewer) {
		super();
		this.id = id;
		this.score = score;
		this.comments = comments;
		this.reviewer = reviewer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Member getReviewer() {
		return reviewer;
	}

	public void setReviewer(Member reviewer) {
		this.reviewer = reviewer;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", score=" + score + ", comments=" + comments + ", reviewer=" + reviewer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, id, reviewer, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(comments, other.comments) && id == other.id && Objects.equals(reviewer, other.reviewer)
				&& score == other.score;
	}
	
	
}
