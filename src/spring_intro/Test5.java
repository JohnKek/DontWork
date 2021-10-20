package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2");
        Dog dog1 = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
        dog1.say();
        dog2.say();
        context.close();
    }

}
