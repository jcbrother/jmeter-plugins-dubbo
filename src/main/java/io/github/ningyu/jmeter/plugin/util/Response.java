/*
 * Copyright (c) 2018, Jiuye SCM and/or its affiliates. All rights reserved.
 */

package io.github.ningyu.jmeter.plugin.util;

import java.io.Serializable;

/**
 * Response<T>
 */
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -3268511596088515757L;
    private String code = "";
    private String message = "";
    private T items = null;

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(ErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public Response(ErrorCode code, T items) {
        this(code);
        this.items = items;
    }

    public Response(T items) {
        this.items = items;
    }

    public static <T> Response<T> createResponse(String code, String message) {
        return new Response<T>(code, message);
    }

    public static <T> Response<T> createResponse(ErrorCode code) {
        return new Response<T>(code);
    }

    public static <T> Response<T> createResponse(T t) {
        return new Response<T>(t);
    }

    public static <T> Response<T> createResponse(ErrorCode code, T t) {
        return new Response<T>(code, t);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }
}
