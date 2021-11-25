package trilha.back.financys.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerRest {

    @ExceptionHandler(DivisaoZeroException.class)
    public ResponseEntity<?> divisaoZero(DivisaoZeroException exception){

        BuilderExceptions exceptions = new BuilderExceptions(exception.getMessage());
        return new ResponseEntity<>(exceptions, HttpStatus.NOT_ACCEPTABLE);

    }


}
