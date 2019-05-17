package com.zz.blog.entity;

// return new Result(true,StatusCode.OK,"asdfdsa")

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "返回相应数据.")
public class Result {
    @ApiModelProperty(value = "是否响应成功.")
    private boolean flag;
    @ApiModelProperty(value = "响应码,不同响应码对应不同的状态.")
    private int code;
    @ApiModelProperty(value = "响应相关信息,根据不同环境响应不同的信息.")
    private String message;
    @ApiModelProperty(value = "相应数据,一般为json.")
    private Object data;

    public Result(boolean flag, int code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, int code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
