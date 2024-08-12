package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnootations {
    public static void main(String[] args) throws Exception {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println("Resultat=>"+metier.calcul());
    }
    }
