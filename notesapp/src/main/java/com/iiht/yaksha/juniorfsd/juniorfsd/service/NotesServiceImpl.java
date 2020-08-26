package com.iiht.yaksha.juniorfsd.juniorfsd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.iiht.yaksha.juniorfsd.juniorfsd.dao.NotesRepository;
import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;

@Service
@Transactional
public class NotesServiceImpl implements NotesService{
	
	@Autowired
	private NotesRepository notesRepo;

	@Override
	public List<Notes> getAllNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertNote(Notes note) {
		return false;
		
	}
	
	@Override
	public Boolean deleteNote(Long id) {
		return false;
	}
	

	

	@Override
	public Long updateNote(Notes note) {
		return (long) 0;
	}

	@Override
	public Optional<Notes> getNoteById(Long id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	

	
	

}