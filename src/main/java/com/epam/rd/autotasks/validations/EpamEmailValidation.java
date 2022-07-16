package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        return email != null && email.matches("[a-z]+_[a-z]+\\d*@epam[.]com");
    }
}





