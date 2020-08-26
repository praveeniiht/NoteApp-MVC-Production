package com.iiht.yaksha.juniorfsd.juniorfsd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;


@Service
@Transactional
public interface NotesService {
	
	// This method is to get All notes 
	public List<Notes> getAllNodes();
	
	
	
	// This method is to insert a new note
	public boolean insertNote(Notes note);
	
	
	//This method is to deletea a note 
	public Boolean deleteNote(Long id);
	
	
	// This method sis to retreive a note by its Noteid
	//public Notes getNoteById(Integer id);
	
	public Long updateNote(Notes note);



	public Optional<Notes> getNoteById(Long id);
	
	

}
