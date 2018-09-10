package net.netasystems.main;

import net.netasystems.business.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio #2 de Spring");
    //    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\NS-396\\Desktop\\applicationContext.xml");
        Programmer prgm1 = context.getBean("osvaldo", Programmer.class);
        Programmer prgm2 = context.getBean("masterProgrammer", Programmer.class);
        System.out.println("El programador #1 lo hace en: "+prgm1.hackTheWorld()+ prgm1.Theworld());
        System.out.println("El programador #2 lo hace en: "+prgm2.hackTheWorld()+ prgm2.Theworld());
    }

}
