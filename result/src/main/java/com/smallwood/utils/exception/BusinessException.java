package com.smallwood.utils.exception;

import com.smallwood.utils.result.ResultCode;

/**
 * @Auther smallwood
 * @Date 2019/11/5
 * @Desc 业务异常
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    //业务类型
    private String bizType;
    //业务代码
    private String bizCode;
    //错误信息
    private String message;
    //异常错误信息
    private String exceptionMessage;

    public BusinessException(ResultCode resultEnum) {
        super(resultEnum.getMessage());

        this.bizCode = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.exceptionMessage = resultEnum.getMessage();
    }

    public BusinessException(String bizType, String bizCode, String message, String exceptionMessage){
        super(message);
        this.bizType = bizType;
        this.bizCode = bizCode;
        this.message = message;
        this.exceptionMessage=exceptionMessage;
    }
    public BusinessException(String message){
        super(message);
        this.bizType = "";
        this.bizCode = "";
        this.message = message;
        this.exceptionMessage=message;
    }
    public BusinessException(String message, String exceptionMessage){
        super(message);
        this.bizType = "";
        this.bizCode = "";
        this.message = message;
        this.exceptionMessage=exceptionMessage;
    }
}
