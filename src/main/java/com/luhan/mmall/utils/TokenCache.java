package com.luhan.mmall.utils;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 用户Token的本地缓存类,后期可以使用Redis来代替本地缓存
 * @author luHan
 * @date 2019-07-25 21:59
 */
@Slf4j
public class TokenCache {
    // guava本地缓存实现类
    private static LoadingCache<String, String> tokenCache = CacheBuilder.newBuilder()
            .initialCapacity(1000).maximumSize(10000).expireAfterAccess(2L,TimeUnit.HOURS)
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(String key) throws Exception {
                    return "";
                }
            });

    /**
     * 设置Token
     * @param key Token名称
     * @param value Token值
     */
    public static void set(String key,String value){
        tokenCache.put(key,value);
    }

    /**
     * 获取Token
     * @param key Token名称
     * @return Token值
     */
    public static String get(String key){
        try {
            return tokenCache.get(key);
        } catch (ExecutionException e) {
            log.error("TokenCache get Exception:",e);
            return "";
        }
    }
}
