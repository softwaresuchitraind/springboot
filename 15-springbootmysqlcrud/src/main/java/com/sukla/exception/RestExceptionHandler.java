package com.sukla.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler
{

		@ExceptionHandler(value = NoCourseFoundException.class)
		public ResponseEntity<ApiError> handleNoCoursetFoundException()
		{
			ApiError apiError = new ApiError(404, "Course Not Found", new Date());
			return new ResponseEntity<>(apiError,HttpStatus.BAD_REQUEST);
		}
}
