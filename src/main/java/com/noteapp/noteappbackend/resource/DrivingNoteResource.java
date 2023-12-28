package com.noteapp.noteappbackend.resource;


import com.noteapp.noteappbackend.entities.DrivingNote;
import com.noteapp.noteappbackend.repositories.DrivingNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/NoteResource")
@CrossOrigin(origins = "http://localhost:4200")
public class DrivingNoteResource {


    private final DrivingNoteRepository noteRepo;

    @Autowired //Doing Dependency Injection
    public DrivingNoteResource(DrivingNoteRepository noteRepo) {
        this.noteRepo = noteRepo;
    }

    //Getting All Notes
    @RequestMapping("/notes")
    public List<DrivingNote> getNotes(){
        return noteRepo.findAll();
    }

    //Getting Single Note by ID
    @RequestMapping("/note/{id}")
    public DrivingNote getNote(@PathVariable Long id){
        return noteRepo.findById(id).orElseThrow(); //Remember this is Optional Type
    }

    //Saving a Note
    @PostMapping("/note")
    public DrivingNote newNote(@RequestBody DrivingNote newDrivingNote){

        return noteRepo.save(newDrivingNote);
    }

    //Updating a Note
    @PutMapping("/note")
    public DrivingNote editNote(@RequestBody DrivingNote updateDrivingNote) {

        return noteRepo.findById(updateDrivingNote.getId()).map(drivingNote -> {
            drivingNote.setNoteDetails(updateDrivingNote.getNoteDetails());

            drivingNote.setDate(updateDrivingNote.getDate());
            drivingNote.setDay(updateDrivingNote.getDay());
            drivingNote.setTime(updateDrivingNote.getTime());
            drivingNote.setInstructor(updateDrivingNote.getInstructor());
            drivingNote.setWeather(updateDrivingNote.getWeather());
            drivingNote.setCost(updateDrivingNote.getCost());
            drivingNote.setWeather(updateDrivingNote.getWeather());
            drivingNote.setTrainingType(updateDrivingNote.getTrainingType());
            drivingNote.setTopic(updateDrivingNote.getTopic());


            drivingNote.setCarModel(updateDrivingNote.getCarModel());
            drivingNote.setLessonHours(updateDrivingNote.getLessonHours());
            return noteRepo.save(drivingNote);
        }).orElseGet(() -> {
            updateDrivingNote.setId(updateDrivingNote.getId());
            return noteRepo.save(updateDrivingNote);
        });

    }

    //Deleting a Note
    @DeleteMapping("/note/{id}")
    public void deleteNote(@PathVariable Long id){
        noteRepo.deleteById(id);
    }




}
