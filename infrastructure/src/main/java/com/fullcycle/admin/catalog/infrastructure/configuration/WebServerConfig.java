package com.fullcycle.admin.catalog.infrastructure.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fullcycle.admin.catalog")

//Bean do spring é uma classe java a qual ele vai instanciar e gerar provavelmente
// um singleton e usar para injetar em outras classes que dependem
public class WebServerConfig {
}
