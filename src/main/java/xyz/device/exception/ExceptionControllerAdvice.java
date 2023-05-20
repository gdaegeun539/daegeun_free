package xyz.device.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Component
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Map> NPEHandle(NullPointerException e) {
        Map<String, String> map = new HashMap<>();
        map.put("error", "internal server error");
        return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(DataUpdateException.class)
    public ResponseEntity<Map> dataUpdateHandle(DataUpdateException e) {

        HashMap<String, String> map = new HashMap<>();
        map.put("error", "bad request");
        return ResponseEntity.badRequest().body(map);
    }
}
