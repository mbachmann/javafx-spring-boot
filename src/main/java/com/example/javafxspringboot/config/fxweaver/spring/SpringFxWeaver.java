package com.example.javafxspringboot.config.fxweaver.spring;


import com.example.javafxspringboot.config.fxweaver.core.FxWeaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * SpringFxmlLoader is a Spring-powered version of FxWeaver.
 *
 * @author Rene Gielen
 */
@Component
public class SpringFxWeaver extends FxWeaver {

    @Autowired
	public SpringFxWeaver(ConfigurableApplicationContext context) {
        super(context::getBean, context::close);
    }

}
