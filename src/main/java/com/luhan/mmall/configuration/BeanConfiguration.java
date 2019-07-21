package com.luhan.mmall.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 创建各种需要的Bean的配置类
 * @author luHan
 * @date 2019-07-21 21:46
 */
@Configuration
public class BeanConfiguration {

    /**
     * 设置上传文件的最大大小为10M
     * @return
     */
    @Bean(value = "multipartResolver")
    public MultipartResolver getMultipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(10485760);
        commonsMultipartResolver.setMaxInMemorySize(4096);
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        return commonsMultipartResolver;
    }
}
