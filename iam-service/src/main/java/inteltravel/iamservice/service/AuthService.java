package inteltravel.iamservice.service;

import inteltravel.iamservice.dto.request.SignUpRequest;

/**
 * Author: thinhtd
 * Date: 2/6/2025
 * Time: 6:51 PM
 */
public interface AuthService {

    void signUp(SignUpRequest signUpRequest);
}
