package polyclinic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("medicalCard")
@Scope("prototype")
public class MedicalCard implements IDocument {
    String name;
    String content;

    public MedicalCard() {
        this.name = "Вася";
        this.content = "Полностью здоров";
    }

    public String getName() {
        return name;
    }

    @Override
    public void getContent() {
        System.out.println("Это медицинская карточка гражданина " + name + "" + ".\n" +
                "История болезней: " + content);
    }
}
