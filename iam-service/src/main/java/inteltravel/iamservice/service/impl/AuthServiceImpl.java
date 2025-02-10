package inteltravel.iamservice.service.impl;

import inteltravel.common.util.Validator;
import inteltravel.iamservice.dto.request.SignUpRequest;
import inteltravel.iamservice.enums.MessageCode;
import inteltravel.iamservice.exception.BadRequestAlertException;
import inteltravel.iamservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author: thinhtd
 * Date: 2/6/2025
 * Time: 6:52 PM
 */
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    @Override
    public void signUp(SignUpRequest request) {
        if (Validator.isNullOrBlank(request.getFirstName())) {
            throw new BadRequestAlertException(MessageCode.MSG1004);
        }

        if (Validator.isFullName(request.getFirstName())) {
            throw new BadRequestAlertException(MessageCode.MSG1007);
        }

        if (Validator.isNullOrBlank(request.getLastName())) {
            throw new BadRequestAlertException(MessageCode.MSG1005);
        }

        if (Validator.isFullName(request.getLastName())) {
            throw new BadRequestAlertException(MessageCode.MSG1008);
        }

        if (Validator.isNullOrBlank(request.getEmail())) {
            throw new BadRequestAlertException(MessageCode.MSG1006);
        }

        if (Validator.isEmail(request.getEmail())) {
            throw new BadRequestAlertException(MessageCode.MSG1018);
        }

        if (Validator.isNullOrBlank(request.getPassword())) {
            throw new BadRequestAlertException(MessageCode.MSG1013);
        }

        if (Validator.isPassword(request.getPassword())) {
            throw new BadRequestAlertException(MessageCode.MSG1014);
        }

        if (Validator.isNullOrBlank(request.getPhoneNumber())) {
            throw new BadRequestAlertException(MessageCode.MSG1010);
        }

        if (Validator.isPhoneNumber(request.getPhoneNumber())) {
            throw new BadRequestAlertException(MessageCode.MSG1011);
        }

        if (Validator.isNullOrBlank(request.getAddress())) {
            throw new BadRequestAlertException(MessageCode.MSG1012);
        }

        if (Validator.isAddress(request.getAddress())) {
            throw new BadRequestAlertException(MessageCode.MSG1009);
        }

        if (Validator.isNullOrBlank(request.getDateOfBirth())) {
            throw new BadRequestAlertException(MessageCode.MSG1015);
        }

        if (Validator.isDate(request.getDateOfBirth())) {
            throw new BadRequestAlertException(MessageCode.MSG1016);
        }

        if (Validator.isDateBeforeNow(request.getDateOfBirth())) {
            throw new BadRequestAlertException(MessageCode.MSG1019);
        }
    }
}
