package com.smart.common.result.Listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.StandardThreadExecutor;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.lang.Nullable;

import java.nio.charset.StandardCharsets;
@Slf4j
public class KeyExpiredListener extends KeyExpirationEventMessageListener {

    public KeyExpiredListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }
    @Override
    public void onMessage(Message message, @Nullable byte[] pattern){
        /**
         * 失效key
         * massage.getbody() =  key:expired:order:id
         */
        String key = new String(message.getBody(), StandardCharsets.UTF_8);
        log.info("expired key is :{}",key);
        String channel = new String(message.getChannel(), StandardCharsets.UTF_8);
        log.info("expired key is :{}",channel);
        String pattStr = new String(pattern, StandardCharsets.UTF_8);
        log.info("expired key is :{}",pattStr);

    }
}
