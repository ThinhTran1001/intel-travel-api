package inteltravel.iamservice.exception;


import inteltravel.common.dto.response.MessageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;

import java.time.LocalDateTime;


@Slf4j
@RestControllerAdvice
public class ExceptionTranslator implements ProblemHandling {


    /**
     * Xử lý BadRequestAlertException và
     * trả về một ResponseEntity với mã status HTTP 400 (Bad Request).
     *
     * @param ex Đối tượng BadRequestAlertException.
     * @return ResponseEntity chứa thông báo lỗi.
     */
    @ExceptionHandler(BadRequestAlertException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public MessageResponse<String> handleBadRequestAlertException(BadRequestAlertException ex) {
        return new MessageResponse<>((short) HttpStatus.BAD_REQUEST.value(), ex.getMessage(), LocalDateTime.now());

    }

    /**
     * Xử lý InternalServerErrorException và
     * trả về một ResponseEntity với mã status HTTP 500 (Internal Server Error).
     *
     * @param ex Đối tượng InternalServerErrorException.
     * @return ResponseEntity chứa thông báo lỗi.
     */
    @ExceptionHandler(InternalServerErrorException.class)
    public MessageResponse<String> handleInternalServerErrorException(InternalServerErrorException ex) {
        return new MessageResponse<>((short) HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), LocalDateTime.now());
    }

}


