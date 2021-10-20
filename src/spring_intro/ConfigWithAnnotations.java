package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ConCon");
        Cat cat=context.getBean("catBean",Cat.class);
        context.close();


    }
}
