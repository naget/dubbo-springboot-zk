package com.tf.demo.dubbo.sb.zk.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@DubboComponentScan(basePackages = "com.tf.demo.dubbo.sb.zk.provider")
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(ProviderApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
