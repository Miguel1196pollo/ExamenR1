package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;


import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Document;
import mx.utng.practice.model.Music;
import mx.utng.practice.repository.DocumentRepository;
import mx.utng.practice.repository.MusicRepository;

@Named
@ViewScoped
public class DocumentController {
	@Autowired
	private DocumentRepository documentRepository;
	private Document document = new Document();
	private List<Document> documents;
	
	private boolean editMode = false;
	
	@PostConstruct
	public void init(){
		setDocuments(documentRepository.findAll());
	}
	
	public void save(){
		documentRepository.save(document);
		if(!editMode){
			getDocuments().add(document);
		}
		document=new Document();
		setEditMode(false);
	}
	
	public void delete(Document document){
		documentRepository.delete(document);
		documents.remove(document);
	}
	
	public void update(Document document){
		setDocument(document);
		setEditMode(true);
	}
	
	public void cancel(){
		document = new Document();
		setEditMode(false);
	}

	public DocumentRepository getDocumentRepository() {
		return documentRepository;
	}

	public void setDocumentRepository(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

}
