package io.dsub.sweatboys.opendiscogs.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.ReactivePageableHandlerMethodArgumentResolver;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurationSupport;
import org.springframework.web.reactive.result.method.annotation.ArgumentResolverConfigurer;

@Configuration(proxyBeanMethods = false)
public class PageableWebFluxConfiguration extends WebFluxConfigurationSupport {

  @Override
  public void configureArgumentResolvers(ArgumentResolverConfigurer configurer) {
    var resolver = new ReactivePageableHandlerMethodArgumentResolver();
    resolver.setOneIndexedParameters(true);
    resolver.setMaxPageSize(30);
    configurer.addCustomResolver(resolver);
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/webjars/**") // setup webjar pattern to match our springdoc webjar.
        .addResourceLocations("classpath:META-INF/resources/webjars/") // this is the path we are interested in
        .resourceChain(false);
    registry.addResourceHandler("/**") // Matcher for default, static resources (default configs)
        .addResourceLocations(
            "classpath:META-INF/resources/",
            "classpath:resources/",
            "classpath:static/",
            "classpath:public/")
        .resourceChain(false);
  }
}
