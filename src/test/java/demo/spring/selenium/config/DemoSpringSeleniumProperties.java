package demo.spring.selenium.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Data
@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
public class DemoSpringSeleniumProperties {

  @Value("${host}")
  private String host;

  @Value("${browser}")
  private String browser;

  @Value("${context}")
  private String context;

}
