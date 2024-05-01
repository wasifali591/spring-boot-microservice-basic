package com.example.moviecatalogservice.configuration;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolProperties;
import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixConfiguration {

    @Bean
    public HystrixCommandAspect hystrixAspect() {
        return new HystrixCommandAspect();
    }

    @Bean
    public HystrixCommandProperties.Setter defaultHystrixCommandProperties() {
        return HystrixCommandProperties.Setter()
                .withExecutionTimeoutInMilliseconds(2000)
                .withCircuitBreakerRequestVolumeThreshold(5)
                .withCircuitBreakerErrorThresholdPercentage(50)
                .withCircuitBreakerSleepWindowInMilliseconds(5000);
    }

    @Bean
    public HystrixThreadPoolProperties.Setter defaultHystrixThreadPoolProperties() {
        return HystrixThreadPoolProperties.Setter()
                .withCoreSize(20)
                .withMaxQueueSize(10);
    }

}
