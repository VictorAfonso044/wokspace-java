package com.framework.victorafonso.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

import com.framework.victorafonso.streaming.CheckoutCreatedSource;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
//        PaymentPaidSink.class
})
public class StreamingConfig {

}
