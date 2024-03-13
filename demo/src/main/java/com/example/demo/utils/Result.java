package com.example.demo.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    public Integer code;
    public String msg;
    public Object data;

    public void setCode(Integer i) {
        this.code = i;
    }
    public void setMsg(String msg ) {
        this.msg = msg;
    }
    public void setData(Object obj) {
        this.data = obj;
    }

    public static Result build(Integer code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public String  getMsg() {
        return this.msg;
    }
}
