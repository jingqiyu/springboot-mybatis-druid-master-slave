package learn.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ServletComponentScan // 自动扫描servlet页面 否则将找不到druid的后台页面
@EnableAsync // 允许异步
public class Application implements EmbeddedServletContainerCustomizer{
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

    // 自定义servlete
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8080);
    }
}
