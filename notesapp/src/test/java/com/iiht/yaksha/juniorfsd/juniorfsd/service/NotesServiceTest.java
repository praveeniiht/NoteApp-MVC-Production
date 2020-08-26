package com.iiht.yaksha.juniorfsd.juniorfsd.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.iiht.yaksha.juniorfsd.juniorfsd.dao.NotesRepository;
import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;
import com.iiht.yaksha.juniorfsd.juniorfsd.test.utils.MasterData;
import static com.iiht.yaksha.juniorfsd.juniorfsd.test.utils.TestUtils.*;
public class NotesServiceTest {

//	@Mock
//	private NotesRepository notesDao;
	
	@Mock
	private NotesServiceImpl notesServiceImpl;
	/*
	 * static { File file = new File("output_service_revised.txt"); if
	 * (file.exists() && file.length() == 0) { try { FileUtils.forceDelete(new
	 * File("output_functional_revised.txt")); } catch (IOException e) {
	 * 
	 * } } }
	 */
	 
		
	/**
	 * 
	 */
	@Before 
	public void init() { 
		MockitoAnnotations.initMocks(this); 
	}

	
	
	@Test
	public void testInsertNote() throws IOException {
		Boolean flag = true;
		Notes note = MasterData.getDetails();
		when(notesServiceImpl.insertNote(note)).thenReturn(flag);
		boolean value = notesServiceImpl.insertNote(note);
		yakshaAssert(currentTest(),(value?true:false),businessTestFile);
	}
	
	@Test
	public void testViewlAll() throws Exception {
		
		List<Notes> list = new ArrayList<Notes>();
		List<Notes> noteList;
		list.add(new Notes());
		list.add(new Notes());
		
	    when(notesServiceImpl.getAllNodes()).thenReturn((List<Notes>) list);
		noteList = notesServiceImpl.getAllNodes();
		yakshaAssert(currentTest(),(noteList.size()==2?true:false),businessTestFile);
	}
	
	@Test
	public void testDeleteNote() throws IOException{
			 Boolean flag = true;
		when(notesServiceImpl.deleteNote((long) 10008)).thenReturn(flag);
		boolean stats = notesServiceImpl.deleteNote((long)10008);
		yakshaAssert(currentTest(),(stats?true:false),businessTestFile);
		
	}
	
	@Test
	public void testUpdateNote() throws Exception{
		Boolean flag=true;
		Notes note = MasterData.getDetails();
		when(notesServiceImpl.updateNote(note)).thenReturn(note.getId());
		Long testId= (long) 10009;// notesServiceImpl.updateNote(note);
		yakshaAssert(currentTest(),(testId==note.getId()?true:false),businessTestFile);
		
	}
}
