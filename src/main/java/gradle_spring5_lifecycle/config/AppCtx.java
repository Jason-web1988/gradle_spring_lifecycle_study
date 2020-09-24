package gradle_spring5_lifecycle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"gradle_spring5_lifecycle.spring"})
public class AppCtx {

}
