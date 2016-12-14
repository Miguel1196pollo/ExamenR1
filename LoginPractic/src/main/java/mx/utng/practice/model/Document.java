package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="documents")
public class Document {
	@Id @GeneratedValue
	private Long id;
	private int documentTypeKey;
	private int repositoryKey;
	private String title;
	private int authorKey;
	private int publicationSourceKey;
	private String publicationDate;
	
	
	
	
	public Document( int documentTypeKey, int repositoryKey, String title, int authorKey,
			int publicationSourceKey, String publicationDate) {
		super();
		
		this.documentTypeKey = documentTypeKey;
		this.repositoryKey = repositoryKey;
		this.title = title;
		this.authorKey = authorKey;
		this.publicationSourceKey = publicationSourceKey;
		this.publicationDate = publicationDate;
		
	}

	public Document() {
		this(0,0," ",0,0,"");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDocumentTypeKey() {
		return documentTypeKey;
	}

	public void setDocumentTypeKey(int documentTypeKey) {
		this.documentTypeKey = documentTypeKey;
	}

	public int getRepositoryKey() {
		return repositoryKey;
	}

	public void setRepositoryKey(int repositoryKey) {
		this.repositoryKey = repositoryKey;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAuthorKey() {
		return authorKey;
	}

	public void setAuthorKey(int authorKey) {
		this.authorKey = authorKey;
	}

	public int getPublicationSourceKey() {
		return publicationSourceKey;
	}

	public void setPublicationSourceKey(int publicationSourceKey) {
		this.publicationSourceKey = publicationSourceKey;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", documentTypeKey=" + documentTypeKey + ", repositoryKey=" + repositoryKey
				+ ", title=" + title + ", authorKey=" + authorKey + ", publicationSourceKey=" + publicationSourceKey
				+ ", publicationDate=" + publicationDate + "]";
	}

		
}
