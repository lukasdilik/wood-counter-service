package sk.lesy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.lesy.entity.ConfigurationBean;

/**
 * Created by osk11072 on 14. 2. 2017.
 */
@Configuration
@EnableConfigurationProperties
public class WoodsConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "config")
    public ConfigurationBean configurationBean() {
        return new ConfigurationBean();
    }
}

