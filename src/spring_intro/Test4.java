package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2");
        Dog dog1 = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
        context.close();


    }
}
