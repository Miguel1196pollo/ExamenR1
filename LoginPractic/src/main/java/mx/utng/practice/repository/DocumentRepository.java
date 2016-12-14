package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Document;
import mx.utng.practice.model.Music;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long>{

	@Query("select document from Document document")
	public List<Document>findAll();
	
}
