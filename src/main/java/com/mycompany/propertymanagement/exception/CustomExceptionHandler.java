package com.mycompany.propertymanagement.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorModel>> handleFieldValidation(MethodArgumentNotValidException manv) {
        List<ErrorModel> errorModels = new ArrayList<>();
        ErrorModel errorModel = null;
        List<FieldError> fieldError = manv.getBindingResult().getFieldErrors();

        for (FieldError fe: fieldError ) {

            logger.info("Error occurred {} {}", fe.getField(), fe.getCode());

            errorModel = new ErrorModel();
            errorModel.setCode(fe.getField());
            errorModel.setMessage(fe.getDefaultMessage());
            errorModels.add(errorModel);
        }
        return new ResponseEntity<List<ErrorModel>>(errorModels, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<List<ErrorModel>> handleBusinessException(BusinessException bex) {
        System.out.println("Business Exception has occurred");

        for (ErrorModel er: bex.getErrors()) {
            logger.info("Business exception has occurred {} {}", er.getCode(), er.getMessage());
        }

        return new ResponseEntity<List<ErrorModel>>(bex.getErrors(), HttpStatus.BAD_REQUEST);
    }

}
