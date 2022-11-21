package com.flightapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
@ResponseBody
public class ExceptionHandlerClass {
    @ExceptionHandler
    public ResponseEntity<String> handleException(ProductOrderException excep, WebRequest req){
        return new ResponseEntity<>(excep.getMessage(), HttpStatus.NOT_FOUND);
    }
}
