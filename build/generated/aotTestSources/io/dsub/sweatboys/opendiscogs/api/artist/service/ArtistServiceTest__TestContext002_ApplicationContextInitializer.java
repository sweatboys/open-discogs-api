package io.dsub.sweatboys.opendiscogs.api.artist.service;

import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.annotation.ImportAwareAotBeanPostProcessor;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

/**
 * {@link ApplicationContextInitializer} to restore an application context based on previous AOT processing.
 */
public class ArtistServiceTest__TestContext002_ApplicationContextInitializer implements ApplicationContextInitializer<GenericApplicationContext> {
  @Override
  public void initialize(GenericApplicationContext applicationContext) {
    DefaultListableBeanFactory beanFactory = applicationContext.getDefaultListableBeanFactory();
    beanFactory.setAutowireCandidateResolver(new ContextAnnotationAutowireCandidateResolver());
    beanFactory.setDependencyComparator(AnnotationAwareOrderComparator.INSTANCE);
    addImportAwareBeanPostProcessors(beanFactory);
    new ArtistServiceTest__TestContext002_BeanFactoryRegistrations().registerBeanDefinitions(beanFactory);
    new ArtistServiceTest__TestContext002_BeanFactoryRegistrations().registerAliases(beanFactory);
  }

  /**
   * Add ImportAwareBeanPostProcessor to support ImportAware beans
   */
  private void addImportAwareBeanPostProcessors(DefaultListableBeanFactory beanFactory) {
    Map<String, String> mappings = new HashMap<>();
    mappings.put("org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration", "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration$CglibAutoProxyConfiguration");
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ImportAwareAotBeanPostProcessor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(() -> new ImportAwareAotBeanPostProcessor(mappings));
    beanFactory.registerBeanDefinition("org.springframework.context.annotation.internalImportAwareAotProcessor", beanDefinition);
  }
}
