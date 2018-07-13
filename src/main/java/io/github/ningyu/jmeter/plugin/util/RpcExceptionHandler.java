/*
 * Copyright (c) 2018, Jiuye SCM and/or its affiliates. All rights reserved.
 */

package io.github.ningyu.jmeter.plugin.util;

import com.alibaba.dubbo.rpc.RpcException;

/**
 * RpcExceptionHandler
 */
public class RpcExceptionHandler {
    public static Response<RpcException> handle(RpcException e) {
        switch (e.getCode()){
            case RpcException.UNKNOWN_EXCEPTION:
                return Response.createResponse(ErrorCode.UNKNOWN_EXCEPTION, e);
            case RpcException.NETWORK_EXCEPTION:
                return Response.createResponse(ErrorCode.NETWORK_EXCEPTION, e);
            case RpcException.TIMEOUT_EXCEPTION:
                return Response.createResponse(ErrorCode.TIMEOUT_EXCEPTION, e);
            case RpcException.BIZ_EXCEPTION:
                return Response.createResponse(ErrorCode.BIZ_EXCEPTION, e);
            case RpcException.FORBIDDEN_EXCEPTION:
                return Response.createResponse(ErrorCode.FORBIDDEN_EXCEPTION, e);
            case RpcException.SERIALIZATION_EXCEPTION:
                return Response.createResponse(ErrorCode.SERIALIZATION_EXCEPTION, e);
            default:
                return Response.createResponse(ErrorCode.UNKNOWN_EXCEPTION, e);
        }
    }
}
