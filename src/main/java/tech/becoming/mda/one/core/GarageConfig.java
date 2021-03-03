package tech.becoming.mda.one.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import tech.becoming.mda.one.model.garage.Gate;
import tech.becoming.mda.one.model.garage.Motor;

@Configuration
public class GarageConfig {

    @Bean
    public Gate gate() {
        return new Gate();
    }

    @Bean
    public Motor motor(Gate gate) {
        return new Motor(gate);
    }

}
