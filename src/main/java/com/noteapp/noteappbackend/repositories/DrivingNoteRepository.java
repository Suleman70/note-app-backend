package com.noteapp.noteappbackend.repositories;

import com.noteapp.noteappbackend.entities.DrivingNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrivingNoteRepository extends JpaRepository<DrivingNote, Long> {
}
