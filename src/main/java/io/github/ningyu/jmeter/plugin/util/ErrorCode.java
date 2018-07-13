/*
 * Copyright (c) 2018, Jiuye SCM and/or its affiliates. All rights reserved.
 */

package io.github.ningyu.jmeter.plugin.util;

/**
 * ErrorCode
 */
public enum ErrorCode {

    MISS_INTERFACE("MISS_INTERFACE","Interface is empty!"),
    RETRIES_ERROR("RETRIES_ERROR","retries is empty or NumberFormat error!"),
    TIMEOUT_ERROR("TIMEOUT_ERROR","timeout is empty or NumberFormat error!"),
    CONNECTIONS_ERROR("CONNECTIONS_ERROR","connections is empty or NumberFormat error!"),
    GENERIC_SERVICE_IS_NULL("GENERIC_SERVICE_IS_NULL","Not found exported service: {0}, may be version or group mismatch!"),
    MISS_METHOD("MISS_METHOD","Method is empty!"),
    MISS_ADDRESS("MISS_ADDRESS","Address is empty!"),
    UNKNOWN_EXCEPTION("UNKNOWN_EXCEPTION","UnknownException!"),
    NETWORK_EXCEPTION("NETWORK_EXCEPTION","NetworkException!"),
    TIMEOUT_EXCEPTION("TIMEOUT_EXCEPTION","TimeoutException!"),
    BIZ_EXCEPTION("BIZ_EXCEPTION","BizException!"),
    FORBIDDEN_EXCEPTION("FORBIDDEN_EXCEPTION","ForbiddenException!"),
    SERIALIZATION_EXCEPTION("SERIALIZATION_EXCEPTION","SerializationException!"),
    ;

    String code;
    String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
