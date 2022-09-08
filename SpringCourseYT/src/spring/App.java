package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.metrics.ApplicationStartup;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * Hello world!
 *
 */

//@EnableAutoConfiguration
//@EnableBootConfiguration
//@ComponentScan
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World  i  am here !" );
  //      ConfigurableApplicationContext run =  new ClassPathXmlApplicationContext("spring/CollectionConfig.xml");
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring/ConfigVAttribute.xml");
     //   ApplicationContext context =  new ClassPathXmlApplicationContext("spring/ConfigPSchema.xml");

        Student student=(Student) context.getBean("stud");
//        System.out.println(student.getStudId());
//        System.out.println(student.getName());
//        System.out.println(student.getStudAddress());

       Student student1=  (Student) context.getBean("stud2");

        System.out.println(student);
        System.out.println(student1);

    }
}
