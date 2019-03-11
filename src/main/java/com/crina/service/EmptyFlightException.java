package com.crina.service;

public class EmptyFlightException extends RuntimeException{

    public EmptyFlightException(){
        super("empty flight");
    }
}
