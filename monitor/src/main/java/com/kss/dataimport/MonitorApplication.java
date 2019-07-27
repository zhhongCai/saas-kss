package com.kss.dataimport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-26 10:08
 * @Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
