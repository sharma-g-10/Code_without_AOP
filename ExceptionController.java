package com.shivangi.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	private Log logger = LogFactory.getLog(ExceptionController.class);
	
	@ExceptionHandler(value = RuntimeException.class)
		public String handleException(Exception ex)
		{
			logger.error("Exception ="+ex.getMessage(), ex);
			return"Exception Handled Successfully";
		}
}
