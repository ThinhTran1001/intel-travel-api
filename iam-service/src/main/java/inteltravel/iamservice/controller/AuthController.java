package inteltravel.iamservice.controller;

import inteltravel.common.dto.response.MessageResponse;
import inteltravel.iamservice.constant.Constants;
import inteltravel.iamservice.dto.request.SignUpRequest;
import inteltravel.iamservice.enums.MessageCode;
import inteltravel.iamservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Author: thinhtd
 * Date: 2/6/2025
 * Time: 6:48 PM
 */
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public MessageResponse<String> signUp(@RequestBody SignUpRequest signUpRequest) {
        authService.signUp(signUpRequest);
        return new MessageResponse<>((short) HttpStatus.CREATED.value(), Constants.DEFAULT_MESSAGE_SIGN_UP_SUCCESS, LocalDateTime.now());
    }


}
