package com.tdevilleduc.urthehero.core.exceptions;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class PersonInternalErrorException extends RuntimeException {
    public PersonInternalErrorException(String s) {
        super(s);
    }
}