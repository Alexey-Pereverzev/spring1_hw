package polyclinic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VisitDoctor {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IHuman human = context.getBean("human", IHuman.class);
        human.visitRegistry();
    }
}
