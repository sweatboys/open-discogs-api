package org.springframework.boot.autoconfigure.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import java.lang.Class;
import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.jackson.JsonComponentModule;
import org.springframework.boot.jackson.JsonMixinModule;
import org.springframework.boot.jackson.JsonMixinModuleEntries;
import org.springframework.context.ApplicationContext;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Bean definitions for {@link JacksonAutoConfiguration}
 */
public class JacksonAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonAutoConfiguration'
   */
  public static BeanDefinition getJacksonAutoConfigurationBeanDefinition() {
    Class<?> beanType = JacksonAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JacksonAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonComponentModule'.
   */
  private static BeanInstanceSupplier<JsonComponentModule> getJsonComponentModuleInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JsonComponentModule>forFactoryMethod(JacksonAutoConfiguration.class, "jsonComponentModule")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.class).jsonComponentModule());
  }

  /**
   * Get the bean definition for 'jsonComponentModule'
   */
  public static BeanDefinition getJsonComponentModuleBeanDefinition() {
    Class<?> beanType = JsonComponentModule.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJsonComponentModuleInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration}
   */
  public static class JacksonObjectMapperBuilderConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'jacksonObjectMapperBuilderConfiguration'
     */
    public static BeanDefinition getJacksonObjectMapperBuilderConfigurationBeanDefinition() {
      Class<?> beanType = JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonObjectMapperBuilder'.
     */
    private static BeanInstanceSupplier<Jackson2ObjectMapperBuilder> getJacksonObjectMapperBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<Jackson2ObjectMapperBuilder>forFactoryMethod(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration.class, "jacksonObjectMapperBuilder", ApplicationContext.class, List.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration.class).jacksonObjectMapperBuilder(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'jacksonObjectMapperBuilder'
     */
    public static BeanDefinition getJacksonObjectMapperBuilderBeanDefinition() {
      Class<?> beanType = Jackson2ObjectMapperBuilder.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setScope("prototype");
      beanDefinition.setInstanceSupplier(getJacksonObjectMapperBuilderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonObjectMapperConfiguration}
   */
  public static class JacksonObjectMapperConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'jacksonObjectMapperConfiguration'
     */
    public static BeanDefinition getJacksonObjectMapperConfigurationBeanDefinition() {
      Class<?> beanType = JacksonAutoConfiguration.JacksonObjectMapperConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonObjectMapperConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonObjectMapper'.
     */
    private static BeanInstanceSupplier<ObjectMapper> getJacksonObjectMapperInstanceSupplier() {
      return BeanInstanceSupplier.<ObjectMapper>forFactoryMethod(JacksonAutoConfiguration.JacksonObjectMapperConfiguration.class, "jacksonObjectMapper", Jackson2ObjectMapperBuilder.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.JacksonObjectMapperConfiguration.class).jacksonObjectMapper(args.get(0)));
    }

    /**
     * Get the bean definition for 'jacksonObjectMapper'
     */
    public static BeanDefinition getJacksonObjectMapperBeanDefinition() {
      Class<?> beanType = ObjectMapper.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setPrimary(true);
      beanDefinition.setInstanceSupplier(getJacksonObjectMapperInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration}
   */
  public static class Jackson2ObjectMapperBuilderCustomizerConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'jackson2ObjectMapperBuilderCustomizerConfiguration'
     */
    public static BeanDefinition getJacksonObjectMapperBuilderCustomizerConfigurationBeanDefinition(
        ) {
      Class<?> beanType = JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'standardJacksonObjectMapperBuilderCustomizer'.
     */
    private static BeanInstanceSupplier<JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.StandardJackson2ObjectMapperBuilderCustomizer> getStandardJacksonObjectMapperBuilderCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.StandardJackson2ObjectMapperBuilderCustomizer>forFactoryMethod(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.class, "standardJacksonObjectMapperBuilderCustomizer", JacksonProperties.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.class).standardJacksonObjectMapperBuilderCustomizer(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'standardJacksonObjectMapperBuilderCustomizer'
     */
    public static BeanDefinition getStandardJacksonObjectMapperBuilderCustomizerBeanDefinition() {
      Class<?> beanType = JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.StandardJackson2ObjectMapperBuilderCustomizer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getStandardJacksonObjectMapperBuilderCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.ParameterNamesModuleConfiguration}
   */
  public static class ParameterNamesModuleConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'parameterNamesModuleConfiguration'
     */
    public static BeanDefinition getParameterNamesModuleConfigurationBeanDefinition() {
      Class<?> beanType = JacksonAutoConfiguration.ParameterNamesModuleConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.ParameterNamesModuleConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'parameterNamesModule'.
     */
    private static BeanInstanceSupplier<ParameterNamesModule> getParameterNamesModuleInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ParameterNamesModule>forFactoryMethod(JacksonAutoConfiguration.ParameterNamesModuleConfiguration.class, "parameterNamesModule")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.ParameterNamesModuleConfiguration.class).parameterNamesModule());
    }

    /**
     * Get the bean definition for 'parameterNamesModule'
     */
    public static BeanDefinition getParameterNamesModuleBeanDefinition() {
      Class<?> beanType = ParameterNamesModule.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getParameterNamesModuleInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonMixinConfiguration}
   */
  public static class JacksonMixinConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'jacksonMixinConfiguration'
     */
    public static BeanDefinition getJacksonMixinConfigurationBeanDefinition() {
      Class<?> beanType = JacksonAutoConfiguration.JacksonMixinConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonMixinConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance for 'jsonMixinModuleEntries'.
     */
    private static JsonMixinModuleEntries getJsonMixinModuleEntriesInstance() {
      return JsonMixinModuleEntries.create((mixins) -> {
      } );
    }

    /**
     * Get the bean definition for 'jsonMixinModuleEntries'
     */
    public static BeanDefinition getJsonMixinModuleEntriesBeanDefinition() {
      Class<?> beanType = JsonMixinModuleEntries.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonMixinConfiguration__BeanDefinitions::getJsonMixinModuleEntriesInstance);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jsonMixinModule'.
     */
    private static BeanInstanceSupplier<JsonMixinModule> getJsonMixinModuleInstanceSupplier() {
      return BeanInstanceSupplier.<JsonMixinModule>forFactoryMethod(JacksonAutoConfiguration.JacksonMixinConfiguration.class, "jsonMixinModule", ApplicationContext.class, JsonMixinModuleEntries.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.JacksonMixinConfiguration.class).jsonMixinModule(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'jsonMixinModule'
     */
    public static BeanDefinition getJsonMixinModuleBeanDefinition() {
      Class<?> beanType = JsonMixinModule.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getJsonMixinModuleInstanceSupplier());
      return beanDefinition;
    }
  }
}
