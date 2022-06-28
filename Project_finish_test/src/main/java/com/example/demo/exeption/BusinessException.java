package com.example.demo.exeption;

import lombok.Data;
import lombok.Getter;

@Data
public class BusinessException extends RuntimeException {
    private ErrorCodeResponse errorCodeResponse;
}
