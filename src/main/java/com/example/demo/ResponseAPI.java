package com.example.demo;

import java.io.Serializable;

public class ResponseAPI implements Serializable {
    public Integer code;
    public String message;
    public Object data;
    public Object error;

    public ResponseAPI(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
