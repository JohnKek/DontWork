package spring_intro;


import org.springframework.stereotype.Component;

//@Component("dogBean")
public class Dog implements Pet{
private String name;
    @Override
    public void say(){
        System.out.println("bow-bow");
    }

    public Dog() {
        System.out.println("Dog");
    }
    public void init(){
        System.out.println("Dog init");
    }
    public void destroy(){
        System.out.println("Dog destroy");
    }

}
