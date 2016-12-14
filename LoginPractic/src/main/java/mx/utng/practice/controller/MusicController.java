package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;


import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Music;
import mx.utng.practice.repository.MusicRepository;

@Named
@ViewScoped
public class MusicController {
	@Autowired
	private MusicRepository musicRepository;
	private Music music = new Music();
	private List<Music> musics;
	
	private boolean editMode = false;
	
	@PostConstruct
	public void init(){
		setMusics(musicRepository.findAll());
	}
	
	public void save(){
		musicRepository.save(music);
		if(!editMode){
			getMusics().add(music);
		}
		music=new Music();
		setEditMode(false);
	}
	
	public void delete(Music music){
		musicRepository.delete(music);
		musics.remove(music);
	}
	
	public void update(Music music){
		setMusic(music);
		setEditMode(true);
	}
	
	public void cancel(){
		music = new Music();
		setEditMode(false);
	}

	public MusicRepository getMusicRepository() {
		return musicRepository;
	}

	public void setMusicRepository(MusicRepository musicRepository) {
		this.musicRepository = musicRepository;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public List<Music> getMusics() {
		return musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	


}
