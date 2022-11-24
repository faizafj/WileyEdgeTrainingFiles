package com.sg.classroster.service;

public class ClassRosterDuplicateIdException extends Exception {

    public ClassRosterDuplicateIdException(String message) {
        super(message);
    }

    public ClassRosterDuplicateIdException(String message,Throwable cause) {
        super(message, cause); //calls the main class (parent) in order to throw exception
    }

}