package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXml {
    public static void main(String[] args) throws Exception {
    ApplicationContext context =new ClassPathXmlApplicationContext("applicatonContext.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println("resultat=>"+metier.calcul());
    }
    }
