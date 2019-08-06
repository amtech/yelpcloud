package com.evol.manage.config;

import com.config.RibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "yelp-provider-usc", configuration = RibbonConfig.class)
public class TestRibbonCustomConfig {

}
