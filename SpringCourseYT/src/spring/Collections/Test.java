package spring.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
 ApplicationContext context = new ClassPathXmlApplicationContext("spring/Collections/CollectionConfig.xml");
  Emp e=(Emp) context.getBean("emp1");
        System.out.println(e);
        System.out.println(e.getName());
        System.out.println(e.getPhone());
        System.out.println(e.getAddress());
        System.out.println(e.getCourse());
        System.out.println(e.getProps());
    }
}

