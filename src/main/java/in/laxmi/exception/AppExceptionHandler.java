package in.laxmi.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e) {
		String exMsg = e.getMessage();
		ErrorInfo info = new ErrorInfo();
		info.setCode("c304");
		info.setMsg(exMsg);
		info.setWhen(LocalDate.now());
		return new ResponseEntity<ErrorInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleException(UserNotFoundException e) {
		String exMsg = e.getMessage();
		ErrorInfo info = new ErrorInfo();
		info.setCode("c304");
		info.setMsg(exMsg);
		info.setWhen(LocalDate.now());
		return new ResponseEntity<ErrorInfo>(info, HttpStatus.BAD_REQUEST);
	}
}
