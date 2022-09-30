package polyclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("human")
@Scope("prototype")
public class Human implements IHuman{


    @Autowired
    @Qualifier("PolyclinicRegistry")
    private final IRegistry registry;
    private final String name;

    public Human(IRegistry registry) {
        this.registry = registry;
        name = "Вася";
    }

    @Override
    public void visitRegistry() {
        if (registry.giveMedicalCard(name)) {
            System.out.println("Ура, нашлась моя карточка!");
        } else {
            System.out.println("Как жаль! Надо заново делать документы!");
        }
    }
}
