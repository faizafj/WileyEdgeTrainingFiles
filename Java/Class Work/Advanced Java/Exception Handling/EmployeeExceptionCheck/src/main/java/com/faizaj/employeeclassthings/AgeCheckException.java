/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.employeeclassthings;

public class AgeCheckException extends RuntimeException { //Extends runtime exception which is 'default'.

    public AgeCheckException(String message) { //param = message string 
        super(message); //inherits the message from RunTimeException
    }
}
