package com.luhan.mmall.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 服务器响应数据的基础类
 * @author luHan
 * @date 2019-07-21 22:42
 */
// 保证序列化对象的时候,如果对象是null,key也会消失,不会加入JSON中
//@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ServerResponse<T> implements Serializable {
    private final static ServerResponse DEFAULT_ERROR_RESPONSE = new ServerResponse(500,"失败",null);
    /**响应状态*/
    private int status;
    /**响应信息*/
    private String message;
    /**响应数据*/
    private T data;

    /**
     * 响应成功
     * @param data 响应数据
     */
    public static <T> ServerResponse success(T data){
        return new ServerResponse<>(200,"成功",data);
    }

    /**
     * 响应成功
     * @param message 描述
     */
    public static <T> ServerResponse<T> success(String message){
        return new ServerResponse<>(200,message,null);
    }

    /**
     * 响应成功
     * @param message 描述
     * @param data 响应数据
     */
    public static <T> ServerResponse<T> success(String message,T data){
        return new ServerResponse<>(200,message,data);
    }

    /**基础的响应失败的返回:{status:500,message:"失败"}*/
    public static ServerResponse fail(){
        return DEFAULT_ERROR_RESPONSE;
    }

    /**
     * 传入响应失败构建响应数据类
     * @param message 失败信息
     */
    public static ServerResponse fail(String message){
        return new ServerResponse(500,message,null);
    }
}
