package com.d.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author d
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public String errorHandler(HttpServletRequest request, Exception e) {
		return e.getMessage();
	}

	@ExceptionHandler(BindException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String validateErrorHandler(BindException e) {
		BindingResult bindingResult = e.getBindingResult();
		if (bindingResult.hasErrors()) {
			StringBuilder errs = new StringBuilder();
			for (FieldError er : bindingResult.getFieldErrors()) {
				errs.append(er.getField() + " 字段错误，错误原因:" + er.getDefaultMessage() + ";");
			}
			return errs.toString();
		} else {
			return e.getMessage();
		}
	}
}
