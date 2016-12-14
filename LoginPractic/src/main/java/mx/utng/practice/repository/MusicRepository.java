package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import mx.utng.practice.model.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long>{

	@Query("select inst from Music inst")
	public List<Music>findAll();
	
}
