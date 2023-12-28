package com.noteapp.noteappbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class DrivingNote {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private Date date;
    private String day;

    private String time;
    private String trainingType;

    private String topic;
    private String carModel;
    private String instructor;

    private String weather;
    private int lessonHours;

    private int cost;

    private String noteDetails;


    public DrivingNote(){

    }
    public DrivingNote(long id, Date date, String day, String time, String trainingType, String topic, String carModel, String instructor, String weather, int lessonHours, int cost, String noteDetails) {
        Id = id;
        this.date = date;
        this.day = day;
        this.time = time;
        this.trainingType = trainingType;
        this.topic = topic;
        this.carModel = carModel;
        this.instructor = instructor;
        this.weather = weather;
        this.lessonHours = lessonHours;
        this.cost = cost;
        this.noteDetails = noteDetails;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getLessonHours() {
        return lessonHours;
    }

    public void setLessonHours(int lessonHours) {
        this.lessonHours = lessonHours;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNoteDetails() {
        return noteDetails;
    }

    public void setNoteDetails(String noteDetails) {
        this.noteDetails = noteDetails;
    }
}
