package com.sanhu.exception;

/**
 * 秒杀相关的所有业务异常
 * Created by zhangbx on 16/11/27.
 */
@SuppressWarnings("serial")
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
