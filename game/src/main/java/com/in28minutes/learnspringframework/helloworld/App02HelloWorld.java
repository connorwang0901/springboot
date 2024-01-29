package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

    public static void main(String[] args) {


        try(//1. launch a Spring context
            var context = new AnnotationConfigApplicationContext (HelloWorldConfiguration.class)){


                //2. configure the things we want Spring to manage - @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person3"));
            System.out.println(context.getBean("person4"));
            System.out.println(context.getBean(Address.class));

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println););
            };



    }
}
