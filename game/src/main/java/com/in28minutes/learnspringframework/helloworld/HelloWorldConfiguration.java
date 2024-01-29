package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Connor";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person person() {
        return new Person("Connor", 29, new Address("111", "222"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(),getAddress());
    }

    @Bean
    public Person person3(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person4(String name, int age,  @Qualifier("address1qualifier") Address address) {
        return new Person(name + "4", age, address);
    }

    @Bean(name = "address1")
    @Qualifier("address1qualifier")
    public Address getAddress() {
        return new Address("408 Aurora Ave  Qualified", "Seattle");
    }

    @Bean(name = "address2")
    @Primary
    public Address getAddress1() {
        return new Address("408 Aurora Ave", "Seattle");
    }
//
//    @Bean
//    public String name() {
//        return "Connor";
//    }
}
