package com.iiht.yaksha.juniorfsd.juniorfsd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;



@Repository
@Service
public interface NotesRepository extends JpaRepository<Notes,Long> {

}
